package Data;

import java.util.ArrayList;

public class Customer {
	
	String name;
	int age;
	String mobile;
	
	public Customer(String name, int age, String mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	// 고객이 산 제품들을 넣어두는 변수
	public ArrayList<Product> boughtProducts = new ArrayList<Product>();
	
	// 내가 산 총 금액
	public int totalPaid;
	
	// 고객이 산 제품을 넣는 함수
	public void payBoughtProducts(Product product) {
		boughtProducts.add(product);
	}
	
	// 해당일에 구매한 제품 목록
	ArrayList<Product> boughtProducts2024년07월08일 = new ArrayList<Product>();
	
	// 해당일에 구매한 제품 목록에 추가
	

}
