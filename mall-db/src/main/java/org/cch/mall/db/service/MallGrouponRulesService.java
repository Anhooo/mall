package org.cch.mall.db.service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import org.cch.mall.db.dao.MallGoodsMapper;
import org.cch.mall.db.dao.MallGrouponRulesMapper;
import org.cch.mall.db.domain.MallGoods;
import org.cch.mall.db.domain.MallGrouponRules;
import org.cch.mall.db.domain.MallGrouponRulesExample;
import org.cch.mall.db.util.GrouponConstant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MallGrouponRulesService {
    @Resource
    private MallGrouponRulesMapper mapper;
    @Resource
    private MallGoodsMapper goodsMapper;
    private MallGoods.Column[] goodsColumns = new MallGoods.Column[]{MallGoods.Column.id, MallGoods.Column.name, MallGoods.Column.brief, MallGoods.Column.picUrl, MallGoods.Column.counterPrice, MallGoods.Column.retailPrice};

    public int createRules(MallGrouponRules rules) {
        rules.setAddTime(LocalDateTime.now());
        rules.setUpdateTime(LocalDateTime.now());
        return mapper.insertSelective(rules);
    }

    /**
     * 根据ID查找对应团购项
     *
     * @param id
     * @return
     */
    public MallGrouponRules findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 查询某个商品关联的团购规则
     *
     * @param goodsId
     * @return
     */
    public List<MallGrouponRules> queryByGoodsId(Integer goodsId) {
        MallGrouponRulesExample example = new MallGrouponRulesExample();
        example.or().andGoodsIdEqualTo(goodsId).andStatusEqualTo(GrouponConstant.RULE_STATUS_ON).andDeletedEqualTo(false);
        return mapper.selectByExample(example);
    }

    public int countByGoodsId(Integer goodsId) {
        MallGrouponRulesExample example = new MallGrouponRulesExample();
        example.or().andGoodsIdEqualTo(goodsId).andStatusEqualTo(GrouponConstant.RULE_STATUS_ON).andDeletedEqualTo(false);
        return (int)mapper.countByExample(example);
    }

    public List<MallGrouponRules> queryByStatus(Short status) {
        MallGrouponRulesExample example = new MallGrouponRulesExample();
        example.or().andStatusEqualTo(status).andDeletedEqualTo(false);
        return mapper.selectByExample(example);
    }

    /**
     * 获取首页团购规则列表
     *
     * @param page
     * @param limit
     * @return
     */
    public List<MallGrouponRules> queryList(Integer page, Integer limit) {
        return queryList(page, limit, "add_time", "desc");
    }

    public List<MallGrouponRules> queryList(Integer page, Integer limit, String sort, String order) {
        MallGrouponRulesExample example = new MallGrouponRulesExample();
        example.or().andStatusEqualTo(GrouponConstant.RULE_STATUS_ON).andDeletedEqualTo(false);
        example.setOrderByClause(sort + " " + order);
        PageHelper.startPage(page, limit);
        return mapper.selectByExample(example);
    }

    /**
     * 判断某个团购规则是否已经过期
     *
     * @return
     */
    public boolean isExpired(MallGrouponRules rules) {
        return (rules == null || rules.getExpireTime().isBefore(LocalDateTime.now()));
    }

    /**
     * 获取团购规则列表
     *
     * @param goodsId
     * @param page
     * @param size
     * @param sort
     * @param order
     * @return
     */
    public List<MallGrouponRules> querySelective(String goodsId, Integer page, Integer size, String sort, String order) {
        MallGrouponRulesExample example = new MallGrouponRulesExample();
        example.setOrderByClause(sort + " " + order);

        MallGrouponRulesExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(goodsId)) {
            criteria.andGoodsIdEqualTo(Integer.parseInt(goodsId));
        }
        criteria.andDeletedEqualTo(false);

        PageHelper.startPage(page, size);
        return mapper.selectByExample(example);
    }

    public void delete(Integer id) {
        mapper.logicalDeleteByPrimaryKey(id);
    }

    public int updateById(MallGrouponRules grouponRules) {
        grouponRules.setUpdateTime(LocalDateTime.now());
        return mapper.updateByPrimaryKeySelective(grouponRules);
    }
}