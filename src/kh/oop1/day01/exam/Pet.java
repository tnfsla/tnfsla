package kh.oop1.day01.exam;

public class Pet {
	// 펫의 종
	private String petType;
	//public static String petType 으로 선언한다면 실행할때 스테틱 공간에 올라감(클래스변수) --> 마지막에 선언된 Type 값이 모든 Type에 적용됌
	// 펫의 이름
	private String petName;
	// 펫의 나이
	private int petAge;
	
	
	//생성자
	public Pet() {
		
	}
	
	
	//매개변수가 있는 생성자
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
	}
	
	
	
	// private로 선언되어 있는 걸 바꾸고싶다면 getter 와 setter 을 사용해야함 (캡슐화)
	//getter 값을 가져오는 방법
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	//setter 값을 바꾸는 방법
	public void setPetType(String petType) {
		this.petType = petType;
		
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public void setPetage(int petAge) {
		this.petAge = petAge;
	}
	
}
