package j0727;

public class exam16 {

	public static void main(String[] args) {
		// 실습5-13
		// 문자열 비교
		
		String str1="ABC";
		String str2="ABC";
		
		System.out.println("원문자열1 : " +str1);
		System.out.println("원문자열2 : " +str2);
		
		System.out.println(str1.compareTo(str2));  //if "Java" = "Java"일때는 0, P(80)-I(73)=7이 나온것!!
		System.out.println(str1.contains("ABC")); //str안에 Java가 있는지 묻는것!
		
		if(str1==str2) {
			System.out.print("s1과 s2의 내용이 같습니다");
		}

	}

}
