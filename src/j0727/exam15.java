package j0727;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		// 실습5-12
		
		Scanner s1=new Scanner(System.in);
		System.out.print("문자열 s1: ");
		String str1=s1.nextLine();
		System.out.print("문자열 s2: ");
		String str2=s1.nextLine();
		
		int idx=str1.indexOf(str2);     //포함이 되지 않으면 -1을 반환, 포함되면 자리수를 알려줌
		System.out.println(idx);
		
	    if(idx==-1) {
	    	System.out.println("문자가 포함되지 않음");
	    }else {
	    	System.out.println(str1);
	    	for(int i=1; i<=idx; i++) {
	    		System.out.print(" ");   //5면 5칸을 띄워줌
	    	}
	    	 System.out.print(str2);
	    }
		
		/*
		Scanner s1=new Scanner(System.in);
		
		System.out.print("문자열 s1: ");
		String str1=s1.nextLine();
		System.out.print("문자열 s2: ");
		String str2=s1.nextLine();
		
		if(str1.contains(str2)) {
			System.out.println(str1);
			System.out.println(str2);
		}
		else
			System.out.println("포함되어 있지 않습니다");
		
		*/

	}

}
