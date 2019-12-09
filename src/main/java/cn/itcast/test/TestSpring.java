package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdf
 * @create: 2019-12-08 23:47
 **/
public class TestSpring {

	@Test
	public void test1(){

		//加载配置文件
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		//获取对象
		AccountService as= (AccountService) ac.getBean("accountService");

		//调用方法
		as.findAll();
	}

}
