package mybatis.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Service, @repository, @Controller : @Component 효과 내장
@Component
public class EmpDAO {
	@Autowired
	SqlSession session; //mybatis connection
	// spring <bean> SqlSession 타입 객체 bean 생성 ioc
	/* @Component
	 * class SqlSession*/
	// 직접 db 접근


	public List<EmpVO> getAllEmp() {
		List<EmpVO> list = session.selectList("emp.allemp");
		return list;
		//
	}

	public EmpVO getOneEmp(int id) {

		return session.selectOne("emp.oneemp", id);

	}

	public List<EmpVO> getManyEmp(int id) {

		return session.selectList("emp.manyemp", id);

	}

	public void insertEmp(EmpVO vo) {

		session.insert("emp.insertemp", vo);
	}

	public void updateEmp(EmpVO vo) {
		session.update("emp.updateemp", vo);
	}

	public void deleteEmp(int id) {
		session.delete("emp.deleteemp", id);
	}

	
	public int selectEmpCount(){ // 무슨 타입으로 리턴하냐. resultType 확인
		int i = session.selectOne("emp.empcnt");
		return i; //파라미터 필요없음
	}
	
	public List<EmpVO> empPaging(int[] param){
		List<EmpVO> list = session.selectList("emp.emppaging", param);//{41,50}
		return list;
	}
	
	public List<EmpVO> getEmpDeptid(ArrayList<Integer> dept_id){
		List<EmpVO> list = session.selectList("emp.getdept_id", dept_id);
		return list;
	}
	
	public List<EmpVO> getEmpDynamicwhere(HashMap<String, String> map){
		List<EmpVO> list = session.selectList("emp.empdynamic",map);
		return list;
	}
	
	public List<String> getJobId(){
		List<String> list = session.selectList("emp.job_id");
		return list;
	}
	
}
