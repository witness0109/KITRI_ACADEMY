package mybatis.bakery;

import java.util.List;

public interface BakeryService {

	public List<BakeryVO> getAllBakery();
	
	public void insertBakery(BakeryVO vo);
}
