package j0727;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		// 실습5-07
		
       Scanner s1=new Scanner(System.in);
		
		System.out.println("돈의 액수를 입력하세요 >> ");
		int fee=s1.nextInt();
		
		System.out.println("입력한 금액 : " +fee);
		
		int oman =0;
		int man =0;
		int ocheon =0;
		int cheon =0;
		int obaek =0;
		int baek =0;
		int sib =0;
		int il =0;
		
	    oman=fee/50000;
	    man=fee%50000/10000;
	    ocheon=fee%50000%10000/5000;
	    cheon=fee%50000%10000%5000/1000;
	    obaek=fee%50000%10000%5000%1000/500;
	    baek=fee%50000%10000%5000%1000%500/100;
	    sib=fee%50000%10000%5000%1000%500%100/10;
	    il=fee%50000%10000%5000%1000%500%100%10/1;
	    
	    System.out.println("오만원 :  " +oman+ "개");
	    System.out.println("만원 :  " +man+ "개");
	    System.out.println("5천원 :  " +ocheon+ "개");
	    System.out.println("천원 :  " +cheon+ "개");	
	    System.out.println("500원 :  " +obaek+ "개");	
	    System.out.println("100원 :  " +baek+ "개");	
	    System.out.println("10원 :  " +sib+ "개");	
	    System.out.println("1원 :  " +il+ "개");	

	}

}
