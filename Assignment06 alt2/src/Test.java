
import java.util.ArrayList;

import Data.Customer;
import Data.Product;
import Data.Store;


public class Test {

	public static void main(String[] args) {
		
		
		// 매장 찍어내기
		Store store1 = new Store();
		store1.name = "Mattel";
		
		// 고객 찍어내기
		Customer customer1 = new Customer("Ken", 63, "111-1111-1111");
		store1.customers.add(customer1);
		
		Customer customer2 = new Customer("Barbie", 65, "222-2222-2222");
		store1.customers.add(customer2);
		
		Customer customer3 = new Customer("Allen", 60, "333-3333-3333");
		store1.customers.add(customer3);
		
		// 제품 찍어내기
		Product product1 = new Product("Milk", 2000);
		store1.products.add(product1);
		
		Product product2 = new Product("Car", 3000);
		store1.products.add(product2);
		
		Product product3 = new Product("Horse", 4000);
		store1.products.add(product3);
		
		
		// 매장 안에 들어있는 고객의 숫자, 제품의 숫자 출력
		System.out.println("매장 안 고객의 숫자 : " + store1.customers.size());
		System.out.println("매장 안 제품의 숫자 : " + store1.products.size());
		

		
		
		// 고객이 물건 구매(pay 함수 사용)
		store1.pay(customer1, product1);
		store1.pay(customer1, product3);
		store1.pay(customer2, product1);
		store1.pay(customer3, product2);
		store1.pay(customer3, product1);
		
		
		
		// 하루 정산
		store1.balanceProduct();
		store1.balanceSold();
				
		
		/// 출력
		
		
		// 해시 출력
		for (String date : store1.dayToSoldProductList.keySet()) {
			System.out.println("해시 키 : " + date);
		}
		



		for (String date : store1.dayToTotal.keySet()) {
			System.out.println("해시 키 : " + date);
		}
		
		
		// 값 출력
		ArrayList<Product> a = store1.dayToSoldProductList.get(store1.today);
		
		for (int i = 0; i < a.size() ; i++) {
		System.out.println(a.get(i).name);
		}
		
		
		
		
		
		
		

	}

}
	
	
