package javaStudy;

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
		
		
	}
	public static void showHi(int cnt)
	{
		
		System.out.println("Hi~");	
			
			showHi(cnt--);	// cnt-- post픽스 방법
			if(cnt==1)		// showHi 값이 if에 접근하지도못함					
			return;			// 메소드 종료를 의미

			
	}
}

/*	[정답]

	public static void showHi(int cnt)
	{
		
		System.out.println("Hi~");	
			if(cnt==1)
			return;	

			showHi(--cnt);
							
			}
*/