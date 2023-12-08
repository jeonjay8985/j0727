package j0727;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 실습5-01
		
       Scanner s1=new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>> ");
		int mon=s1.nextInt();
		
		if(mon<6 && mon>2) {
			System.out.print("봄");
		}else if (mon<9 && mon>5 ){
			System.out.print("여름");
		}else if (mon<12 && mon>8 ){
			System.out.print("가을");
		}else if(mon>=13){
			System.out.print("잘못입력");
		}else {
			System.out.print("겨울");



	   }
	}
}
