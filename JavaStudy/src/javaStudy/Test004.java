package javaStudy;

/*========================================
■■■ 자바의 개요 및 특징 ■■■
- 변수와 자료형
- 키워드 및 식별자
==========================================*/

public class Test004
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 25;
		char degree = 'A';
		String name = "신성철";
		// String name = "김태균";
		// -- 스코프 영역 안에서 변수명은 식별자!

		// String #name = "최철녕";
		// -- 『$』와 『_』를 제외한 다른 특수문자는
		// 변수의 이름으로 활용할수 없다.
		// 하지만 그나마 사용 가능한 이들 특수문자도
		// 함부로 사용하는 것은 고려해야 한다.

		// int tel = 01012341234
		String tel = "010 1234 1234";
		String _tel = "010 - 1234 - 1234";

		// 전화번호 주민번호같은 숫자로구성되어있고 0으로 시작할경우 주의해야한다.

		String 주소 = "경기도 고양시";
		// 문법적으로 한글단어를 변수명으로 사용할수있지만
		// 실무적인 측면에서 접근한다면
		// 절대로 한글 단어를 변수명으로 사용해서는 안된다.

		// 결과 출력
		System.out.println("name :" + name);
		System.out.println("tel:" + tel);
		System.out.println("_tel:" + _tel);
		System.out.println("주소:" + 주소);

	}

}

// [결과 출력]
/*
 * 
 * name :신성철 tel:01012341234 _tel:010-1234-1234 주소:경기도 고양시 계속하려면 아무 키나 누르십시오 . .
 * .
 * 
 */
