import java.util.ArrayList;

public class Store {
	
	// 매장 이름
	String name;
	
	// 고객 목록
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	// 제품 목록
	ArrayList<Product> products = new ArrayList<Product>();
	
	// Setters
	public void setStoreName(String name) {
		this.name = name;
	}
	
	
	// pay 함수(고객이 제품을 살 때마다 실행, 고객(내가 산 제품, 산 총 금액), 제품(팔린 전체 금액))
	void pay(Customer customer, Product product) {
		
		// 고객을 목록에 올리기
		int needtobeadded = 1;
		for(int i = 0; i < customers.size(); i++) {
			if(customers.get(i).number == customer.number) {
				needtobeadded = needtobeadded * 0;
				}
			
			if(needtobeadded == 0) {
				customers.add(customer);
				
			}
		}
		
		// 제품을 목록에 올리기
		this.products.add(product);
		
		// 고객 안 내가 산 제품에 추가
		customer.setBoughtProducts(product);
		
		// 내가 산 총 금액에 합산
		customer.setTotalSpent(product.price);
		
		// 제품 팔린 전체 금액에 합산
		product.addTotalSold(product.price);
		
		
		/// 영수증(pay함수) 출력하기
		System.out.println("영 수 증");
		System.out.println(" ");
		System.out.println("고객명 : " + customer.name + ", 전화번호 : " + customer.number);
		System.out.println("제품명 : " + product.name + " 가격 : $" + product.price);
		System.out.println("현재까지 소비하신 금액은 $" + customer.totalSpent + " 입니다. 더 많이 구매하십시오.");
		System.out.println(" ");
		System.out.println("업체명 : " + name);
		System.out.println("----------------------------------------------------------------------------");

	}
	
		// 제품별 매출 method
	void productSold(Product product) {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("제품 " + product.name + ", 총 매출 : " + product.totalSold);
		System.out.println("----------------------------------------------------------------------------");
	}
	
		// 총매출 계산 method
	void totalProductSold() {
		int totalProductSold = 0;
		for(int i = 0; i < products.size(); i++) {
				totalProductSold += products.get(i).totalSold;
			}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("매장 총 매출은 $" + totalProductSold + "입니다.");
		System.out.println("----------------------------------------------------------------------------");

		}
	





}
