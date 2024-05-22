package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형 -6가지가 있음
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647 약 20억까지 담을수있음
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

// class 의 이름이 MainClass01 (파일명과 동일하게 만들어진다)
public class MainClass01 { //클래스의 범위를 나타내는 괄호(시작)

	// app 을 실행할때(run 버튼을 눌렀을때) 시작되는 main 메소드
    public static void main(String[] args) { //메소드의 범위를 나타내는 괄호(시작)
		//정수형 변수 선언하고 값 대입하기
    	byte iByte=10;
    	short iShort=100;
    	int iInt=1000;
    	long iLong=10000;
    	/*
    	 * int type 변수에 short type 변수에 담긴 내용을 대입한다면?
    	 * -표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에
    	 * 대입 하는 것은 문제가 없다  좁은범위의 변수가 오른쪽에 넣고 왼쪽에 집어넣는건 가능하다
    	 * -따라서 에러를 발생 시키지 않는다.
    	 */
    	int tmp = iShort;
         /*
         *표현 가능한 범위가 오른쪽에 더 넓은 변수에 담긴 내용을 왼쪽에 대입 하려면
         *명시적으로 casting 을 해야 한다. 형변환을 안 하면 에러가 난다 
         */
    	byte tmp2 = (byte)iShort;
    	
    	//실수형 변수 선언하고 값 대입하기
    	float num1=10.1f;
    	double num2=10.2d;
    	double num3=10.3; // d, f 를 붙이지 않으면 double type 으로 간주 된다.
	    // 왼쪽에 더 작은 float type 에 있는 값을 double type 에 담기는 아무런 문제가 없어 형변환 안해도됨
    	double tmp3=num1;
    	
    	// casting 연산자가 필요하다. num2는 원래 double 타입인데 작은게 들어가야 해서 float로 형변환 해줬음
    	double tmp4 = (float)num2;
   
    }//main 메소드의 (끝)
	
}//MainClass01 클래스의 (끝)
