package org.cch.mall.db.service;

import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.dao.GoodsProductMapper;
import org.cch.mall.db.dao.MallGoodsProductMapper;
import org.cch.mall.db.domain.MallGoodsProduct;
import org.cch.mall.db.domain.MallGoodsProductExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallGoodsProductService {
    @Resource
    private MallGoodsProductMapper mallGoodsProductMapper;
    @Resource
    private GoodsProductMapper goodsProductMapper;

    public List<MallGoodsProduct> queryByGid(Integer gid) {
        MallGoodsProductExample example = new MallGoodsProductExample();
        example.or().andGoodsIdEqualTo(gid).andDeletedEqualTo(false);
        return mallGoodsProductMapper.selectByExample(example);
    }

    public MallGoodsProduct findById(Integer id) {
        return mallGoodsProductMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        mallGoodsProductMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(MallGoodsProduct goodsProduct) {
        goodsProduct.setAddTime(LocalDateTime.now());
        goodsProduct.setUpdateTime(LocalDateTime.now());
        mallGoodsProductMapper.insertSelective(goodsProduct);
    }

    public int count() {
        MallGoodsProductExample example = new MallGoodsProductExample();
        example.or().andDeletedEqualTo(false);
        return (int) mallGoodsProductMapper.countByExample(example);
    }

    public void deleteByGid(Integer gid) {
        MallGoodsProductExample example = new MallGoodsProductExample();
        example.or().andGoodsIdEqualTo(gid);
        mallGoodsProductMapper.logicalDeleteByExample(example);
    }

    public int addStock(Integer id, Short num){
        return goodsProductMapper.addStock(id, num);
    }

    public int reduceStock(Integer id, Short num){
        return goodsProductMapper.reduceStock(id, num);
    }

    public void updateById(MallGoodsProduct product) {
        product.setUpdateTime(LocalDateTime.now());
        mallGoodsProductMapper.updateByPrimaryKeySelective(product);
    }
}