package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizChoice {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	boolean isAns = false; //정답에 따라 변경되어 while 탈출
	ArrayList<String> QuizList = new ArrayList<>(); // 퀴즈db에서 저장받을 배열

	public void Quiz(int roomHint) {
		while (!isAns) {
			//힌트 선택되면 퀴즈 출력
			System.out.println("퀴즈 출력"); // 메소드 작동 테스트용
			break; // 테스트 중
//			System.out.println(QuizList.get(i).퀴즈); //퀴즈 불러오기
//			String answer = sc.next();
//			if (answer.equals(QuizList.get(i).정답)) {
//				QuizList.remove(i); //맞힌 퀴즈는 삭제
//				isAns = true;
//			} else if{
//				System.out.println("다시 생각해"); // 틀릴 경우 재시도
//			} else if(answer.quals("살려주세요")) { //무한루프 탈출 키워드
//				isAns = true;
//			}
		}

	}

}
