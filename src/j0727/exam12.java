package j0727;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		// 실습5-09 switch
		
		Scanner s1=new Scanner(System.in);
		System.out.println("에스프레소: 3800, 아메리카노: 2500, 카푸치노: 3000, 카페라떼: 3500");
		
		int price=0;
		
		System.out.print("커피 주문하세요>> ");
		String cafe=s1.next();
		
		System.out.print("주문 잔수>> ");
		int coffee=s1.nextInt();
		
		switch(cafe) {
		case "에스프레소": 
			price=3800;
			break;
			
		case "아메리카노":
			price=2500;
			break;
			
		case "카푸치노":
			price=3000;
			break;
			
		case "카페라떼":
			price=3500;
			break;
		}
		
		System.out.println(coffee*price+ "원 입니다");
		

	}

}
