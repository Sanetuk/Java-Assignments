
public class Entrancefee {

	public static void main(String[] args) {
		
		
		// 성인 수
		int adultCount;
		
		// 어린이 수
		int childCount;
		
		// 성인 요금
		int adultFee;
		
		// 어린이 요금
		int childFee;
		
		// 할인율
		double discount;
		
		// 할인 허들
		int discountFrom;
		
		// 값 집어넣기
		adultCount = 1;
		childCount = 2;
		adultFee = 20000;
		childFee = 9900;
		discount = 0.2;
		discountFrom = 5;		
		
		int money = calculate(adultCount, childCount, adultFee, childFee, discount, discountFrom);
				
				System.out.println(money);
	}
	
	static int calculate(int adultCount, int childCount, int adultFee, int childFee, double discount, int discountFrom) {
		int totalcount = adultCount + childCount;
		int totalFee = adultCount * adultFee + childCount * childFee;
		double adjustedFee;
		if (totalcount < 5) {
			adjustedFee = totalFee;
		}
			adjustedFee = (double) totalFee * (1 - discount);
		int adjustedFeeInt = (int) adjustedFee;
		return adjustedFeeInt;
	}
	

	
	

}
