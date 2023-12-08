package j0727;

public class exam01 {

	public static void main(String[] args) {
		// 문자열 비교
		
		String s="Java Programming";
		String s1="Java";           
		String s2=" Programming";
		String s3=s1.concat(s2);    //s3=s1+s2
		String s4=s.trim();
		String s5="Java";
		
		System.out.println("s3 : " +s3);
		System.out.println("s4 : " +s4);
		
		System.out.println(s3 == s4);   //s1=s5 같은 메모리를 공유하지 않는 경우 false
		System.out.println(s3 != s4);
		System.out.println(s3.equals(s4)); //equals는 내용이 같은지(문자열이 같은지)를 묻는것!
		System.out.println(s1 == s5);  //s1=s5 같은 메모리를 공유하게 될 경우 true
		
		
	}

}
