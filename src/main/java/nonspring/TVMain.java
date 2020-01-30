package nonspring;

import java.util.Scanner;

public class TVMain {

	public static void main(String[] args) { //args[0]삼성 arg[1]티비 삼성 티비 
		//삼성TV 구입사용자
		//TV 변경하면 같이 변경 코드 발생한다 = COUPLING(결합도) 높다.--> 좋은 코드가 아님
		//TV 변경하면 같이 변경 코드 발생한다 = COUPLING(결합도) 낮다.--> 좋은 코드 (중복되는 경우를 줄이자)
				
		//상위인터페이스 변수명 = new 하위클래스객체();
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		
		TVFactory factory = new TVFactory();
		
		TV tv = factory.getTV(a);
		//TV tv = factory.getTV(args[0]);
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.BavelBBova();
		tv.powerOff();

	}

}
