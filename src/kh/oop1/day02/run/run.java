package kh.oop1.day02.run;  // 패키지 선언 한가지만 가능 이름없는 패키지는 다른 패키지에서 사용할 수 없음

import kh.oop1.day02.exam.Coffee; //사용할 클래스가 속한 패키지를 지정하는데 사용한다. kava.lang 은 자동적으로 프로그램에 포함되기때문에 선언하지 않아도 사용이 가능하다. (string Object System.등등이 잇음)
//import java.util.*을 사용하면 util안의 모든 클래스를 사용가능함.
import kh.oop1.day02.exam.*; //사용가능

 
public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee c = new Coffee();
		ImportExam ie = new ImportExam();
		//CoffeeMachine cm = new CoffeeMachine(); 불가능 (디폴트 클래스이기 떄문에)
		
		
		
		System.out.println(ie.piExam());
		System.out.println(ie.randomExam(5));
		System.out.println(ie.sortExam());
	}

}
