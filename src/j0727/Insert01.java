package j0727;

import java.sql.*;


public class Insert01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=null; //데이터베이스에 연결하기 위한것. 빨간줄 뜨면 import 자동으로 위에 뜸(ctrl+shift+o)
		String jdbcDriver="com.mysql.cj.jdbc.Driver";  //오라클에서는 mysql.cj이 오라클용으로 바뀜
		String jdbcurl="jdbc:mysql://localhost/yangjung?serverTimezone=UTC"; //양정=데이터베이스이름
		try {
	         Class.forName(jdbcDriver);
             conn=DriverManager.getConnection(jdbcurl, "jeonjay8985", "1234"); //"root"시스템ID
             System.out.println("데이터베이스 연결 성공");
             
             
             PreparedStatement pstmt=null;
             ResultSet rs=null;
             
             
             String sql="delete from test001 where id=?"; //insert into (id, name) values(?,?)
             pstmt=conn.prepareStatement(sql);
             for(int i=1005; i<1015; i++) {
            	 pstmt.setInt(1, i);
            	 String name="홍길동"+i;
            	 pstmt.setString(2, name);
            	 pstmt.executeUpdate();
             }
             System.out.println("입력 성공");
            
	  }catch(Exception e) { 
		  System.out.println("데이터베이스 연결 실패"); //예외처리용
		  e.printStackTrace();
		  
	  }
	}
}
