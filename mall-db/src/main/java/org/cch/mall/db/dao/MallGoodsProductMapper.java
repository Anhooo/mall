package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallGoodsProduct;
import org.cch.mall.db.domain.MallGoodsProductExample;

public interface MallGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    long countByExample(MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int deleteByExample(MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int insert(MallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int insertSelective(MallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    MallGoodsProduct selectOneByExample(MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    MallGoodsProduct selectOneByExampleSelective(@Param("example") MallGoodsProductExample example, @Param("selective") MallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    List<MallGoodsProduct> selectByExampleSelective(@Param("example") MallGoodsProductExample example, @Param("selective") MallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    List<MallGoodsProduct> selectByExample(MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    MallGoodsProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    MallGoodsProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    MallGoodsProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}