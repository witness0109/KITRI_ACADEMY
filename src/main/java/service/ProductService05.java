package service;

public class ProductService05 implements ProductService {
	ProductDAO dao;
	
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public ProductVO sell() {
		//
		return dao.sell(0.3, 3);
	}

}
