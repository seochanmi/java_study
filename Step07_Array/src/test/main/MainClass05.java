package test.main;

import test.mypac.Bike;

public class MainClass05 {

	public static void main(String[] args) {
		/*
		 * 	1. Bike 객체를 담을수있는 방 3개짜리 배열객체를 생성해서 참조값을
		 *     bike 라는 지역 변수에 담아 보세요.
		 *     2. 배열의 각각의 방(0,1,2,번) 에 Bike 객체를 생성해서 담아 보세요.
		 *     3. 반복문 for 를 이용해서 순서대로 배열의 각각의 방에 있는 Bike 객체의
		 *     ride() 메소드를 호출해 보세요. 
		 */
		Bike[] bikes= new Bike[3];
 
		bikes[0] =new Bike();
		bikes[1] =new Bike();
		bikes[2] =new Bike();
 
 for(int i=0; i<bikes.length; i++) {
	 //i 번째 Bike 객체의 참조값을 불러와서 변수에 담은 다음
	Bike tmp = bikes[i];
	// Bike 객체의 ride() 메소드 호출하기
	tmp.ride();
 	}
  }
 
}


