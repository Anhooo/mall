package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallBrand;
import org.cch.mall.db.domain.MallBrandExample;

public interface MallBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    long countByExample(MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int deleteByExample(MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int insert(MallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int insertSelective(MallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    MallBrand selectOneByExample(MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    MallBrand selectOneByExampleSelective(@Param("example") MallBrandExample example, @Param("selective") MallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    List<MallBrand> selectByExampleSelective(@Param("example") MallBrandExample example, @Param("selective") MallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    List<MallBrand> selectByExample(MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    MallBrand selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    MallBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    MallBrand selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}