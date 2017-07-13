package springmvc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nongke.domain.Sysuser;
import com.nongke.service.SysuserServiceImpl;
import com.sun.istack.internal.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class TestMyBatis {
	 private static Logger logger = Logger.getLogger(TestMyBatis.class);  
	 @Resource  
	    private SysuserServiceImpl userService;  
	  
	  
	    @Test  
	    public void test1() {  
	    	Sysuser sysuser = userService.selectByPrimaryKey(1);
	    	System.out.println(sysuser.getLoginName());
	    }

}
