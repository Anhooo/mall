package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallStorage;
import org.cch.mall.db.domain.MallStorageExample;

public interface MallStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    long countByExample(MallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int deleteByExample(MallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int insert(MallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int insertSelective(MallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    MallStorage selectOneByExample(MallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    MallStorage selectOneByExampleSelective(@Param("example") MallStorageExample example, @Param("selective") MallStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    List<MallStorage> selectByExampleSelective(@Param("example") MallStorageExample example, @Param("selective") MallStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    List<MallStorage> selectByExample(MallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    MallStorage selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    MallStorage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    MallStorage selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallStorage record, @Param("example") MallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallStorage record, @Param("example") MallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_storage
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}