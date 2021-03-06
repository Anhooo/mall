package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallFootprint;
import org.cch.mall.db.domain.MallFootprintExample;

public interface MallFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    long countByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int insert(MallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int insertSelective(MallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    MallFootprint selectOneByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    MallFootprint selectOneByExampleSelective(@Param("example") MallFootprintExample example, @Param("selective") MallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    List<MallFootprint> selectByExampleSelective(@Param("example") MallFootprintExample example, @Param("selective") MallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    List<MallFootprint> selectByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    MallFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    MallFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    MallFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallFootprint record, @Param("example") MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallFootprint record, @Param("example") MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}