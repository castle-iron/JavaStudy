package javaStudy;

/*================================
■■■ 클래스와 인스턴스 ■■■
=================================*/

// ※ Test066.java 파일과 세트

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명: circleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx

// 반지름이 xx 인 원의
// 넓이 : xxx.xx
// 둘레 : xxx.xx
// 게속하려면 아무 키나 누르세요...



/*
	int b,n,d;

	int in() // 입력
	{
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력: ");
		b = Integer.parseInt(sc.readLine()); 

	}

	 int n() // 넓이
	{

	double p= 3.141592;
	int result = b*b*p;


	}

	 int d() // 둘레

	{
		
	double p= 3.141592;
	int result2 = b*2*p;
	}
		 int c() // 출력

		{
		System.out.print("넓이 : "+ result);
		System.out.print("둘레 : "+ result2);
		}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest

{
	// 멤버 변수 → 주요 속성
	int r=0;						// 반지름
	final double PI = 3.141592; // 변수의 상수화

	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException  // input 밖으로 던지는것
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력: ");
		r = Integer.parseInt(br.readLine()); 
	}

	// 넓이 계산 기능 → 메소드 정의
	double calArea()	
	{
		double result;

		result = r * r * PI;

		return result;	
	}

	// 둘레 계산 기능 → 메소드 정의
	double calLength()
	{
	
		double result;

		result = r * 2 * PI;

		return result;
		
	}

	// 결과 출력 기능 → 메소드 정의
	void print (double a, double l)
	{
	// 반지름이 xx인 원의
	// 넓이 : xxx.xx
	// 둘레 : xxx.xx

	System.out.printf("반지름이 %d 인 원의\n",r);
	System.out.printf("넓이 : %.2f\n",a);
	System.out.printf("둘레 : %.2f\n",l);
	}

		public static void main (String [] args)
		{
			
	

		}

}