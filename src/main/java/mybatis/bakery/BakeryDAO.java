package mybatis.bakery;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BakeryDAO {
	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	//전체
	public List<BakeryVO> getAllBakery(){
		List<BakeryVO> list = session.selectList("bake.allbake");
		return list;
		
	}

	public void insertBakery(BakeryVO vo) {
		session.insert("bake.insertbake",vo);
		
	}


	
}
