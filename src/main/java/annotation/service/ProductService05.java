package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("service2")
@Service("service2")
public class ProductService05 implements ProductService {
	@Autowired
	ProductDAO dao;
	
	/*
	 * public void setDao(ProductDAO dao) { this.dao = dao; }
	 */

	@Override
	public ProductVO sell() {
		//
		return dao.sell(0.3, 3);
	}

}
