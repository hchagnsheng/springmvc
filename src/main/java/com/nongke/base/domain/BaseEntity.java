package com.nongke.base.domain;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 
 * @author   qius
 * @date     2017年1月13日 下午1:18:11
 * @describe 基类
 */
public class BaseEntity implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;
    // 主键
    private Integer id;
    //排序方式
    private String order;
    //排序方式
    private String mode;
    //从第几个开始
    private Integer offset;
    //每页显示多少个
    private Integer limit;
    //创建人
    private Integer createdBy;
    //创建时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createdDate;
    //修改人
    private Integer modifiedBy;
    //修改时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date modifiedDate;
    //逻辑删除状态
    private String isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
