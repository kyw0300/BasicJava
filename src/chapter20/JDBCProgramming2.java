package chapter20;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgramming2 {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "KYW95";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);
//			String sql = "select mem_id, mem_name, mem_bir, mem_add1, mem_add2, mem_job from member";
//			sql += " SELECT";
//			sql += "     mem_id,";
//			sql += "     mem_name,";
//			sql += "     mem_bir,";
//			sql += "     mem_add1,";
//			sql += "     mem_add2,";
//			sql += "     mem_job";
//			sql += " FROM";
//			sql += "     member";
//			ResultSet resultSet = statement.executeQuery(sql);
			statement = connection.createStatement();
			
			// 문자열 결합보다는 StringBuilder나 StringBuffer를 사용하는게 좋다.
			StringBuilder builder = new StringBuilder();
			builder.append(" SELECT");
			builder.append("     mem_id,");
			builder.append("     mem_name,");
			builder.append("     mem_bir,");
			builder.append("     rpad(mem_add1,20),");
			builder.append("     rpad(mem_add2,20),");
			builder.append("     mem_job");
			builder.append(" FROM");
			builder.append("     member");
			String sql = builder.toString();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				String memId = resultSet.getString("mem_id");
				String memName = resultSet.getString("mem_name");
				Date memBir = resultSet.getDate("mem_bir");
				String memAdd1 = resultSet.getString("rpad(mem_add1,20)");
				String memAdd2 = resultSet.getString("rpad(mem_add2,20)");
				String memJob = resultSet.getString("mem_job");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",memId,memName,memBir.toLocalDate().toString(),
						memAdd1,memAdd2,memJob);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(statement != null) {
					statement.close();					
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
