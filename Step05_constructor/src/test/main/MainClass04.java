package test.main;

import java.util.Random;

public class MainClass04 {

	public static void main(String[] args) {
		//객체 생성후 참조값을 Random type 지역변수 ran에 담기,import 해야함
		Random ran=new Random();
		//정수 범위 내에서 랜덤한 정수 하나 얻어내기  랜덤클래스->무작위
		int ranNum=ran.nextInt();
		System.out.println(ranNum);
		// 0~9 사이의 랜덤한 정수 얻어내기
		int ranNum2 = ran.nextInt(10);
		System.out.println(ranNum2);
	}

}
