package aoptest1;

public class Member {
	protected Boolean login(String id) {
		System.out.println(id + "헬창께서 회원으로 로그인");
		return true;
	}

	public Boolean logout() {
		System.out.println("들어올때는 맘대로지만 나갈때는 아니란다.");
		return false;
	}
}
