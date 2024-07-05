
public class A1alt {

	public static void main(String[] args) {
		
		//int와 return을 활용해서 작성
		int adultCount = 1;
		int childCount = 2;
		int adultFee = 20000;
		int childFee = 9900;
		int money = totalFee(adultCount, childCount, adultFee, childFee);
		
		if(adultCount + childCount < 5) {
			System.out.println(money);
		} else {
			System.out.println(money*0.8);
		}

	}
	
	//a:성인 b:어린이 c:adultFee d:childFee
	static int totalFee(int a, int b, int c, int d) {
		int sum = c*a + d*b;
		return sum;
	}


}
