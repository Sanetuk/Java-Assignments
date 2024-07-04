
public class Cat extends Animal {
	
	
	static int catCount;
	
	Cat() {
		
		catCount += 1;
		
	}
	
	void stand() {
		
		System.out.println("고양이가 서있습니다.");
		
	}
	
	void sit() {
		
		System.out.println("고양이가 앉아있습니다.");
		
	}
	
	void run() {
		
		System.out.println("고양이가 뛰어갑니다.");
		
	}
}
