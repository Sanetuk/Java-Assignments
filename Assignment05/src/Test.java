
public class Test {

	public static void main(String[] args) {
		
		// 매장 찍어내기
		Store store1 = new Store();
		store1.setStoreName("Kim's Convenience");
		
		
		// 고객 찍어내기
		Customer customer1 = new Customer();
		customer1.setCustomerName("Ken");
		customer1.setCustomerAge(63);
		customer1.setCustomerNumber("123-4567-8910");
		
		Customer customer2 = new Customer();
		customer2.setCustomerName("Barbie");
		customer2.setCustomerAge(65);
		customer2.setCustomerNumber("101-2345-6789");
		
		
		
		// 제품 찍어내기
		Product product1 = new Product();
		product1.setProductName("Horse");
		product1.setProductPrice(666);
		
		Product product2 = new Product();
		product2.setProductName("Beach");
		product2.setProductPrice(500);
		
		Product product3 = new Product();
		product3.setProductName("Icecream");
		product3.setProductPrice(1000);
		
		
		
		/// 원하는 정보 출력
		
		// pay 함수 실행
		store1.pay(customer1, product2);
		store1.pay(customer1, product3);
		store1.pay(customer2, product1);
		store1.pay(customer2, product3);
		

				
		// 제품 매출 출력
		store1.productSold(product3);
		
		// 총매출 출력
		store1.totalProductSold();


		

	}

}
