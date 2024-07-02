
public class Print {

	public static void main(String[] args) {
		
		// 사람 인적사항
		String personName = "Ken";
		int personAge = 63;
		String personNumber = "123-4567-8910";
		 
		// 강아지 인적사항
		String dogName = "Doggy";
		
		// 고양이 인적사항
		String catName = "Kitty Cat";
		
		// 집 이름
		String houseName = "Mojo Dojo Casa House";
		
		House house = new House(houseName);
		Person person = new Person(personName, personAge, personNumber);
		Dog dog = new Dog(dogName);
		Cat cat = new Cat(catName);
		
		System.out.println("집 이름 : " + house.name);
		System.out.println("사람 이름 : " + person.name + ", 나이 : " + person.age + ", 전화번호 : " + person.number);
		System.out.println("강아지 이름 : " + dog.name);
		System.out.println("고양이 이름 : " + cat.name);
		
	}

}
