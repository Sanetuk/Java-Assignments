
public class Print {

	public static void main(String[] args) {
		
		
		
		// 실제 사람 만들기
		Person person = new Person();
		
		// 실제 강아지 만들기
		Dog dog = new Dog();
		
		// 실제 고양이 만들기
		Cat cat = new Cat();
		
		
		// 실제 집 만들기
		
		/// 첫째집
		House house1 = new House();
		house1.person = person;
		house1.dog = dog;
		house1.cat = cat;
		
		/// 둘째집
		House house2 = new House();
		house2.person = person;
		house2.dog = dog;
		house2.cat = cat;
		
		/// 셋째집
		House house3 = new House();
		house3.person = person;
		house3.dog = dog;
		house3.cat = cat;
		
		System.out.println("집의 이름 : " + house1.name);
		System.out.println("사람의 이름 : " + house1.person.name + ", 나이 : " + house1.person.age + ", 전화번호 : " + house1.person.number);
		System.out.println("강아지의 이름 : " + house1.dog.name);
		System.out.println("고양이의 이름 : " + house1.cat.name);



	}

}
