package com.nongke.base.domain;

/**
 * 翻页基本查询条件
 * @author hcs
 *
 */
public interface BaseExample {
    
    public void setLimitStart(int limitStart);

    public int getLimitStart();

    public void setLimitOffset(int limitOffset);

    public int getLimitOffset();
}
