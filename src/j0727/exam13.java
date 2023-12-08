package j0727;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		// 실습5-10
		
		Scanner s1=new Scanner(System.in);
		System.out.println("에스프레소: 3800, 아메리카노: 2500, 카푸치노: 3000, 카페라떼: 3500");
		
		int price=0;
		int amt=0;
		System.out.print("커피 주문하세요>> ");
		String cafe=s1.next();
		
		int coffee=0;
		
		if(cafe.equals("에스프레소") || cafe.equals("아메리카노") || cafe.equals("카푸치노") || cafe.equals("카페라떼")) {
			System.out.print("주문 잔수>> ");
			coffee=s1.nextInt();
		}
	
		
		switch(cafe) {
		case "에스프레소": 
			price=3800;
			if(coffee>=10) {
				amt=(int)(price*coffee*0.95); //정수->실수 형변환
			}else {
				amt=price*coffee;
			}
			break;
			
		case "아메리카노":
			price=2500;
			amt=price*coffee;
			break;
			
		case "카푸치노":
			price=3000;
			amt=price*coffee;
			break;
			
		case "카페라떼":
			price=3500;
			amt=price*coffee;
			break;
			
		default:
			System.out.println("없는 메뉴입니다");
			break;
		}
		if(cafe.equals("에스프레소") || cafe.equals("아메리카노") || cafe.equals("카푸치노") || cafe.equals("카페라떼")) {
			System.out.println(amt+ "원 입니다");
		}

	}

}
