package j0727;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// 실습5-03
		Scanner s1 = new Scanner(System.in);
		int[] numArr=new int[10];
		System.out.print("정수 10개를 입력하세요 : ");
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=s1.nextInt();
		}
		
		System.out.print("3의 배수 >> ");
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i]%3==0) {
				System.out.printf("%d ", numArr[i]);
			}
		}

	}

}
