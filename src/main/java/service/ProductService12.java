package service;

public class ProductService12 implements ProductService {
	ProductDAO dao;
	
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public ProductVO sell() {
		//12월 정책 변경 부분 구현 추가
		return dao.sell(0.5, 1);
	}

}
