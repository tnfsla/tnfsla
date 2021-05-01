package kh.oop1.day02.exam;

public class Coffee {  // 클래스 내부에 클래스를 하나 더 만들때는 접근제한자를 public으로 쓸 수 없음. (public 은 다른 패키지에서도 접근 가능)
	//커피판매점
	//1. 메뉴종류 Hot, Ice 아메
	//2. 주문수량
	//[속성값]
	//private String hotAmericano; //
	//private String IceAmericano;
	
	private String americano;
	private char tempratureType;  // Y: hot , N : Ice
	private String size;
	
	// [생성자]
	public Coffee() {}
	
	//getter
	public String getAmericano() {
		return americano;
	}
	
	public char getTempraturType() {
		return tempratureType;
	}
	
	public String getSize() {
		return size;
	}
	
	//setter
	public void setAmericano(String americano) {
		this.americano = americano;
	}
	
	public void setTempraturType(char tempratureType) {
		this.tempratureType = tempratureType;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
	// [기능정의]
	public void orderCoffee() {
		System.out.println("커피 주문");
		
	}
	
}

/*public class CoffeeMachine {
	
}*/  // 사용 불가
class CoffeeMachine{  // 디폴트로 사용해야함 ==> 디폴트는 다른 패키지에서 접근이 불가능함
	public String str1;
	
	public void machine() {
		
		
	}
}

