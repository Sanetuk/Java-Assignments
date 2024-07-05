package com.lx.house;

import java.util.ArrayList;

import com.lx.animal.Dog;

public class House {
	
	// 집 이름
	String name;
	
	
	// 강아지를 넣어두는 변수상자
	ArrayList<Dog> puppies = new ArrayList<Dog>();
	
	
	
	
	// 집 이름을 설정하는 함수
	public House(String name) {
		this.name = name;
	}
	
	// 강아지 변수상자를 다른 클래스로 보내는 메서드
	public ArrayList<Dog> getPuppies() {
		return puppies;
	}
	

	// 강아지 변수상자에 강아지를 입력하는 메서드
	public void setplace(Dog dog) {
		getPuppies().add(dog);
	}
	
	
	
	/// 강아지 변수상자의 정보를 가져오는 메서드
	
	// 강아지의 총 마릿수를 가져오는 메서드
	public int getSize() {
		return puppies.size();		
	}
	
	// 해당 칸의 강아지 정보를(클래스)를 불러오는
	
	public void get(Dog dog) {

		puppies.get(0);
	}
	
	// 모든 강아지의 이름을 가져오는 메서드
	public String getFullName() {
		String listOfNames = "";
		for (int i=0; i<=(puppies.size() - 1); i++) {
			listOfNames += puppies.get(i).getDogName() + ", ";
		}
		return listOfNames;
	}
	
	// 해당 강아지의 이름, 나이, 전화번호를 가져오는 메서드
	public String dogAttributes(int i) {
		return (i + 1) + "번째 강아지의 이름 : " + puppies.get(i).getDogName() + ", 나이 : " + puppies.get(i).getDogAge() + ", 전화번호 : " + puppies.get(i).getDogNumber();
	}
	
	// run 함수. 강아지가 한 마리도 없으면 콘솔 창에 강아지가 없다는 글자를 출력
	// 강아지가 한 마리라도 있으면 콘솔 창에 첫번째 강아지의 이름을 출력
	public void run() {
		if(getSize() == 0) {
			System.out.println("강아지가 없다");
		}

		System.out.println(puppies.get(0).getDogName());
	}

	

}



