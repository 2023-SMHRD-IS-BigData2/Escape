package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Model.QuizDAO;

public class QuizChoice {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	QuizDAO quiz = new QuizDAO();
	boolean isAns = false; //정답에 따라 변경되어 while 탈출
//	ArrayList<String> QuizList = new ArrayList<>(); // 퀴즈db에서 저장받을 배열

	public void Quiz(int roomHint) {
		int n = rd.nextInt();
		while (!isAns) {
			System.out.println(quiz.selectAll(n).getQuiz()); //퀴즈 불러오기
			String answer = sc.next();
			if (answer.equals(quiz.selectAll(n).getAnswer())) {
				
			} else if{
				System.out.println("다시 생각해"); // 틀릴 경우 재시도
			} else if(answer.equals("살려주세요")) { //무한루프 탈출 키워드
				isAns = true;
			}//else if
		}//while

	}

}
