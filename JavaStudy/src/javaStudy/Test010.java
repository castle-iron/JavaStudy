package javaStudy;

/* ==============================
■■■ 변수와 자료형 ■■■
-퀴즈
사전에 부여된 반지름 정보를 통해
원의 넓이와 둘레를 구하는 프로그램을 구현한다
→반지름 : 10
=================================*/

// 원이 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 넓이 : xxxxx
// 둘레 : xxxxx
// 계속하려면 아무키나 누르세요..

public class Test010
{
	public static void main(String[] args)
	{
		int ban;
		final double Pai; // 변수를 상수화 시키는것 final 를 사용함
		int two; // 상수화된 변수의 이름은 대문자

		ban = 15;
		Pai = 3.141592;
		two = 2;

		System.out.println("원의 넓이 = " + ban * ban * Pai);

		System.out.println("원의 둘레 = " + ban * two * Pai);

		/*
		 * 주요 변수 선언(반지름 원주율 넓이 둘레) int r = 10; double pi = 3.141592 final 키워드는 변수를
		 * 상수화시키는것 final double PI = 3.141592 // 원주율 double area, length // 넓이 둘레
		 * 
		 * //연산 및 처리 1.넓이 연산 원의 넓이 = 반지름 * 반지름 * 3.141592 area = r * r * PI;
		 * 
		 * 2.둘레 연산 원의 둘레 = 반지름 * 2 * 3.141592 length = r* 2 * PI;
		 * 
		 * 3.결과 출력 System.out.println("넓이:"+area); System.out.println("둘레:"+length);
		 * 
		 */
	}
}

/*
 * 
 * 원의 넓이 =314.1592 원의 둘레 =62.83184 계속하려면 아무 키나 누르십시오 .
 * 
 */