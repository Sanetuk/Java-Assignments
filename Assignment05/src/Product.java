
public class Product {
	
	// 제품 이름
	String name;
	
	// 제품 가격
	int price;
	
	// 제품 총매출
	int totalSold;
	
	/// 총매출에 합산하는 함수
	public void addTotalSold(int price) {
		this.totalSold += price;
	}
	
	/// 제품 이름 설정
	public void setProductName(String name) {
		this.name = name;
	}
	
	/// 제품 가격 설정
	public void setProductPrice(int price) {
		this.price = price;
	}

}
