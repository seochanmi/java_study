package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {

	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을 Object type p3 라는 지역변수에 담기
		Object p3=new HandPhone();
		// casting 연산자를 이용해서 대입연산자의 우측을 Phone type 으로 인식 되도록 한다.
		Phone p2 = (Phone)p3;
		//Phone p2 = p3; 부모타입이 넓은범위라 작은 범위에 넣을수없음 캐스팅방법으론 할 수 있음
		// casting 연산자를 이용해서 대입연산자의 우측을 HandPhone type 으로 인식 되도록 한다.
		HandPhone p1 = (HandPhone)p3;
		
		
	}

}
