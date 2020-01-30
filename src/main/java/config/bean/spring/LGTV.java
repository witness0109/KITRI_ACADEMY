package config.bean.spring;

import org.springframework.stereotype.Component;

@Component
public class LGTV implements TV {
	//전원 켜다
		public void powerOn() {
			System.out.println("LG TV : 전원 켜");
		}
		
	//전원 끄다
		public void powerOff() {
			System.out.println("LG TV : 전원 꺼");
		}
		//볼류 높이	
		public void soundUp() {
			System.out.println("LG TV : 볼륨 높여");
		}
		
	//볼륨 낮추
		public void soundDown() {
			System.out.println("LG TV : 볼륨 낮춰");
		}

		
	//바벨 뽑아
		public void BavelBBova() {
			System.out.println("바벨 뽑아~ 다운~ 업~");
		}

}
