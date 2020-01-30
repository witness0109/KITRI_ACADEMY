package mybatis.bakery;

import org.springframework.web.multipart.MultipartFile;

public class BakeryVO {
	int bakeryid;
	String bakeryname;
	int price;
	int balance;
	String img;
	
	BakeryVO(){}
	
	
	public BakeryVO(String bakeryname, int price, int balance, String img) {
		super();
		this.bakeryname = bakeryname;
		this.price = price;
		this.balance = balance;
		this.img = img;
	}
	
	
	@Override
	public String toString() {
		return "BakeryVO [bakeryid=" + bakeryid + ", bakeryname=" + bakeryname + ", price=" + price + ", balance="
				+ balance + ", img=" + img + "]";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getBakeryid() {
		return bakeryid;
	}

	public void setBakeryid(int bakeryid) {
		this.bakeryid = bakeryid;
	}

	public String getBakeryname() {
		return bakeryname;
	}

	public void setBakeryname(String bakeryname) {
		this.bakeryname = bakeryname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
