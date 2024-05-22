package test.mypac;

public class Student {
//public 클래스명() {} 이런 모양의 생성자가 생략되어 있다(없어도 있다고 간주)
	public Student() {
		//객체를 생성하는 시점에 무언가 준비 작업을 하고 싶으면 여기서 한다.
		System.out.println("Student 객체를 초기화합니다");
	}
	
	public void study() {
		System.out.println("공부해요!");
	}
}
