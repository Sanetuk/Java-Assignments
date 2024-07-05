import java.util.ArrayList;

public class Customer {
	
	
	// 고객 이름
	String name;
	
	// 고객 나이
	int age;
	
	// 고객 전화번호
	String number;
	
	// 고객이 구입한 제품 목록
	ArrayList<Product> boughtProducts = new ArrayList<Product>();
	
	// 고객이 소비한 총 금액
	int totalSpent;
	
	
	/// 고객 이름설정
	public void setCustomerName(String name) {
		this.name = name;
	}
	
	/// 고객 나이설정
	public void setCustomerAge(int age) {
		this.age = age;
	}
	
	/// 고객 전화번호 설정
	public void setCustomerNumber(String number) {
		this.number = number;
	}
	
	/// 고객이 구입한 제품 목록 수정(pay)
	public void setBoughtProducts(Product product) {
		ArrayList<Product> boughtProducts = new ArrayList<Product>();
		boughtProducts.add(product);
		this.boughtProducts = boughtProducts;
	}
	
	/// 고객이 소비한 총 금액 설정
	public void setTotalSpent(int spent) {
		this.totalSpent += spent;
	}

}
