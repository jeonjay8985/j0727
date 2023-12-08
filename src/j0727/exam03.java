package j0727;

public class exam03 {

	public static void main(String[] args) {
		// 문자열 비교
		
		String str1="Java Programming";
		String str2="Java IT CookBook";
		
		System.out.println("원문자열1 : " +str1);
		System.out.println("원문자열2 : " +str2);
		
		System.out.println(str1.compareTo(str2));  //if "Java" = "Java"일때는 0, P(80)-I(73)=7이 나온것!!
		System.out.println(str1.contains("Java")); //str안에 Java가 있는지 묻는것!
		
		
		
	}

}
