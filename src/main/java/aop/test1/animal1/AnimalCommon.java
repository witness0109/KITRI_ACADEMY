package aop.test1.animal1;

import org.aspectj.lang.ProceedingJoinPoint;

public class AnimalCommon {
	
	/*
	 * public void greeting() {
	 * 
	 * System.out.println("안뇽"); System.out.println(""); }
	 */
	

	public void food(ProceedingJoinPoint joinpoint) {
		System.out.println("점심 먹었누? ㅡㅇ하하ㅏ");
		try {
			Object food = joinpoint.proceed(); // proceed 하면 메소드 실행(메소드안에 있는 sout 문장이 출력) / val : 리턴값
			Object name = joinpoint.getTarget().getClass().getSimpleName(); // 클래스이름
			//aop.a.b.c.Cat 
			// string[] foodname = name.split("\\."); [a-z](10)
			// String className = foodname[foodname.length-1];
			System.out.println(name + "님은 " + food + "을(를) 먹었습니다.");
			System.out.println("");

		} catch (Throwable e) {
		}

	}

}
