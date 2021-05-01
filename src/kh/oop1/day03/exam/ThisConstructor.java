package kh.oop1.day03.exam;

public class ThisConstructor {
	
	// this 란? 모든 인스턴스의 메소드에 숨겨진 채 존재하는 레퍼런스로, 할당된 객체를 가리키며 함수 실행시 전달되는 객체의 [주소]를 자동으로 받음
	// 매개변수를 가지는 생성자에서 매개변수 명이 필드명과 같은 경우 사용
	// this()란? 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용, 반드시 [첫번째 줄]에 선언해야함
	
	// 출판사 프로그램
	// 책이름
	private String bookName;
	// 책가격
	private int bookPrise;
	// 출판사
	private String bookPublisher;
	// 책ID
	private int bookID;
	
	public ThisConstructor() {
		System.out.println("기본생성자입니다.");
	}
	
	public ThisConstructor(String bookPublisher) {
		this.bookPublisher = bookPublisher;
		System.out.println("매개변수가 하나인 생성자");
	}
	
	public ThisConstructor(String bookName, int bookPrise, int bookID) {
		this("KH정보교육원"); //매개변수가 하나있는 값을 호출함 //출판사에 KH정보교육원이 입력됨 // 무조건 첫번째 줄에 있어야함
		this.bookName = bookName;
		this.bookPrise = bookPrise;
		this.bookID = bookID;
	}
	
	//getter
	public String getBookName() {
		return bookName;
	}
	public int getBookPrise() {
		return bookPrise;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public int getBookID() {
		return bookID;
	}
	
	
	
	

}
