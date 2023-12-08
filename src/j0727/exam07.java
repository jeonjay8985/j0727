package j0727;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// 실습5-04
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("점수를 입력하세여(0~100) : ");
		int score=s1.nextInt();
		System.out.print("학년을 입력하세여(1~4) : ");
		int grade=s1.nextInt();
		
		if(score>=60 && grade!=4) {
			System.out.print("합격!");
		}else if(score>70&& grade==4) {
			System.out.print("합격!");
		} else {
			System.out.print("불합격!");
		}

	}

}
