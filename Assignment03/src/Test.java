import com.lx.animal.Dog;
import com.lx.house.House;

public class Test {

	public static void main(String[] args) {
		
		// 실제 집 찍어내기
		House house1 = new House("Mojo Dojo Casa House");
		
		// 실제 강아지 찍어내기
		Dog dog1 = new Dog("Doggy", 1, "111-1111-1111");
		house1.set(dog1);
		
		Dog dog2 = new Dog("Duggy", 2, "222-2222-2222");
		house1.set(dog2);
		
		Dog dog3 = new Dog("Mark", 3, "333-3333-3333");
		house1.set(dog3);
		
		Dog dog4 = new Dog("Daddy", 4, "444-4444-4444");
		house1.set(dog4);
		
		Dog dog5 = new Dog("Mommy", 5, "555-5555-5555");
		house1.set(dog5);
		
		// 강아지 마릿수 출력
		System.out.println("강아지의 총 마릿수는 : " + house1.getSize());
		
		// 변수상자에 들어있는 모든 강아지의 이름 출력
		System.out.println("모든 강아지의 이름은 : " + house1.getFullName());
		
		// 마지막 강아지의 이름, 나이, 전화번호 출력
		System.out.println(house1.dogAttributes(house1.getSize() - 1));
		
		// run 함수 실행
		house1.run();


	}

}
