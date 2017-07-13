package com.nongke.base.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nongke.base.domain.BaseEntity;
import com.nongke.base.domain.BaseExample;
import com.nongke.base.service.BaseService;
import com.nongke.common.Constants;
import com.nongke.common.Page;

/**
 * 
 */
public abstract class BaseServiceImpl<T extends BaseEntity, Example extends BaseExample>
        implements BaseService<T, Example> {
	@Override
    public Map<String, Object> add(T baseEntity) {
            Date date = new Date();
            baseEntity.setModifiedDate(date);
            baseEntity.setCreatedDate(date);
            getEntityMapper().insertSelective(baseEntity);
            Integer entityId = baseEntity.getId();
            Map<String, Object> map = new HashMap<String, Object>();
            if (entityId != null) {
                map.put("id", entityId);
                map.put(Constants.SUCCESS, true);
                map.put(Constants.MESSAGE, "新增成功!");
            } else {
                map.put(Constants.SUCCESS, false);
                map.put(Constants.MESSAGE, "新增失败，没有返回主键，请检查mapper，并回滚数据!");
            }
            return map;
        }

        @Override
        public Map<String, Object> update(T baseEntity, Example example) {
            Map<String, Object> map = new HashMap<String, Object>();
            Date date = new Date();
            baseEntity.setModifiedDate(date);
            int i = getEntityMapper().updateByExampleSelective(baseEntity, example);
            map.put(Constants.CHANGE_NUMBER, i);
            if (i > 0) {
                map.put(Constants.SUCCESS, true);
                map.put(Constants.MESSAGE, "修改成功!");
            } else {
                map.put(Constants.SUCCESS, false);
                map.put(Constants.MESSAGE, "没有修改任意一行数据!");
            }
            return map;
        }

        /**
         * 更具主键修改实体
         * 
         * @param t
         * @return
         */
        @Override
        public Map<String, Object> updateByPrimaryKey(T baseEntity) {
            Map<String, Object> map = new HashMap<String, Object>();
            Date date = new Date();
            baseEntity.setModifiedDate(date);
            int i = getEntityMapper().updateByPrimaryKey(baseEntity);
            map.put(Constants.CHANGE_NUMBER, i);
            if (i == 1) {
                map.put(Constants.SUCCESS, true);
                map.put(Constants.MESSAGE, "修改成功!");
            } else {

                map.put(Constants.SUCCESS, false);
                map.put(Constants.MESSAGE, "修改失败，请检查数据及mapper，并回滚数据!");
            }
            return map;
        }

        /**
         * 更具主键修改实体（修改不为null的属性）
         * 
         * @param t
         * @return
         */
        @Override
        public Map<String, Object> updateByPrimaryKeySelective(T baseEntity) {
            Map<String, Object> map = new HashMap<String, Object>();
            Date date = new Date();
            baseEntity.setModifiedDate(date);
            int i = getEntityMapper().updateByPrimaryKeySelective(baseEntity);
            map.put(Constants.CHANGE_NUMBER, i);
            if (i == 1) {
                map.put(Constants.SUCCESS, true);
                map.put(Constants.MESSAGE, "修改成功!");
            } else {
                map.put(Constants.SUCCESS, false);
                map.put(Constants.MESSAGE, "修改失败，请检查数据及mapper，并回滚数据!");
            }
            return map;
        }

        @Override
        /**
         * 翻页方法
         */
        public Page<T> getPage(Page<T> page, Example example) {
            Integer offset = page.getOffset();
            Integer limit = page.getLimit();
            //从多少开始
            if (offset == null) {
                offset = 0;
                page.setOffset(0);
            }
            // 每页显示的数量
            if (limit == null) {
                // 默认每页显示的数量
                limit = 20;
                page.setLimit(20);
            }
            page.setTotal(getEntityMapper().countByExample(example));
            example.setLimitStart(offset);
            example.setLimitOffset(limit);
            List<T> resultList = getEntityMapper().selectByExample(example);
            //如果list中没有数据 并且  page.getOffset() - page.getLimit() >= 0
            // 如果当前页没有数据 且不是第一页 ---- 删除时出现问题 则显示上一页数据
            if (resultList.size() == 0 && limit > 0 && offset - limit >= 0) {
                offset=((Long)page.getTotal()).intValue()-limit;
                example.setLimitStart(offset);
                resultList = getEntityMapper().selectByExample(example);
            }
            page.setRows(resultList);
            return page;
        }
        
        
        /**
         * 滚动翻页方法
         */
        public Page<T> getPageScroll(Page<T> page, Example example) {
            Integer offset = page.getOffset();
            Integer limit = page.getLimit();
            //从多少开始
            if (offset == null) {
                offset = 0;
                page.setOffset(0);
            }
            // 每页显示的数量
            if (limit == null) {
                // 默认每页显示的数量
                limit = 20;
                page.setLimit(20);
            }
            page.setTotal(getEntityMapper().countByExample(example));
            example.setLimitStart(offset);
            example.setLimitOffset(limit);
            
            List<T> resultList = getEntityMapper().selectByExample(example);
            //如果list中没有数据 并且  page.getOffset() - page.getLimit() >= 0
            // 如果当前页没有数据 且不是第一页 ---- 删除时出现问题 则显示上一页数据
           /* if (resultList.size() == 0 && limit > 0 && offset - limit >= 0) {
                offset=offset-limit;
                example.setLimitStart(offset);
                resultList = getEntityMapper().selectByExample(example);
            }*/
            page.setRows(resultList);
            return page;
        }

        @Override
        /**
         * 直接取得List
         */
        public List<T> getList(Example example) {
            List<T> resultList = getEntityMapper().selectByExample(example);
            return resultList;
        }

        @Override
        public Map<String, Object> delByPrimaryKey(Integer entityId) {
            int result = getEntityMapper().deleteByPrimaryKey(entityId);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put(Constants.CHANGE_NUMBER, result);
            if (result == 1) {
                map.put(Constants.SUCCESS, true);
                map.put(Constants.MESSAGE, "物理删除成功!");
            } else {
                map.put(Constants.SUCCESS, false);
                map.put(Constants.MESSAGE, "物理删除失败，请检查数据及mapper，并回滚数据!");
            }
            return map;
        }

        @Override
        public T selectByPrimaryKey(Integer entityId) {
            return getEntityMapper().selectByPrimaryKey(entityId);
        }

        @Override
        public Map<String, Object> deleteByExample(Example example) {
            Map<String, Object> map = new HashMap<String, Object>();
            int delCount = getEntityMapper().deleteByExample(example);
            map.put(Constants.SUCCESS, true);
            map.put(Constants.CHANGE_NUMBER, delCount);
            return map;
        }

        @Override
        public int countByExample(Example example) {
            return getEntityMapper().countByExample(example);
        }

        @Override
        public int insertSelective(T baseEntity) {
            return getEntityMapper().insertSelective(baseEntity);
        }}
