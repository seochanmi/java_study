package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {

	public static void main(String[] args) {
		/*
		 * MacBook 객체를 생성해서 참조값을 mac1이라는 지역 변수에 담아 보세요.
		 * 
		 *  주의!!
		 *  -MacBook 클래스를 절대 수정하지 마세요
		 *  -MainClass03 은 test.main 패키지에 있고
		 *   Cpu, Memory, HardDisk, MacBook 클래스는 test.mypac 패키지에 있기 때문에
		 *   4개의 클래스 모두 import 되어야 한다.
		 *  -매개변수에 null 전달 금지
		 */
		MacBook mac1 = new MacBook(new Cpu(), new Memory(),new HardDisk());
		
		//2.미리 준비해둔 해당타입을 직접 참조해서 전달할수도 있다
		Cpu c1=new Cpu();
		Memory m1=new Memory();
		HardDisk h1=new HardDisk();
		
		MacBook mac2=new MacBook(c1, m1, h1);
	}

}
