package kh.oop1.day03.exam;

public class ConstructorExam {
	// 생성자 표현식
	// 기본생성자 : [접근제한자] 클래스명(){}
	// 매개변수가 있는 생성자 : [접근제한자] 클래스명(매개변수){(this).필드변수 = 매개변수; //초기화}    값을 받아서 이용함
	private int no;
	private String name;
	
	// 기본생성자
	// 작성하지 않은 경우 클래스 사용시 JVM이 장동적으로 기본생성자를 생성한다.
	public ConstructorExam() {
		
	}
	
	// 매개변수 생성자 -> 이를 만드려면 기본생성자 또한 무조건 필요함
	// 자동으로 생성하지 않기 때문에, 무조건 만들어야 함
	// 오버로딩을 이용하여 작성됨
	// 오버로딩이란? 한 클래스 내에서 동일한 이름으로 메소드를 여러개 작성하는 기법
	// 동일한 이름으로 매개변수만 다르게해서 이용할 수 있는 이점이 있음
	public ConstructorExam(int no, String name) {
		this.no = no;
		this.name = name;
		
	}
			
}
