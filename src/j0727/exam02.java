package j0727;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// 문자열 비교 
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str=s1.nextLine();
		String strRep=str.replace(" ", "$"); //공백을->달러로 리플레이스(대치)
		String strSub=str.substring(3,8);
		String strAry[]=str.split(" ");
		System.out.println("입력 문자열 : " +str);
		System.out.println("바꾼 문자열 : " +strRep);
		System.out.println("일부 문자열 : " +strSub);
		for(int i=0; i<strAry.length; i++) {
			System.out.println("분리한 문자열 "+i+ ":" +strAry[i]);
			
		}
		
	}

}
