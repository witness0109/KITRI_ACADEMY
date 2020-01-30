package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("service3")
@Service("service3")
public class ProductService12 implements ProductService {
	@Autowired
	ProductDAO dao;
	
	/*
	 * public void setDao(ProductDAO dao) { this.dao = dao; }
	 */

	@Override
	public ProductVO sell() {
		//12월 정책 변경 부분 구현 추가
		return dao.sell(0.5, 1);
	}

}
