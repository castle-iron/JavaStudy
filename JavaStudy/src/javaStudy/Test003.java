package javaStudy;

/*
	■■■자바기본 프로그래밍■■■
		변수와 자료형 2020/01/30
*/
public class Test003
{

	public static void main(String[] args)
	{
		// 변수 선언
		int a;

		// 변수 초기화(변수a에 10대입)
		a = 10;

		// 변수 선언 및 초기화
		int b = 20;

		// 변수 선언
		int c;

		// 테스트
		// System.out.println(c);
		// --==>> 에러 발생(컴파일 에러)

		// 연산 및 처리
		c = a + b;

		// 결과 출력
		System.out.println(c);

		// 결과 출력
		// System.out.println(abc); // int a,int b,int c 처럼 해야한다.
		// --==>> 에러 발생(컴파일 에러)

		// ※ 덧셈 연산자(+)
		// 피연산자 중 어느 하나라도 문자열 형태가 존재한다면
		// 산술연산자로써의 기능을 수행하는게 아니라
		// 문자열 결합 연산자로써의 기능을 수행하게된다.

		System.out.println(a + "" + b + "" + c);
		// --==>> 10 20 30

		System.out.println("a의 값은" + a + "입니다");
		System.out.println("b의 값은" + b + "입니다");
		System.out.println("a와 b를 더한 결과값:" + c);

	}

}

/*
 * [실행결과]
 * 
 * 30 102030 a의 값은10입니다 b의 값은20입니다 a와 b를 더한 결과값:30 계속하려면 아무 키나 누르십시오 . . .
 */