package Data;

import java.util.ArrayList;


public class StoreDates {
	

	
	// 날짜별 팔린 물건 리스트
	ArrayList<Product> dailySoldProduct = new ArrayList<Product>();

	
	// 오늘 팔린 물건 리스트에 추가
	void addDailySoldProduct(Product product) {
		dailySoldProduct.add(product);
	}

	
	
	// 날짜별 총 매출
	int dailyTotalSold;
	
	// 날짜별 총 매출에 더하기
	void addDailyTotalSold(Product product) {
		dailyTotalSold += product.price;
	}
	

}
