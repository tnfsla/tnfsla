package kh.oop1.day03.exam;

public class BlockExam {
	public static String name = "홍길동";
	
	public BlockExam() {  //생성자  -> 마지막 순서로 적용됌 생성자명을 클래스명과 똑같이 지정해줘야하며, 메소드 선언과 유사하나 반환값이 없다.
		 
		System.out.println("생성자 영역");
	}
	
	//클래스 혹은 인스턴스 블록 테스트  
	int age =19;//명시적 초기값
	static{  //클래스 초기화블럭 초기에 프로그램 실행했을때 최초 한번만 사용함  
		System.out.println("static block 클래스 블럭");
		name = "박길동";
	}
	
	
	{ //인스턴스 블록
		System.out.println(age);
		System.out.println("인스턴스 블록1");
		this.age = 22; //인스턴트 초기화
		System.out.println(age);
	}

	
	{
		System.out.println("인스턴스 블록2");
	}

}
