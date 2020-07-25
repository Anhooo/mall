package org.cch.mall.db.service;

import com.github.pagehelper.PageHelper;
import org.cch.mall.db.dao.MallFootprintMapper;
import org.cch.mall.db.domain.MallFootprint;
import org.cch.mall.db.domain.MallFootprintExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallFootprintService {
    @Resource
    private MallFootprintMapper footprintMapper;

    public List<MallFootprint> queryByAddTime(Integer userId, Integer page, Integer size) {
        MallFootprintExample example = new MallFootprintExample();
        example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        example.setOrderByClause(MallFootprint.Column.addTime.desc());
        PageHelper.startPage(page, size);
        return footprintMapper.selectByExample(example);
    }

    public MallFootprint findById(Integer id) {
        return footprintMapper.selectByPrimaryKey(id);
    }

    public MallFootprint findById(Integer userId, Integer id) {
        MallFootprintExample example = new MallFootprintExample();
        example.or().andIdEqualTo(id).andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return footprintMapper.selectOneByExample(example);
    }

    public void deleteById(Integer id) {
        footprintMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(MallFootprint footprint) {
        footprint.setAddTime(LocalDateTime.now());
        footprint.setUpdateTime(LocalDateTime.now());
        footprintMapper.insertSelective(footprint);
    }

    public List<MallFootprint> querySelective(String userId, String goodsId, Integer page, Integer size, String sort, String order) {
        MallFootprintExample example = new MallFootprintExample();
        MallFootprintExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(userId)) {
            criteria.andUserIdEqualTo(Integer.valueOf(userId));
        }
        if (!StringUtils.isEmpty(goodsId)) {
            criteria.andGoodsIdEqualTo(Integer.valueOf(goodsId));
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return footprintMapper.selectByExample(example);
    }
}
