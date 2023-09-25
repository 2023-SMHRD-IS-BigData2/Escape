package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Model.QuizDAO;
import Model.QuizDTO;
import View.PwOfEscape;

public class QuizChoice {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	QuizDAO quiz = new QuizDAO();
	QuizDTO qd = new QuizDTO(null, null, null, null, null);
	PwOfEscape p = new PwOfEscape();

	boolean isAns; // 정답에 따라 변경되어 while 탈출

	// ArrayList<String> QuizList = new ArrayList<>(); // 퀴즈db에서 저장받을 배열

	public void Quiz(int cnt, int roomHint) {
		if (roomHint == 9 || roomHint == 14) {
			int n = rd.nextInt(20) + 1;
			qd = quiz.selectSense(roomHint);
		} else if (roomHint == 3 || roomHint == 10) {
			int n = rd.nextInt(20) + 1;
			qd = quiz.selectCapital(n);
		} else if (roomHint == 8 || roomHint == 13) {
			int n = rd.nextInt(20) + 1;
			qd = quiz.selectFouridioms(n);
		} else if (roomHint == 1 || roomHint == 5 || roomHint == 11) {
			int n = rd.nextInt(10) + 1;
			qd = quiz.selectJava(n);
		} else if (roomHint == 4 || roomHint == 7 || roomHint == 12) {
			int n = rd.nextInt(20) + 1;
			qd = quiz.selectNonSense(n);
		} else if (roomHint == 2 || roomHint == 6 || roomHint == 15) {
			int n = rd.nextInt(20) + 1;
			qd = quiz.selectSql(n);
		}
		
		isAns = false;
		int n = rd.nextInt(20) + 1;
		while (!isAns) {
			System.out.println(qd.getQuiz()); // 퀴즈 불러오기
			String answer = sc.next();
			
			if (answer.equals(qd.getAnswer())||answer.equals("escape")) {

				System.out.println("비밀번호를 획득했습니다.");
				System.out.println(p.getPw()[cnt]);
				isAns = true;

			} else {
				System.out.println("재시도 해주십시오."); // 틀릴 경우 재시도
			}
		} // while

	}

}
