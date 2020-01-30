package annotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {



		// spring factory api 이용
		ApplicationContext factory = new ClassPathXmlApplicationContext("annotation/tvspring.xml");
		// <context

		/*
		 * String[] names = factory.getBeanDefinitionNames(); for (String name : names)
		 * { System.out.println(name); }
		 */

		// <bean id = "tv" class="spring.LGTV">
		// TV tv = (TV) factory.getBean(obj);

		TV tv = factory.getBean("LGTV", TV.class);

		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.BavelBBova();
		tv.powerOff();

	}

}
