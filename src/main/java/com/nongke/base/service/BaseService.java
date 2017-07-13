package com.nongke.base.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.nongke.base.mapper.BaseMapper;
import com.nongke.common.Page;


public abstract interface BaseService<BaseEntity extends Serializable, Example> {

    public abstract Class<BaseEntity> getEntityClass();
    /**
     * 取得dao
     * 
     * @return
     */
    public abstract BaseMapper<BaseEntity, Example> getEntityMapper();

    /**
     * 新增对象
     * 
     * @param t
     * @return
     */
    public abstract Map<String, Object> add(BaseEntity  baseEntity);

    /**
     * 修改对象
     * 
     * @param t
     * @return
     */
    public abstract Map<String, Object> update(BaseEntity baseEntity, Example example);

    /**
     * 分页取得对象
     * 
     * @param page
     * @param t
     * @return
     */
    public abstract Page<BaseEntity> getPage(Page<BaseEntity> page, Example example);
    
    /**
     * 手机端滚动分页
     * @param page
     * @param example
     * @return
     */
    public abstract Page<BaseEntity> getPageScroll(Page<BaseEntity> page, Example example);
    
    
    

    /**
     * 取得全部对象
     * 
     * @param t
     * @return
     */
    public abstract List<BaseEntity> getList(Example example);

    /**
     * 根据Id删除
     * 
     * @param entity_id
     * @return
     */
    public abstract Map<String, Object> delByPrimaryKey(Integer entityId);

    /**
     * 根据ID查询
     * 
     * @param entity_id
     * @return
     */
    public abstract BaseEntity selectByPrimaryKey(Integer entityId);

    /**
     * 条件删除
     * 
     * @param example
     * @return
     */
    public abstract Map<String, Object> deleteByExample(Example example);

    /**
     * 根据条件查询总数
     * 
     * @param e
     * @return
     */
    public abstract int countByExample(Example example);
    
    /**
     * 新增
     * @param t
     * @return
     */
    public abstract int insertSelective(BaseEntity baseEntity);
    /**
     * 根据主键更新
     * @param baseEntity
     * @return
     */
    public Map<String, Object> updateByPrimaryKeySelective(BaseEntity baseEntity);
    /**
     * 根据主键更新所有字段
     * @param baseEntity
     * @return
     */
    public Map<String, Object> updateByPrimaryKey(BaseEntity baseEntity);

}
