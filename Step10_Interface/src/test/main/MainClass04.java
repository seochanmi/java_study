package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요!");
			}
		});
	//다 생략하고 화살표함수형태로 쓸수있음, 추상메소드1개인경우에만 사용가능
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫어요!");
		});  
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
