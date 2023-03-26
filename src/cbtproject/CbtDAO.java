package cbtproject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CbtDAO {
	
	public List<CbtVO> selectSubject(int subjectId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		String sql = null;
		
			builder.append(" SELECT EXAM_ID AS ID,");
			builder.append(" 	    EXAM_Q AS Q,");
			builder.append("        EXAM_A1 AS A1,");
			builder.append("        EXAM_A2 AS A2,");
			builder.append("        EXAM_A3 AS A3,");
			builder.append("        EXAM_A4 AS A4");
			builder.append("   FROM QUESTION");
			if (subjectId != 0) {  
			builder.append("  WHERE SUBJECT_ID = '" + subjectId + "'");
			}
		sql = builder.toString();
		
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<CbtVO> list = new ArrayList<>();
			
			while(resultSet.next()) {
				
				String question = resultSet.getString("Q");
				String answer1 = resultSet.getString("A1");
				String answer2 = resultSet.getString("A2");
				String answer3 = resultSet.getString("A3");
				String answer4 = resultSet.getString("A4");
				list.add(new CbtVO(question, answer1, answer2, answer3, answer4));
		}
			resultSet.close();
			statement.close();
			connection.close();
			return list;
	}
	
	public List<String> selectSubjectAnswer(int subjectId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		String sql = null;
		
		builder.append("  SELECT EXAM_ANSWER");
		builder.append("    FROM QUESTION");
		if(subjectId!=0) {
		      builder.append("   WHERE SUBJECT_ID = '" + subjectId + "'");
		}

		sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		ArrayList<String> subAnswer = new ArrayList<>();
		while(resultSet.next()) {
			String answer = resultSet.getString("EXAM_ANSWER");
			subAnswer.add(answer);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return subAnswer;
	}
	public List<String> selectSubjectExamId(int subjectId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		String sql = null;
		
		builder.append("  SELECT EXAM_ID");
		builder.append("    FROM QUESTION");
		if(subjectId!=0) {
		      builder.append("   WHERE SUBJECT_ID = '" + subjectId + "'");
		}

		sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		ArrayList<String> subAnswer = new ArrayList<>();
		while(resultSet.next()) {
			String examId = resultSet.getString("EXAM_ID");
			subAnswer.add(examId);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return subAnswer;
	}
	
	public int insertTest(CbtVO vo) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);

		StringBuilder builder = new StringBuilder();
		builder.append(" { call INSERT INTO test (");
		builder.append("     test_no,");
		builder.append("     test_date,");
		builder.append("     subject_id,");
		builder.append("     mem_code");
		builder.append(" ) VALUES (");
		builder.append("     fn_create_test_no(SYSDATE),");
		builder.append("     SYSDATE,");
		builder.append("     ?,");
		builder.append("     ?");
		builder.append(" ) }");
		String sql = builder.toString();
        PreparedStatement Statement = connection.prepareStatement(sql);
        Statement.setInt(1,vo.getSubjectId());
        Statement.setString(2, vo.getMemId());
        
        int count = Statement.executeUpdate();
        connection.close();
        Statement.close();

        return count;
	}
	
	public int insertTestScore(int score) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);

		StringBuilder builder = new StringBuilder();
		builder.append(" UPDATE TEST ");
		builder.append("    SET TEST_SCORE = ? ");
		builder.append("  WHERE TEST_NO = (SELECT MAX(TEST_NO) FROM TEST)");
		String sql = builder.toString();
        PreparedStatement Statement = connection.prepareStatement(sql);
        Statement.setInt(1, score);
        int count = Statement.executeUpdate();
        connection.close();
        Statement.close();
        
        return count;
	}
	
	public String selectMaxTestNo() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT MAX(TEST_NO) ");
		builder.append("   FROM TEST");
		String sql = builder.toString();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		String maxTestNo = null;
		while(resultSet.next()) {
		maxTestNo = resultSet.getString("MAX(TEST_NO)");
		}
		
		connection.close();
		statement.close();
		resultSet.close();
		
		return maxTestNo;
	}
	
	public int insertSubmit(List<String> subList) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);
		String sql = " INSERT INTO SUBMIT VALUES( ?,?,?,? )";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, subList.get(0));
		statement.setString(2, subList.get(1));
		statement.setString(3, subList.get(2));
		statement.setString(4, subList.get(3));
		
		int count = statement.executeUpdate();
		connection.close();
		statement.close();
		
		return count;
	}
	
	public int insertWAnswer(List<String> wronganswer) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BASIC_PROJECT";
		String password = "0725";
		Connection connection = DriverManager.getConnection(url,user,password);
		String sql = " INSERT INTO WANSWER VALUES( ?,? ) ";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, wronganswer.get(0));
		statement.setString(2, wronganswer.get(1));
		
		int count = statement.executeUpdate();
		connection.close();
		statement.close();
		
		return count;
	}
}