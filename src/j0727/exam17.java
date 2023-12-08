package j0727;

public class exam17 {

	public static void main(String[] args) {
		// 실습5-14
		
		String str1="ABC";
		String str2="XYZ";
		
		System.out.println("문자열 s1 : " +str1);
		System.out.println("문자열 s2 : " +str2);
		
		System.out.println(str1.compareTo(str2)); 
		int result=str1.compareTo(str2);
		
		if(result <0) {
			System.out.print("s1이 작다");
		}else {
	    	System.out.print("s2가 작다");
			}
		
		
		
		/* 거꾸로 문자열
		
		String str="Java Programming";
		System.out.println("str.length: "+str.length());
		System.out.println("str.charAt(1)" +str.charAt(1)); 
		System.out.println("str.toUpperCase" +str.toUpperCase());
		System.out.println("str.toLowerCase" +str.toLowerCase()); //자바는 대소문자 구별을 함(html은 안함)
				
		
		String str1="Java Programming";
		String str2="Java IT CookBook";
		
		System.out.println("원문자열1 : " +str1);
		System.out.println("원문자열2 : " +str2);
		
		System.out.println(str1.compareTo(str2));  //if "Java" = "Java"일때는 0, P(80)-I(73)=7이 나온것!!
		System.out.println(str1.contains("Java"));
				
		for(int i=str.length()-1; i>=0; i--) {   
		System.out.print(str.charAt(i));  
		*/

	    }
	}

