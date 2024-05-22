package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class MyCar extends Car{

	public MyCar(Engine engine) {
		super(engine);
	}
	
	public void myDrive() {
		if(this.engine == null) {
			System.out.println("나만의 방식으로 달려요!");
			return; //메소드를 여기서 리턴시키기(종료시키기)
		}
	System.out.println("나만의 방식으로 달려요!");
	}
}