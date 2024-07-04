
public class Dog extends Animal {
	
	static int dogCount;
	
	Dog() {
		
		dogCount += 1;
		
	}
	

		
	void stand() {
		
		System.out.println("강아지가 서있습니다.");
		
	}
	
	void sit() {
		
		System.out.println("강아지가 앉아있습니다.");
		
	}
	
	void run() {
		
		System.out.println("강아지가 뛰어갑니다.");
		
	}

}
