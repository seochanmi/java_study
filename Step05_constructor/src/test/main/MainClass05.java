package test.main;

import java.util.Random;


public class MainClass05 {

	public static void main(String[] args) {
		// -10 ~ 10사이의 랜덤한 정수를 얻어내 보세요
		Random ran=new Random();
		int ranNum =ran.nextInt(21) - 10;
		//int ranNum3=ran.nextInt(-10, 11);
		System.out.println("hihi");
		//System.out.println(ranNum3);
		// 75 ~ 100 사이의 랜덤한 정수를 얻어내 보세요
		//int ranNum4=ran.nextInt(75, 101);
		int ranNum2=ran.nextInt(26)+75;
		//System.out.println(ranNum4);
		// 1 ~ 45 사이의 랜덤한 정수를 얻어내 보세요
		//int ranNum5=ran.nextInt(1, 46);
		int ranNum3=ran.nextInt(45) + 1;
		//System.out.println(ranNum5);
	}

}
