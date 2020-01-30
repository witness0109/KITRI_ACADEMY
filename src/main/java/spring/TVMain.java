package spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String obj = sc.next();

		// spring factory api 이용
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring/tvspring.xml");
		// <bean id = "tv" class="spring.LGTV">
		// TV tv = (TV) factory.getBean(obj);
		TV tv =  factory.getBean(obj, TV.class);
		
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.BavelBBova();
		tv.powerOff();

	}

}
