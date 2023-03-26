package chapter20.memo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.driver.OracleDriver;

// DAO(Data Access Object): 데이터데이스에 접근해서 데이터 처리 담당
public class MemoDAO {
	/*
	 * junit이라는 단위 테스트 라이브러리
	 */
	
	// 전체 목록 조회, 상세 메모 조회, 메모 등록, 수정, 삭제
	public List<MemoVO> selectMemos(String searchWord) throws Exception { // Try/Catch로 하는게 좋음
		//new OracleDriver()
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// DriverManager에 DB드라이버를 등록하는 메소드를 사용할 수도 있음
		// DriverManager.registerDriver(new OracleDriver()); => 오타방지, 객체를 만들어야 하는 단점있음
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KYW95";
		String password = "java";
		Connection connection = DriverManager.getConnection(url,user,password);
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT");
		builder.append("     a.no,");
		builder.append("     a.title,");
		builder.append("     a.content,");
		builder.append("     b.mem_id AS writer,");
		builder.append("     a.register_date,");
		builder.append("     a.modify_date");
		builder.append(" FROM");
		builder.append("     memo a");
		builder.append("     LEFT OUTER JOIN member b ON ( a.writer = b.mem_id )");
		builder.append("     order by 1");
		String sql = builder.toString();
		
		ResultSet resultSet = statement.executeQuery(sql);
		ArrayList<MemoVO> list = new ArrayList<>();
		while(resultSet.next()) {
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Timestamp register_date = resultSet.getTimestamp("register_date");
			Timestamp modify_date = resultSet.getTimestamp("modify_date");
			list.add(new MemoVO(no, title, content, writer, register_date, modify_date));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	public MemoVO selectMemo(int searchNo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KYW95";
		String password = "java";
		Connection connection = DriverManager.getConnection(url,user,password);
		connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT");
		builder.append("     a.no,");
		builder.append("     a.title,");
		builder.append("     a.content,");
		builder.append("     b.mem_id AS writer,");
		builder.append("     a.register_date,");
		builder.append("     a.modify_date");
		builder.append(" FROM");
		builder.append("     memo a");
		builder.append("     INNER JOIN member b ON ( a.writer = b.mem_id )");
		builder.append(" where a.no = ?");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, searchNo);
		
		ResultSet resultSet = statement.executeQuery();
		MemoVO memo = null;
		if(resultSet.next()) {
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Timestamp register_date = resultSet.getTimestamp("register_date");
			Timestamp modify_date = resultSet.getTimestamp("modify_date");
			memo = new MemoVO(no, title, content, writer, register_date, modify_date);
		}
		
		resultSet.close();
		statement.close();
		connection.close();
		
		return memo;
	}
	
	public int insertMemo(MemoVO vo) throws Exception { // 실행된 로그 카운트??
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KYW95";
		String password = "java";
		Connection connection = DriverManager.getConnection(url,user,password);
		connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append(" INSERT INTO memo (");
		builder.append("     no,");
		builder.append("     title,");
		builder.append("     content,");
		builder.append("     writer");
		builder.append(" ) VALUES (");
		builder.append("     seq_memo.NEXTVAL,");
		builder.append("     ?,");
		builder.append("     ?,");
		builder.append("     ?");
		builder.append(" )");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle()); // setString이면 자동으로 ''가 붙음
		statement.setString(2, vo.getContent()); //setInt면 ''가 붙지 않음
		statement.setString(3, vo.getWriter());
		int count = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		return count;
	}
	public int updateMemo(MemoVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KYW95";
		String password = "java";
		Connection connection = DriverManager.getConnection(url,user,password);
		connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append(" UPDATE memo");
		builder.append("     SET");
		builder.append("         no = ?,");
		builder.append("         title = ?,");
		builder.append("         content = ?,");
		builder.append("         writer = ?");
		builder.append(" WHERE");
		builder.append("     no =?");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, vo.getNo());
		statement.setString(2, vo.getTitle());
		statement.setString(3, vo.getContent());
		statement.setString(4, vo.getWriter());
		statement.setInt(5, vo.getNo());
		int count = statement.executeUpdate();
		
		connection.close();
		statement.close();
		
		return count;
	}
	
	public int deleteMemo(int deleteNo) throws Exception { //삭제할 번호 입력받아서 삭제
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KYW95";
		String password = "java";
		Connection connection = DriverManager.getConnection(url,user,password);
		connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append(" DELETE FROM memo WHERE");
		builder.append("     no =?");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, deleteNo);
		int count = statement.executeUpdate();
		
		return count;
	}
}
