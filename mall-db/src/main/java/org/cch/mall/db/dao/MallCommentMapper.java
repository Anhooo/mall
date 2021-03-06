package org.cch.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallComment;
import org.cch.mall.db.domain.MallCommentExample;

public interface MallCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    long countByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int deleteByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int insert(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int insertSelective(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    MallComment selectOneByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    MallComment selectOneByExampleSelective(@Param("example") MallCommentExample example, @Param("selective") MallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    List<MallComment> selectByExampleSelective(@Param("example") MallCommentExample example, @Param("selective") MallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    List<MallComment> selectByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    MallComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    MallComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    MallComment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallComment record, @Param("example") MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallComment record, @Param("example") MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}