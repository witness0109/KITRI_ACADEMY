package member;

public class MemberVO {
	String id, name;
	
	MemberVO(){}
	//<jsp:useBean id="a" class="MemberVO"
	//<beans:bean id="a" class="MemberVO"
	//@Component 
	// 위에 3 동작들이 동작이 안됨 
	
	MemberVO(String id, String name){
		this.id=id;
		this.name = name;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + "]";
	}
}
