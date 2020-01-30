package nonspring.proxy;

public class B implements ProxyInterface {
	ProxyInterface pi;
	public void setProxyInterface(ProxyInterface pi) {
		this.pi = pi;
	}


	@Override
	public void action() {
		
		System.out.println("B action()1");//db연결 가정
		pi.action(); // Insert 가정
		System.out.println("B action()2"); //db연결 해제

	}

}
