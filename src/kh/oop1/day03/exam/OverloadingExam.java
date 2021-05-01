package kh.oop1.day03.exam;

public class OverloadingExam {
	// 오버로딩 조건
	// 1. 메소드의 이름은 동일해야한다
	int intI;
	String strS;
	
	public void method() {
		
	}
	
	public void method(int intI) {
		
	}
	
	// 2. 매개변수 타입이 달라야한다.
	public void method(String strS) {
		
	}
	
	// 3. 매개변수의 갯수가 달라야한다.
	public void method(int intI, String strS) {
		
	}
	
	// 4. [주의] 매개변수의 위치가 달라도 다른 메소드로 인식함
	public void method(String strS, int intI) { //가능		
		
	}
	
	
}
