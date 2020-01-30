package aoptest2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component // <bean id="common" class="aoptest2.Common"/>
@Aspect // <aop:aspect id="breaktime" ref="common">
public class Common {

	/*
	 * //가짜 메소드 //<aop:pointcut expression="execution( * aoptest2.*.*(..))"
	 * id="freedom"/>
	 * 
	 * 
	 * 
	 * //<aop:after method="print" pointcut-ref="freedom"/>
	 * 
	 * @After("freedom()") public void print() {
	 * System.out.println("<<<  휴식 시간 주세여>>>");
	 * 
	 */
	@Pointcut("execution( * aoptest2.*.*(..))")
	public void freedom() {
		/*
		 * 핵심관심메소드 일루 들어오게 된다(execution~)
		 */}

	/*
	 * @AfterReturning("freemdom()") public void printresult(Object val) { //
	 * pointcut 선택 되어진 메소드 수행 종료 - 리턴 값 활용 하기 위함 System.out.println("쉬는시간 리턴값 = " +
	 * val); }
	 */

	@Around("freedom()")
	public void printaround(ProceedingJoinPoint joinpoint) {
		System.out.println("<< 메소드 시작 >>");

		// 핵심관심 선택 메소드 = pointcut
		try {
			Object val = joinpoint.proceed();// 핵심관심메소드 실행해라
			System.out.println("객체명 = " + joinpoint.getTarget());
			System.out.println("메소드명 = " + joinpoint.toShortString());
			System.out.println("실행결과 = " + val);
			System.out.println("<< 메소드 종료 >>");
		} catch (Throwable e) {
		}

	}

}
