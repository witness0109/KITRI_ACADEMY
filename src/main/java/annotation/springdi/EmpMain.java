package annotation.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("annotation/springdi/di.xml");
		
		//bean태그 두개 ( 객체생성 & setter ) 
		// di.xml 설정 - 스프링 팩토리 생성 객체 외부 전달
		// ioc 개념 단어 - 스프링 ioc 구현하기 setter di 방식 전달
		//
		EmpVO vo = factory.getBean("vo",EmpVO.class);
		EmpDAO dao = factory.getBean("dao",EmpDAO.class);
		
		// property 는 set해주는 역할이구나 
		// bean 태그는 생성자 호출
	
		EmpVO resultvo = dao.getVo();
		System.out.println(resultvo); // 사번 : xxxx 이름 : xxxx 급여 : xxxx 
		
		
		//<bean id= "vo" class = "springdi/EmpDAO">
		//<property name="vo" ref="vo">  ref="참조값(객체)" vlaue = " 숫자 문자 논리값만 " >
		//</bean>
		
	}
}
