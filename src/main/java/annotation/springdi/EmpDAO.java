package annotation.springdi;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//bean id="dao class="">
@Repository("dao")
//dao를 만들려고 시도는 하는대  vo객체를 전달받아야한다.
public class EmpDAO {
	
	// 1. EmpVO 타입 객체 생성되어 있다면. 1개라면 무관하게 자동 연결 자동 연결
	// 2. 생성된 객체 여러개 : 이름 동일 -> 자동 연결
	// 3. @Qualifier("vo2") 같이 정의 -> EmpVO, vo2 자동연결
	
	@Resource(name = "vo2")
	//@Autowired
	//@Qualifier("vo2")
	EmpVO vo;
		
	public EmpVO getVo() {
		return vo;
	}

	/*
	 * public void setVo(EmpVO vo) { this.vo = vo; }
	 */
}
