package test.mypac;
/*
 *  class 의 역할
 *  
 *  1. 객체의 설계도 역할
 *  - 객체는 heap 영역(사물함)에 들어 있는 물건이라고 생각하면 된다.
 *  - class 를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼수 있다
 *  - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class 로 설계 할 수 있다.
 *  
 *  2. data type 역할:예시:Car type,Bus type 이자체가 타입이 된다.
 *  
 *  3. static 필드와 메소드를 포함하는 역할
 * 
 */
public class Car {
	//데이터의 저장소(field) 필드2개정의함
	public String name; //선언만 하고 값을 넣지 않으면 객체 생성시 null 로 초기화된다.
	public int price; //선언만 하고 값을 넣지 않으면 객체 생성시 0 으로 초기화된다.
	
	//기능(method)  1개 메소드인데 결과를 반환하지 않는 것임
	public void drive() {
		//this 는 바로 이 객체의 참조값(사물함번호, 사물함1번같은)을 가리키는 예약어이다.
		//this.필드명을 통해 메소드에서 필드를 사용가능
		System.out.println(this.name + " 이(가) 달려요!");
	}
}
