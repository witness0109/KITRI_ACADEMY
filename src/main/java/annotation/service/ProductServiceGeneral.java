package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("service1")
@Service("service1")
public class ProductServiceGeneral implements ProductService {
	//ProductDAO 로 만들어진게 있으면 자동으로 가지고 와라
	// @ Repository("productDAO") / 변수명으로 일치하지 않아도 된다.
	@Autowired
	ProductDAO dao;
	
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public ProductVO sell() {
		//
		return dao.sell(0, 5);
	}

}
