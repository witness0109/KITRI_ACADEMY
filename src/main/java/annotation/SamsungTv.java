package annotation;

import org.springframework.stereotype.Component;
// xml 태그 설정 말고 @ 설정을 이용할 거라고 알려줘야함


@Component
public class SamsungTv implements TV {
//전원 켜다
	public void powerOn() {
		System.out.println("삼성 TV : 전원 켜");
	}
	
//전원 끄다
	public void powerOff() {
		System.out.println("삼성 TV : 전원 꺼");
	}
	//볼류 높이	
	public void soundUp() {
		System.out.println("삼성 TV : 볼륨 높여");
	}
	
//볼류 낮추
	public void soundDown() {
		System.out.println("삼성 TV : 볼륨 낮춰");
	}

//바벨 뽑아
	public void BavelBBova() {
		System.out.println("난 빡빡이 아저씨야");
	}

}
