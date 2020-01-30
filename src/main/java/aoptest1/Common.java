package aoptest1;

import org.aspectj.lang.ProceedingJoinPoint;

public class Common {
	public void print() {
		System.out.println("<<<  휴식 시간 주세여>>>");
		
	}
	public void printresult(Object val) {
		// pointcut 선택 되어진 메소드 수행 종료 - 리턴 값 활용 하기 위함
		System.out.println("쉬는시간 리턴값 = " + val);
	}
	
	public void printaround(ProceedingJoinPoint joinpoint) {
		System.out.println("<< 메소드 시작 >>");
		
		//핵심관심 선택 메소드 = pointcut
		try {
			Object val = joinpoint.proceed();// 핵심관심메소드 실행해라
			System.out.println("객체명 = " + joinpoint.getTarget());
			System.out.println("메소드명 = " + joinpoint.toShortString());
			System.out.println("실행결과 = "+ val);
			System.out.println("<< 메소드 종료 >>");
		} catch (Throwable e) {	}
		
	}
	
}
