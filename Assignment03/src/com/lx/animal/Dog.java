package com.lx.animal;

public class Dog {
	
	// 강아지 이름
	String name;
	
	// 강아지 나이
	int age;
	
	// 강아지 전화번호
	String number;
	
	// Constructor(강아지의 정보를 저장)
	//public Dog(String name, int age, String number) {
	//	this.name = name;
	//	this.age = age;
	//	this.number = number;
	//}
	
	
	//  강아지의 정보를 저장
	public void setDogName(String name) {
		this.name = name;
	}
	
	public void setDogAge(int age) {
		this.age = age;
	}
	
	public void setDogNumber(String number) {
		 this.number = number;
	}
	
	
	// 강아지의 이름을 불러오는 메서드
	public String getDogName() {
		return name;
	}
	
	// 강아지의 나이를 불러오는 메서드
	public int getDogAge() {
		return age;
	}
	
	// 강아지의 전화번호를 불러오는 메서드
	public String getDogNumber() {
		return number;
	}
	
	
	
	
	
	
	

}
