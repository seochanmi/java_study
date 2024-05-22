package test.main;

import test.mypac.Gun;
import test.mypac.MyWeapon;
import test.mypac.Tank;
import test.mypac.Weapon;

public class MainClassex01 {
	
	public static void main(String[] args) {

		//prepare(new Tank());
		Tank t1 = new Tank();
		t1.prepare();
		
		
		prepare(new Gun());
		
		atk(new Gun());
		atk(new Tank()); 
}

		public static void prepare(Weapon weapon) {
			weapon.prepare();
		}
			public static void atk(Weapon weapon) {
			weapon.attack();
			
		}
		
		
	}
	
			
	
	
			

	


