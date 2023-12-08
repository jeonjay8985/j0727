package j0727;

import java.sql.*;


public class dbConn {

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
             
             String sql="select * from test001"; //*(전체)대신 id, name쓰면 두 개만 읽을 수 있음!
             pstmt=conn.prepareStatement(sql);
             rs=pstmt.executeQuery();
             
             
             
             while(rs.next()) {     //rs.next 다음다음 한 건 한 건 데이터를 읽는것
            	 System.out.print(rs.getInt("id")+ " ");       //(1) //get 가져오는거
            	 System.out.print(rs.getString("name")+ " ");   //(2) //set 넘기는거
            	 System.out.print(rs.getString("phone")+ " ");   //(3)
            	 System.out.print(rs.getString("adress"));        //(4) 순번 적어도 됨
            	 System.out.println();
             }
             
	  }catch(Exception e) { 
		  System.out.println("데이터베이스 연결 실패"); //예외처리용
		  e.printStackTrace();
		  
	  }
	}
}
