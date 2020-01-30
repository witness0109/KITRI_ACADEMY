package exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("exam1/test.xml");
		
		//생성객체 확인 = spring bean 확인 
		String[] names = factory.getBeanDefinitionNames(); // <bean id="" <-요걸
		for(String name : names) {
			System.out.println(name);
		}
		
		/*
		 * TestService test = factory.getBean("test", TestService.class); // dao, vo 다
		 * 만들어짐 / xml에 설정함
		 * 
		 * TestVO vo = test.test(); /// TestDAO, TestVO
		 * 
		 * System.out.println(vo.getMember1() + " : " + vo.getMember2());
		 */

	}
}
