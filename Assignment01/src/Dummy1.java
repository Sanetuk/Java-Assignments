
public class Dummy1 {

	public static void main(String[] args) {
		
		int adult = 1;
		int children = 2;
		int result = fee(adult, children);
		
		System.out.println(result);

	}
	
	static int fee(int a, int c) {
		return (20000 * a) + (9900 * c);
	}

}
