package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class QuizDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	Scanner scan = new Scanner(System.in);
	

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "campus_22IS_BIG2_mini_2";
			String password = "smhrd2";
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			conn = DriverManager.getConnection(url, user, password);

			if (conn==null) {
				System.out.println("연결 실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public QuizDTO selectAll(int num) {
		getConn();
		QuizDTO qd = null;
		String sql = "select * from quiz where rownum <= ?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setLong(1, num);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String quiz = rs.getString(1);
				String answer = rs.getString(2);
				String code = rs.getString(3);
				String hinteu = rs.getString(4);
				String object = rs.getString(5);

				qd = new QuizDTO(quiz, answer, code, hinteu, object);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}

		return qd;

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

	public String[] Quiz() {
		Random rd = new Random();
		QuizDAO md = new QuizDAO();
		int num1 = rd.nextInt(80) + 1;
		QuizDTO qd = md.selectAll(num1);
		String[] quiz = { qd.getQuiz(), qd.getAnswer(), qd.getCode(), qd.getHinteu(), qd.getHinteu() };
		return quiz;
	}

}