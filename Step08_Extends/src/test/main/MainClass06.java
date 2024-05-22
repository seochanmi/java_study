package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//핸드폰 객체가 하나 있다고 가정하자//원래 안드로이드폰이고 핸드폰사용설명서라면
		HandPhone p1=new AndroidPhone();
		
		//안드로이드 폰이 필요하다고 해서 핸드폰 객체로 안드로이드 폰을 만들 수있을까?
		AndroidPhone p2= (AndroidPhone)p1; //ClassCastException 발생!
		
		//이게 가능할까???
		p2.doInternet();
	}

}
