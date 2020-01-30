package nonspring.proxy;

public class ProxyMain {
	public static void main(String[] args) {
		ProxyInterface pi = new C();
// ProxyInterface pi = ????(핵심관심) 
		B b1 = new B();
		b1.setProxyInterface(pi);
		b1.action(); // ????(핵심관심) + B (공통관심)
		
		
		
	}
}
