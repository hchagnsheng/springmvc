package com.nongke.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper<BaseEntity, Example> {

    /**
     * 根据查询条件计数
     * 
     * @param example
     * @return
     */
    int countByExample(Example example);

    /**
     * 根据条件删除
     * 
     * @param example
     * @return
     */
    int deleteByExample(Example example);

    /**
     * 根据主键删除
     * 
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增
     * 
     * @param record
     * @return
     */
    int insert(BaseEntity record);

    /**
     * 新增
     * 
     * @param record
     * @return
     */
    int insertSelective(BaseEntity record);

    /**
     * 根据条件查询
     * 
     * @param example
     * @return
     */
    List<BaseEntity> selectByExample(Example example);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    BaseEntity selectByPrimaryKey(Integer id);

    /**
     * 条件更新 example为条件
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") BaseEntity record, @Param("example") Example example);

    /**
     * 条件更新 example为条件
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") BaseEntity record, @Param("example") Example example);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(BaseEntity record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(BaseEntity record);
}
