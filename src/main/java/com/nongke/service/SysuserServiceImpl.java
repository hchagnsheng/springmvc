package com.nongke.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nongke.base.mapper.BaseMapper;
import com.nongke.base.service.impl.BaseServiceImpl;
import com.nongke.domain.Sysuser;
import com.nongke.domain.SysuserExample;
import com.nongke.mapper.SysuserMapper;


@Service
public class SysuserServiceImpl extends BaseServiceImpl<Sysuser, SysuserExample> {

	@Autowired
    private SysuserMapper sysuserMapper;
   

    @Override
    public Class<Sysuser> getEntityClass() {
        return Sysuser.class;
    }

    @Override
    public BaseMapper<Sysuser, SysuserExample> getEntityMapper() {
        return sysuserMapper;
    }

    
}
