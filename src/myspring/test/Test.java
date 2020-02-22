package myspring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myspring.beans.BeanA;

public class Test {
	@org.junit.Test
	public void testA() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//BeanA beanA=(BeanA)applicationContext.getBean("beanA");
		
		BeanA beanA=applicationContext.getBean(BeanA.class);
		System.out.println(beanA);
	}

}
