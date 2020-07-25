package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallSystem;
import org.cch.mall.db.domain.MallSystemExample;

public interface MallSystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    long countByExample(MallSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int deleteByExample(MallSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int insert(MallSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int insertSelective(MallSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    MallSystem selectOneByExample(MallSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    MallSystem selectOneByExampleSelective(@Param("example") MallSystemExample example, @Param("selective") MallSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    List<MallSystem> selectByExampleSelective(@Param("example") MallSystemExample example, @Param("selective") MallSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    List<MallSystem> selectByExample(MallSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    MallSystem selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    MallSystem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    MallSystem selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallSystem record, @Param("example") MallSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallSystem record, @Param("example") MallSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_system
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}