package annotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("annotation/service/product.xml");
		
	
		//ProductServiceGeneral, ProductService12, ProductService05 (3개의 객체)
		//ProductDAO, ProductVO
		ProductService service1 = factory.getBean("service1",ProductService.class);
		ProductService service2 = factory.getBean("service2",ProductService.class);
		ProductService service3 = factory.getBean("service3",ProductService.class);
		
		ProductVO result1 = service1.sell();
		System.out.println("===========노세일기간============");
		System.out.println(result1);
		System.out.println("==================-============");
		ProductVO result2 = service2.sell();
		System.out.println("===========5월 세일============");
		System.out.println(result2);
		System.out.println("==================-============");
		ProductVO result3 = service3.sell();
		System.out.println("===========12월 세일=============");
		System.out.println(result3);
		System.out.println("==================-============");
		
		//toString 자동호출

		/*
		 * 
		 * System.out.println(result1.hashCode());
		 * System.out.println(result2.hashCode());
		 * System.out.println(result3.hashCode());
		 */
	}
}
