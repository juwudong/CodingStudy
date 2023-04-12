import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Number {

	//아규먼트 값을 받는 스트링 배열 args를 선언하는 것!! 와우 사용자가 아규먼트에 입력한 값이 args 라고 생각하면된다.
	public static void main(String[] args) throws IOException { 
		//args도 변수 매개변수값을 받는 paramter
		//Math기능 . 누르면 그 메소드에서 사용할수 있는 기능을 다 보여준다.
		
		System.out.println(Math.PI); //파이 표현 math.pi 3.141592~ math란 클래스에 변수PI 사용
		System.out.println(Math.floor(Math.PI));//내림   math.floor(값); math란 클래스에 메소드 floor 사용
		System.out.println(Math.floor(4.14));	
		System.out.println(Math.ceil(Math.PI));//올림	  math.ceil(값);
		System.out.println("어쩔수가"
				+ "\n없나봐"); // 문자열 입력 중 자르고 싶은 부분에서 엔터 치면 자동으로 끊어준다.
		System.out.println("Hello, teacher ...bye ".replace("teacher","kim" ));
		//replace를 쓰면 replace("문자열1","문자열2") 문자열 1을 2로 바꾸어 출력해준다.
		
		//casting 에 대해서 공부하기 형변환!
		//형태 int a = (int)1.1;     1.1 -> 1으로 저장되어 출력된다.
		int a = (int)1.1;
		String b = "12.34"; //String 타입 12.34입력
		double x = Double.parseDouble(b); 
		System.out.println(a);
		
		//1을 string 타입으로 변환 하고 싶다? 검색하면된다 검색하는 힘을 기르자.
		String st1 = Integer.toString(1);
		System.out.println(st1); //1이 나오게 되지만 데이터타입스트링인 "1" 이 저장되어있다.
		System.out.println(st1.getClass()); //.getClass()는 데이터 문자열 타입의 확인에 쓰인다.
		System.out.println(b.getClass());
		System.out.println(x);
		
		PrintWriter p1 = new PrintWriter("안녕하세요");
		//p1이 인스턴스   new 뒤에 있는 것이 컨스트럭터  PrintWriter("안녕하세요1") 
		
		
		
		
		
		
		
		
		
	}

}
