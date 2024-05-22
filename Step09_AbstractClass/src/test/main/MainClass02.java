package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	//run 했을때 실행의 흐름이 시작되는 아주 특별한 static 메인 메소드
	public static void main(String[] args) {
		//동일한 클래스 안에 있는 static 메소드 호출하기
		MainClass02.test();
		test();//클래스명. 은 생략 가능.동일한공간에있으니 굳이안써도됨
		
		//useString() 메소드를 호출해보세요. 생략도 가능 MainClass02.useString("hi");
		useString("hi");
		// useWeapon() 메소드를 호출해 보세요
		useWeapon(new MyWeapon());
		}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
	// static 메소드 추가
	public static void test() {
		System.out.println("static test() 메소드가 호출됨!");	
	}
	
	public static void useString(String msg) {
		System.out.println("전달 받은 문자열:"+msg);
	}
}
