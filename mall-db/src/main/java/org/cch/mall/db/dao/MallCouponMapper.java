package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallCoupon;
import org.cch.mall.db.domain.MallCouponExample;

public interface MallCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    long countByExample(MallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int deleteByExample(MallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int insert(MallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int insertSelective(MallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    MallCoupon selectOneByExample(MallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    MallCoupon selectOneByExampleSelective(@Param("example") MallCouponExample example, @Param("selective") MallCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    List<MallCoupon> selectByExampleSelective(@Param("example") MallCouponExample example, @Param("selective") MallCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    List<MallCoupon> selectByExample(MallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    MallCoupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    MallCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    MallCoupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallCoupon record, @Param("example") MallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallCoupon record, @Param("example") MallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_coupon
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}