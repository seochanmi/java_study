package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됩니다");
		/*
		 * new Student() 는 Student() 객체를 생성할때 사용하는 표현식인데
		 * 
		 * 이것은 Student 클래스의 생성자(constructor)를 호출하는 표현식이다!
		 * */
		Student s1=new Student();
		s1.study();
		
		System.out.println("main 메소드가 종료됩니다");
	}

}
