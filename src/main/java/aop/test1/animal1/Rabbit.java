package aop.test1.animal1;

public class Rabbit implements Animal {

	@Override
	public String lunch() {
		System.out.println("당근 먹었습니다.");
		return "당근";
	}
}
