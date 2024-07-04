
public class Test {

	public static void main(String[] args) {

		Animal cat = new Cat();
		Animal cat1 = new Cat();
		

		
		
		cat.stand();
		cat.sit();
		cat.run();
		
		
		System.out.println("강아지는 " + Dog.dogCount + "마리, 고양이는 " + Cat.catCount + "마리 있어요. 다 합치면 " + Animal.count + "마리 있어요.");
		
		
		

	}
	
	

	
	

}
