package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Model.QuizDAO;
import View.PwOfEscape;

public class QuizChoice {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	QuizDAO quiz = new QuizDAO();
	PwOfEscape p = new PwOfEscape();
	
	boolean isAns; //정답에 따라 변경되어 while 탈출
	
	//	ArrayList<String> QuizList = new ArrayList<>(); // 퀴즈db에서 저장받을 배열

	public void Quiz(int roomHint) {
		isAns = false;
		int n = rd.nextInt(9)+1;
		while (!isAns) {
			System.out.println(quiz.selectAll(n).getQuiz()); //퀴즈 불러오기
			String answer = sc.next();
			if (answer.equals(quiz.selectAll(n).getAnswer())||answer.equals("escape")) {
				System.out.println("비밀번호를 획득했습니다.");
				System.out.println(p.getPw()[roomHint]);
				isAns = true;
			}else {
				System.out.println("재시도 해주십시오."); // 틀릴 경우 재시도
			} 
		}//while
	}

}
