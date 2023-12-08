package j0727;

import java.util.Scanner;

public class exam18 {
	/*
	public static void text(String A[]) {
		for(int i=0; i=sx.length(); i++) {
			System.out.print(sx).charAt(i));
	}*/
	public static void method(String []sx) {
		for(int i=0; i<sx.length; i++) {             //i=0,1,2 
			for(int j=0; j<sx[i].length(); j++) {  //sx[0], sx[1], sx[2] sx 스트링배열의 글자길이
				System.out.print(sx[i].charAt(j));  
			}
			System.out.println();                   //줄바꿈 포문 안에서 일어나야!
		}
			 
	}
	public static void main(String[] args) {
		// 실습5-15
		
		Scanner s1=new Scanner(System.in);
	
		 String sx[]=null;  //크기가 자동적으로 정해짐
		 sx=new String[0];
		 System.out.print("문자열의 개수를 입력: ");
		 int num=s1.nextInt();
		 sx=new String[num];   //배열 선언
 
		for(int i=0; i<sx.length; i++){
		 System.out.print("sx["+i+"] = ");	
		 sx[i]=s1.next();
		}
		method(sx);             //배열을 넘겼으면 배열로 받아야! 매서드 호출
		 
	}
		/*
		for(int i=str.length()-1; i>=0; i--) {   
			System.out.print(str.charAt(i));  //charAt : 한 자 한 자 찍어줌
		 */
	}

