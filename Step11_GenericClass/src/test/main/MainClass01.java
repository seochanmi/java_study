package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic 클래스를 Apple 로 지정해서 객체 사용하기
		FruitBox<Apple> box=new FruitBox<Apple>();
		box.pack(new Apple());
		Apple a1=box.unPack();
		//Generic 클래스를 Melon 으로 지정해서 객체 사용하기
		FruitBox<Melon> box2=new FruitBox<>(); //앞에 제너릭만 신경쓰면 된다. 뒤에 <>안에는 생략이 가능하다
		box2.pack(new Melon());
		Melon m1 = box2.unPack();
		//Generic 클래스를 Orange 으로 지정해서 객체 사용하기
		FruitBox <Orange> box3=new FruitBox<>();
		box3.pack(new Orange());
		Orange o1=box3.unPack();
	
	}
	

}
