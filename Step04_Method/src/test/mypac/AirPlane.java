package test.mypac;

public class AirPlane {

	public void fly() {
	System.out.println("날아요!"); 
	Test t=new Test();
	//return type이 void 인 메소드 호출
	t.walk();
	//return type이 int인 메소드 호출하고 리턴되는 값을 a 라는 int type 지역변수에 담기
	int a=t.getNumber();
	//return type이 String인 메소드 호출하고 리턴되는 값을 b라는 String type 지역변수에 담기
	String b=t.getGreeting();
	//return type이 AirPlane인 메소드 호출하고 리턴되는 값을 c라는 AirPlane type 지역변수에 담기
	AirPlane c=t.getPlane();
	//c 에 담긴값을 이용해서 fly() 메소드를 호출해보세요.
	//c.fly();
		
		//Test.java에서 메소드의 인자로 전달받는 문제와 연결되서 생각
		
		int tmp=999;
		// 위에서 생성한 객체의 setNum() 메소드를 호출해 보세요.
		t.setNum(tmp);  
		t.setNum(a);
		// 위에서 생성한 객체의 setName() 메소드를 호출해보세요.
		t.setName("kim"); //직접 만드는거
		t.setName(b);     //위에 이미 만든걸 참조해서 전달함
		//위에서 생성한 객체의  setPlane() 메소드를 호출해보세요.
		t.setPlane(new AirPlane());
		t.setPlane(c);
		
		t.doSomething(10, "xxx", new AirPlane());
	}
}
