package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallAdmin;
import org.cch.mall.db.domain.MallAdminExample;

public interface MallAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    long countByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int deleteByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int insert(MallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int insertSelective(MallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    MallAdmin selectOneByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    MallAdmin selectOneByExampleSelective(@Param("example") MallAdminExample example, @Param("selective") MallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    List<MallAdmin> selectByExampleSelective(@Param("example") MallAdminExample example, @Param("selective") MallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    List<MallAdmin> selectByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    MallAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    MallAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    MallAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallAdmin record, @Param("example") MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallAdmin record, @Param("example") MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}