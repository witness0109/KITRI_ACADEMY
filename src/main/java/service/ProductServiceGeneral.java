package service;

public class ProductServiceGeneral implements ProductService {
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
