package kh.oop1.day03.run;
import kh.oop1.day03.exam.BasicVariable;
import kh.oop1.day03.exam.BlockExam;
import kh.oop1.day03.exam.FieldExam;
import kh.oop1.day03.exam.ThisConstructor;

public class Run {

	public static void main(String[] args) {
	/*	// 클래스 변수는 사용할 때 클래스명을 써주고 
		// 클래스명 뒤에 .을 입력후 해당 클래스 안의 클래스 변수 혹은 메소드를 사용할 수 있다.
		System.out.println(FieldExam.var1);
		System.out.println(FieldExam.method1()); //static을 사용한 것들은 바로 사용이 가능함
		
		
		// 멤버변수는 객체를 생성해서 메모리 heap영역에 생성한 후에 접근이 가능하다.
		// 객체를 생성한 후에 변수나 메소드에 접근을 할 수 있다.
		
		FieldExam fe = new FieldExam(); //객체생성
		System.out.println(fe.var2);
		System.out.println(fe.method());
		
		*/
		
		/*BlockExam be = new BlockExam();
		System.out.println(be.name);
		*/
		
		//JVM에서 기본값 확인
	/*	System.out.println("Bool : "+BasicVariable.bool);
		System.out.println("Byte : "+BasicVariable.by);
		System.out.println("Ch : "+BasicVariable.ch);   // \u000000 이 공백으로 처리됨
		System.out.println("Double : "+BasicVariable.d);
		System.out.println("Float : "+BasicVariable.f);
		System.out.println("Int : "+BasicVariable.i);
		System.out.println("Long : "+BasicVariable.l);
		System.out.println("Short : "+BasicVariable.sh);
		System.out.println("String : "+BasicVariable.str);
		*/
		
		ThisConstructor tc = new ThisConstructor("객체",1000,1);
		System.out.println("책이름 : "+tc.getBookName()+" 책가격 : "+tc.getBookPrise() + " 출판사 : "+tc.getBookPublisher()+" 책ID : "+tc.getBookID());
		//출판사에 KH정보교육원이 입력됨
	}

}
