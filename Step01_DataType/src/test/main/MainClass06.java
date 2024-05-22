package test.main;

public class MainClass06 {

	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//지역변수를 선언만 하면? 변수가 만들어 지지 않는다. int같은경우 0이라도 string 의경우 null 이라도 집어넣어야 사용할수있다
		int num;
		String name1;
		
		//아직 만들어 지지 않았기 때문에 num 은 참조 불가
		//int result = 10+num
		//아직 만들어지지 않았기 때문에 name1 은 참조 불가
		//System.out.println(name1);
		
		System.out.println("main메소드가 종료 됩니다.");
	}

}
