package j0727;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		// 실습5-05 if
		
		Scanner s1 = new Scanner(System.in);
		 System.out.print("등급입력 : ");
		 String grade=s1.next();
		 
		 if(grade.equals("A")) {
			 System.out.println("축하합니다");
			 System.out.print("잘했습니다");
		 }else if(grade.equals("B")) {
		     System.out.print("좋아요");
		 }else if(grade.equals("C")) {
		     System.out.print("노력하세요");
		 }else {
			 System.out.print("탈락입니다!");
		 }
			
		  /*
		  int sum=0;
		  while(true) { 
		   System.out.print("등급입력 : ");
			String grade=s1.next();
			  if(grade.equals("q")) {
			    	System.out.printf("total : %d\n", sum);
			    	break;
			    }
			    sum=sum+Integer.parseInt(grade); //스트링 문자를 숫자로 바꿔줌
	         */
		
	
	   }
	}

