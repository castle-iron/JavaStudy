package javaStudy;

/*====================================
■■■ 변수와 자료형
-변수와 자료형 실습 및 테스트 : boolean
======================================*/

public class Test007
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		boolean a = true;
		boolean b;

		int c = 10, d = 5; // 상수를 지정할때도 메모리 필요

		// 연산 및 처리
		b = c < d;
		// b = 10 < 5;
		// b = flase

		// 결과 출력
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
/*
 * 실행결과
 * 
 * a:true b:false 계속하려면 아무 키나 누르십시오 . . .
 * 
 */
