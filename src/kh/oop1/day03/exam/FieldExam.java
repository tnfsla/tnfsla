package kh.oop1.day03.exam;

public class FieldExam {
	// [접근제한자(public private default)]  [예약어 (static final)] 자료형 변수명 [=초기값];
	// 클래스 변수(모든 객체가 공통적으로 속성을 가질 때 사용하고 생성할 때 메모리영역에 같이 생성이 되기 때문에 꼭 필요한 공통적인 속성을 가진 변수에 사용해야한다
	public static int var1; //(클래스 변수)
	
	// 멤버변수 (인스턴스변수)
	// 각각의 객체(인스턴스)마다 개별적인 속성을 가져야할 때 멤버변수(=인스턴스 변수)를 사용하게 된다. (예약어 x)
	public int var2;
	private int var3; //캡슐화를 원칙으로 private 사용   ++           get, set 사용해야함.
	int var4;  //접근제한자 생략시 default 접근제한자로 사용   ++          다른 패키지에서 접근 안됨
	
	// 생성자
	public FieldExam() {
		String var5="생성자 지역변수"; //지역변수 (메서드 안에 생성된 변수)
		System.out.println(var5);
	}
	
	//  초기화블럭 
	{
		String var6 = "초기화 블럭 지역"; //위 처럼 지역변수
		System.out.println(var6);
	}
	
	// 메소드 영역내에서 변수지정
	public String method() { //지역변수
		String var7="메소드 안의 지역변수";
		return var7;
	}
	
	public static String method1() {
		String var8 = "static 안의 지역변수";
		return var8;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
