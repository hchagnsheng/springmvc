package com.nongke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nongke.domain.Sysuser;
import com.nongke.service.SysuserServiceImpl;

@Controller  
@RequestMapping(value = "user")
public class SysuserController {

	@Autowired 
    private SysuserServiceImpl userService;  
    /**
     * 获取用户信息
    * @Title: toIndex
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @return    设定文件
    * @return ModelAndView    返回类型
    * @throws
     */
	@RequestMapping(value="getuser")
    public ModelAndView toIndex(){ 
    	ModelAndView modelAndView = new ModelAndView("indextest");
        int userId = 1;  
        Sysuser user = userService.selectByPrimaryKey(userId);  
        modelAndView.addObject("user", user);
        return modelAndView;  
    }
}
