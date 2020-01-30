package config.bean.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {

		// spring factory api 이용
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/bean/spring/tvspring.xml");
		// <bean id = "tv" class="spring.LGTV">
		// TV tv = (TV) factory.getBean(obj);
		
		for(String n : factory.getBeanDefinitionNames()) {
			System.out.println("-->"+n);
		}
		
		
		TV tv =  factory.getBean("getTV", TV.class);
		
		
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.BavelBBova();
		tv.powerOff();

		
		
	}

}
