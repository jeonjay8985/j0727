package j0727;

import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		// 실습5-11 문자열 역순
		Scanner s1=new Scanner(System.in);
		
		String str="AB가나";
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
