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

	boolean isAns; // 정답에 따라 변경되어 while 탈출

	// ArrayList<String> QuizList = new ArrayList<>(); // 퀴즈db에서 저장받을 배열

	public void Quiz(int roomHint) {
		isAns = false;
		int n = rd.nextInt(20) + 1;
		while (!isAns) {
			System.out.println(quiz.selectAll(n).getQuiz()); // 퀴즈 불러오기
			String answer = sc.next();
<<<<<<< HEAD
			if (answer.equals(quiz.selectAll(n).getAnswer()) || answer.equals("살려주세요")) {
				System.out.println("훗..생각보다 똑똑한가 보군, 비밀번호 한자리 보여주지!!");
=======
			if (answer.equals(quiz.selectAll(n).getAnswer())||answer.equals("helpme")) {
				System.out.println("비밀번호를 획득했습니다.");
>>>>>>> branch 'master' of https://github.com/2023-SMHRD-IS-BigData2/Mini_Project_Team2
				System.out.println(p.getPw()[roomHint]);
				isAns = true;
<<<<<<< HEAD
			} else {
				System.out.println("다시 생각해"); // 틀릴 경우 재시도
			}
		} // while
	}
	public void name() {
		
=======
			}else {
				System.out.println("재시도 해주십시오."); // 틀릴 경우 재시도
			} 
		}//while
>>>>>>> branch 'master' of https://github.com/2023-SMHRD-IS-BigData2/Mini_Project_Team2
	}

}
