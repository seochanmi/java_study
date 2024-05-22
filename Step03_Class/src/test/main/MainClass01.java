package test.main;
//다른 패키지의 클래스를 사용하려면 import 해야 한다.
import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		//test.mypac 패키지에 있는 Car 클래스로 객체를 생성하고 생성된 객체의 참조값을 car1 이라는
		//지역변수에 담기  ,여기서 생성한 객체는 27번(디버그)사물함에 들어가있다.
		Car car1 = new Car();
		//메소드 호출   .을 찍었다는건 사물함27번찾아간다는것이다.
		car1.drive();
		//필드에 저장된 값 참조(불러오기)
		String a = car1.name;
		//필드에 값 대입하기
		car1.name = "소나타";
		// 대입한 이후에 필드에 저장된 값 참조(불러오기)
		String b = car1.name;
		//메소드 호출
		car1.drive();
	}

}
