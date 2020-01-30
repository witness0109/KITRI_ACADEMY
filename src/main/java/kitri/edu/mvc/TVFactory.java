package kitri.edu.mvc;

public class TVFactory {
	public TV getTV(String name) {
		TV result = null;
		if(name.equals("삼성")) {
			result = new SamsungTV();
		}else if(name.equals("LG")) {
			result = new LGTV();
		}
		
		return result;
	}
}
