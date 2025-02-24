package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//인터페이스도 익명 클래스를 활용해서 구현후에 참조값을 얻어낼수있다.
		Remocon r1= new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요!");
				
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요!");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("온도를 올려요!");
			}
			
			@Override
			public void down() {
				System.out.println("온도를 내려요!");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
