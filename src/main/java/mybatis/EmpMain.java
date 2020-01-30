package mybatis;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EmpMain {
	public static void main(String[] args) throws IOException, SQLException {
		// Spring / ApplicationContext factory = "a.xml"
		// xml 설정사항들을 가지고 있다가 con 생성 공장부지
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

		// 설정파일 con pool 생성
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("mybatis/mybatis-config.xml"));

		// jdbc con 1개 생성 = sqlSession / pool에서 하나주삼
		// connection.getAutoCommit() --> true(dml 자동 커밋)
		// connection.setAutoCommit(false) == > 수동 커밋 변경

		// 기본 연결 : 수동 커밋
		// SqlSession session = factory.openSession();

		// 자동 커밋 변경
		SqlSession session = factory.openSession(true);
		System.out.println(session.getConnection().getAutoCommit());
		// session.getConnection().commit();

		// Mybatis db 접근 객체
		EmpDAO dao = new EmpDAO();
		dao.setSession(session);
		// EmpMyBatisService 객체 시키자 / main에서 하지말자
		EmpMybatisService service = new EmpMybatisService(); // empdao : mybatis 라이브러리를 통해 db를 가져옴

		service.setDao(dao);
		////////////////////////////////////////////////////////
		// emp-mapping.xml <select id=""
		// test1 : 모든 레코드 조회
		
		  List<EmpVO> list = service.getAllEmp();
		  
		  for(EmpVO vo:list) {
		  
		  System.out.println(vo); }
		

		// test2 : 특정 레코드 조회
		/*
		 * EmpVO vo = service.getOneEmp(100); System.out.println(vo);
		 */

		// test3 : 특수 조건하에 특정 레코드들 조회

		/*
		 * List<EmpVO> vo = service.getManyEmp(150); System.out.println(vo.size()+"개");
		 * System.out.println(vo);
		 */

		// test4 : 레코드 삽입

		/*
		 * EmpVO insertvo = new EmpVO(); insertvo.setEmployee_id(1001); // pk 중복x , null
		 * x //insertvo.setFirst_name("태균"); insertvo.setLast_name("김");// not null
		 * insertvo.setEmail("mybatis@kFC.com"); // uniqㄴue
		 * //insertvo.setHire_date("2020-01-21"); // insertvo.setJob_id("IT_PROG");
		 * //jobs 테이블 존재하는 데이터 fk
		 * 
		 * service.insertEmp(insertvo); System.out.println("사원 등록 오나료");
		 */

		// test5 : 레코드 업데이트

		/*
		 * EmpVO updatevo = new EmpVO(); updatevo.setLast_name("수정");
		 * updatevo.setEmployee_id(1000); service.updateEmp(updatevo);
		 * System.out.println("수정완료");
		 */

		// test6 : 삭제
		/*
		 * service.deleteEmp(1000); System.out.println("완료");
		 */

		// test7:전체사원수 조회
		/*
		 * int cnt = service.dao.selectEmpCount(); System.out.println("총사원수 = " + cnt);
		 */

		// test8 : 1페이지당 10개씩 출력 예정
		/*
		 * int pagenum = 5;//41 - 50 int param[] = new int[2]; param[0] = (pagenum-1)*
		 * 10 + 1; //41 param[1] = pagenum * 10; // 50 List<EmpVO> list =
		 * service.dao.empPaging(param); for(EmpVO vo: list)
		 * System.out.println(vo.getEmployee_id() + " : " + vo.getHire_date());
		 */

		/*
		 * //test9-1 : 부서코드 조건 조회배열 int dept_id[] = {30,50,80}; List<EmpVO> list1 =
		 * service.getEmpDeptid(dept_id); for(EmpVO vo: list1) {
		 * System.out.println(vo.getDepartment_id()+" : "+vo.getLast_name() ); }
		 */
		// service 추가 - dao 추가 - emp-mapping.xml

		// test9-2 : 부서코드 조건 조회 ArrayList
		/*
		 * ArrayList<Integer> dept_id = new ArrayList<Integer>(); dept_id.add(10);
		 * dept_id.add(50); dept_id.add(80);
		 * 
		 * List<EmpVO> list1 = service.getEmpDeptid(dept_id); for (EmpVO vo : list1) {
		 * System.out.println(vo.getDepartment_id() + " : " + vo.getLast_name()); }
		 */

		// test10 : map 전송
		// column 키값 컬럼명 = word 키값 값
		// where first_name = Steven 이 조건을 만들고 싶다.
		// like Steven ->> "%Steven%"
		// 대소문자 --> upper( )
		/*
		 * HashMap<String, String> map = new HashMap<String, String>();
		 * map.put("column", "first_name"); map.put("word", "Steven");
		 * 
		 * List<EmpVO> list2 = service.getEmpDynamicwhere(map); for (EmpVO vo : list2) {
		 * System.out.println(vo.getFirst_name() + " : " + vo.getLast_name()); }
		 */
	}
}
