package mybatis.bakery;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.EmpDAO;

public class BakeryMain {
	public static void main(String[] args) throws Exception {

		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("mybatis/bakery/mybatis-config.xml")); // mybatis-config.xml
		SqlSession session = factory.openSession(true);

		BakeryDAO dao = new BakeryDAO();
		dao.setSession(session);

		BakeryService service = new BakeryServiceImpl();
		((BakeryServiceImpl) service).setDao(dao);

		// 1. bakeryid : bakery_seq.nextval
		// 2. bakeryname , price , balance, bakeryimage : 입력
		// 명령행 매개변수 입력
		// run-run configurations - arguments - program // 소보로빵 1500 100 bbang1.jpg
		// bakery TBL 에 INSERT

		BakeryVO insertvo = new BakeryVO();
		insertvo.setBakeryname(args[0]);
		insertvo.setPrice(Integer.parseInt(args[1]));
		insertvo.setBalance(Integer.parseInt(args[2]));
		insertvo.setImg(args[3]);
		service.insertBakery(insertvo);
		System.out.println("등록 완료");

		// BAKERY 테이블 SELECT : 콘솔 출력

		List<BakeryVO> list = service.getAllBakery();
		for (BakeryVO vo : list) {
			System.out.println(vo);
		}

		// db: mybatis 이용(2개 xml)
		// mybatis / bakery / config.xml( mybatis 설정 정의 )
		// mybatis / bakery / bakery-mapping.xml(sql 정의)
		// 2> mybatis 구현 : BakeryDAO

	}
}
