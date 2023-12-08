package j0727;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		// 실습5-06 switch
		
		Scanner s1 = new Scanner(System.in);
		 System.out.print("등급입력 : ");
		 String grade=s1.next();
		 
		 switch(grade) {
		 case("A"):
			 System.out.println("축하합니다");
		     System.out.print("잘했습니다");
		     break;
		 case("B"):
			 System.out.print("좋아요");
		     break;
		 case("C"):
			 System.out.print("노력하세요");
		     break;
		 default:
			System.out.print("탈락입니다!");
		 }
		 /*
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
		*/
		
	}

}
