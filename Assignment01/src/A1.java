
public class A1 {

	public static void main(String[] args) {
		
		int adult = 1;
		int children = 2;
		fee(adult, children);
		
		

	}
	
	
	//함수상자. a 성인 수 c 어린이 수 people 사람 수 sum 할인 적용 이전 입장료
	static void fee(int a, int c) {
		int people = a + c;
		int adultFee = 20000;
		int childFee = 9900;
		int discount = 4/5;
		int sum = adultFee * a + childFee * c;
		if (people < 5) {
			System.out.println(sum);
		} else {
			System.out.println(sum * discount);
		}
	}
}
