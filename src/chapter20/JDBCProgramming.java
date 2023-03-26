package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception {
		
//		  JDBC (Java DataBase Connectivity)
//		  0.준비물 : dbms 전용 드라이버(oracle driver) ojdbc.jar
//		  방법
//		  1. 드라이버 로딩(Reflection 기법 사용)
		  Class.forName("oracle.jdbc.driver.OracleDriver");
//		  2. 접속 경로를 이용하여 DBMS에 접속(Connection)
		  Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KYW95", "java");
//		  3. 쿼리를 전송할 객체(Statement) 생성
		  Statement statement = connection.createStatement();
//		  4. 쿼리를 실행 또는 전송
		  String sql = "select mem_id, mem_name, mem_hp, mem_mail from member";
		 
//		  5. select: statement.executeQuery(sql); => 쿼리 결과를 객체(ResultSet)로 전달 받음
//		     insert,update,delete: statement.executeUpdate(sql); => 실행 완료된 row 카운트 결과 전공
		  ResultSet resultSet = statement.executeQuery(sql);
		  
		  while(resultSet.next()) {
			  String memId = resultSet.getString("mem_id");
			  String memName = resultSet.getString("mem_name");
			  String memHp = resultSet.getString("mem_hp");
			  String memMail = resultSet.getString("mem_mail");
			  System.out.printf("%s\t%s\t%s\t%s\n",memId,memName,memHp,memMail);
		  }
//		  6. 자원(Resource: Connection, Statement, ResultSet) 반납
		  resultSet.close();
		  statement.close();
		  connection.close();
		  // ** MVC Pattern ** , design pattern Gof
		  // Model,View
		  //2/9 db설계, mvc
	}
}
