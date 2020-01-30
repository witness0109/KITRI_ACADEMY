package spring2;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommandMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		Command[] array = new Command[3];

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring2/command.xml");

	

		array[0] = factory.getBean("com1", Command.class);
		array[1] = factory.getBean("com2", Command.class);
		array[2] = factory.getBean("com3", Command.class);

		for (int i = 0; i < array.length; i++) {
			array[i].run();

		}

	}
}
/*
 * 게시판 : 실행중입니다. 회원 : 관리중입니다. 상품 : 등록중입니다.
 */