package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelDAO {
	// DB 연동관련 메소드 ㄱㄱ
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "campus_22IS_BIG2_mini_2";
			String password = "smhrd2";
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//회원가입
	public int getjoin(ModelDTO mdto) {

		getConn();
		String sql = "insert into member values(?,?,?)";
		int row = 0;
		try {
			psmt = conn.prepareStatement(sql);
			// ?채우기
			psmt.setString(1, mdto.getId());
			psmt.setString(2, mdto.getPw());
			psmt.setString(3, mdto.getName());

			// sql실행
			row = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}
	//로그인
	public boolean getlog(String inpID, String inpPw) {

		getConn();
		String sql = "select * from member where member_id =? and member_pw =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inpID);
			psmt.setString(2, inpPw);

			rs = psmt.executeQuery();
			if (rs.next()) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}

		return false;

	}

	public void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
