package Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Store {
	
	// 상점 이름
	public String name;
	
	
	// 고객 목록
	public ArrayList<Customer> customers = new ArrayList<Customer>();

	
	// 제품 목록
	public ArrayList<Product> products = new ArrayList<Product>();
	
	
	// 오늘 팔린 물건들 리스트
	public ArrayList<Product> todayProducts = new ArrayList<Product>();
	
	
	// 오늘 총매출
	public int todayTotalSold;

		

	
	// 오늘 팔린 물건들 리스트를 추가할 해시
	public HashMap<String, ArrayList<Product>> dayToSoldProductList = new HashMap<String, ArrayList<Product>>();
	
	// 오늘 팔린 총 금액을 추가할 해시
	public HashMap<String, Integer> dayToTotal = new HashMap<String, Integer>();
	
	// 오늘 날짜
	Date date1 = new Date();
	SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
	public String today = format1.format(date1);
	
	// 함수 pay 정의
	public void pay(Customer customer, Product product) {
		
		// 날짜 체크
		
		
		// 고객 안에 내가 산 제품에 추가
		customer.payBoughtProducts(product);
		
		// 내가 산 총 금액에 합산
		customer.totalPaid += product.price;
		
		// 제품의 팔린 전체 금액에 합산
		product.totalSold += product.price;
		
		// 팔린 물건 리스트에 저장
		todayProducts.add(product);
		
		// 하루 총 매출 갱신
		todayTotalSold += product.price;
		
		
	}
	
	// 해시에 리스트를 추가하는 함수
	public void balanceProduct() {
		dayToSoldProductList.put(today, todayProducts);
	}
	
	// 해시에 총매출을 추가하는 함수
	public void balanceSold() {
		dayToTotal.put(today, todayTotalSold);
	}
	
	
}
