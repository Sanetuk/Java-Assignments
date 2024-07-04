
public class Animal {
	
	// 이름, 나이 전화번호 변수
	String name;
	int age;
	String number;
	
	static int count = 0;
	
	Animal() {
		count = count +1;
	}
	
	
	// 서있기, 앉기, 뛰기 함수
	void stand() {
		
		System.out.println("가 서 있습니다.");
		
	}
	
	void sit() {
		
		System.out.println("가 앉아 있습니다.");
		
	}
	
	void run() {
		
		System.out.println("가 뛰어갑니다.");
		
		
	}
	
	

}
