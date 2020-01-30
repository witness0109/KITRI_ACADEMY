package aop.test1.animal1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop/test1/animal1/animal.xml");
		
		Animal [] animal = new Animal[3];
		animal[0] = factory.getBean("cat", Animal.class); // new Cat();
		animal[1] = factory.getBean("dog", Animal.class); // new Dog();
		animal[2] = factory.getBean("rabbit", Animal.class); // new Rabbit();
	
		for(Animal a : animal){
			a.lunch();
		
		}
	
	}
}
/*
점심 뭐 먹었어요?
생선 먹었습니다.
Cat 님은 생선 먹었군요. / 하나의 lunch가 실행될때

점심 뭐 먹었어요?
사료 먹었습니다.
Dog 님은 사료 먹었군요. / 하나의 lunch가 실행될때

점심 뭐 먹었어요?
당근 먹었습니다.
Rabbit 님은 당근 먹었군요. / 하나의 lunch가 실행될때

*/