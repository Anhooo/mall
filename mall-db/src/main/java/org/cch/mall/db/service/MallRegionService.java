package org.cch.mall.db.service;

import com.github.pagehelper.PageHelper;
import org.cch.mall.db.dao.MallRegionMapper;
import org.cch.mall.db.domain.MallRegion;
import org.cch.mall.db.domain.MallRegionExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MallRegionService {

    @Resource
    private MallRegionMapper regionMapper;

    public List<MallRegion> getAll(){
        MallRegionExample example = new MallRegionExample();
        byte b = 4;
        example.or().andTypeNotEqualTo(b);
        return regionMapper.selectByExample(example);
    }

    public List<MallRegion> queryByPid(Integer parentId) {
        MallRegionExample example = new MallRegionExample();
        example.or().andPidEqualTo(parentId);
        return regionMapper.selectByExample(example);
    }

    public MallRegion findById(Integer id) {
        return regionMapper.selectByPrimaryKey(id);
    }

    public List<MallRegion> querySelective(String name, Integer code, Integer page, Integer size, String sort, String order) {
        MallRegionExample example = new MallRegionExample();
        MallRegionExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (!StringUtils.isEmpty(code)) {
            criteria.andCodeEqualTo(code);
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return regionMapper.selectByExample(example);
    }

}
