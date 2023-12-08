package j0727;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		// 실습5-08 if
		
		Scanner s1=new Scanner(System.in);
		System.out.println("에스프레소: 3800, 아메리카노: 2500, 카푸치노: 3000, 카페라떼: 3500");
		
		int price=0;
		
		System.out.print("커피 주문하세요>> ");
		String cafe=s1.next();
		
		System.out.print("주문 잔수>> ");
		int coffee=s1.nextInt();
		
		if("에스프레소".equals(cafe)) {
			price=3800;
		}else if("아메리카노".equals(cafe)) {
			price=2500;
		}else if("카푸치노".equals(cafe)) {
			price=3000;
		}else if("카페라떼".equals(cafe)) {
			price=3500;
		}
		
		System.out.println(coffee*price+ "원 입니다");
		
		
		
		
		/*
		 if(cafe.equals("에스프레소")) {
			 System.out.print("에스프레소");
		 }else if(cafe.equals("아메리카노")) {
			 System.out.print("아메리카노");
		 }else if(cafe.equals("카푸치노")) {
			 System.out.print("카푸치노"); 
		 }else if(cafe.equals("카페라떼")){
			 System.out.print("카페라떼");
		 }else {
			 System.out.print("주문에 없는 메뉴입니다");
		 }
		 */		 
		
	

	}

}
