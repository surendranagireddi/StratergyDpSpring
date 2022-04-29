package com.java.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.java.component.Flipkart;

public class StratergyPatternTest {
	
	public static void main(String[] args) {
		
		//create IOC container 
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/java/configs/applicationContext.xml");
		
		//get target spring bean class obj
		Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
		
		// invoke b.method
		String msg  = fpkt.shopping(new String[] {"shirt","trouser","pant"}, new double[] {1000.0,3000.0,900.0});
		System.out.println(msg);
		
	}

}
