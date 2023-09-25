package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Model.MusicPlayer;
import Model.MusicVO;
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
		ArrayList<MusicVO> playlist = new ArrayList<>();
		playlist.add(new MusicVO("시작브금1", "BGM", "BGM\\방탈출BGM.mp3"));
		playlist.add(new MusicVO("시작브금2", "BGM", "BGM\\011_키보드+타이핑.mp3"));
		playlist.add(new MusicVO("시작브금3", "BGM", "BGM\\효과음3.mp3"));
		playlist.add(new MusicVO("퀴즈출제", "BGM", "BGM\\11멜로디.mp3"));
		playlist.add(new MusicVO("퀴즈정답", "BGM", "BGM\\015_띠링.mp3"));
		playlist.add(new MusicVO("퀴즈오답", "BGM", "BGM\\107_왕왕왕와~~~~~.mp3"));
		MusicPlayer bgm = new MusicPlayer(playlist);
		if (roomHint == 9 || roomHint == 14) {
			int n = rd.nextInt(20) + 1;
			qd = quiz.selectSense(roomHint);
			bgm.play(3);
		} else if (roomHint == 3 || roomHint == 10) {
			int n = rd.nextInt(19) + 1;
			qd = quiz.selectCapital(n);
			bgm.play(3);
		} else if (roomHint == 8 || roomHint == 13) {
			int n = rd.nextInt(19) + 1;
			qd = quiz.selectFouridioms(n);
			bgm.play(3);
		} else if (roomHint == 1 || roomHint == 5 || roomHint == 11) {
			int n = rd.nextInt(9) + 1;
			qd = quiz.selectJava(n);
			bgm.play(3);
		} else if (roomHint == 4 || roomHint == 7 || roomHint == 12) {
			int n = rd.nextInt(19) + 1;
			qd = quiz.selectNonSense(n);
			bgm.play(3);
		} else if (roomHint == 2 || roomHint == 6 || roomHint == 15) {
			int n = rd.nextInt(9) + 1;
			qd = quiz.selectSql(n);
			bgm.play(3);
		}
		
		isAns = false;
		
		while (!isAns) {
			System.out.println(qd.getQuiz()); // 퀴즈 불러오기
			String answer = sc.next();
			
			if (answer.equals(qd.getAnswer())||answer.equals("escape")) {
				bgm.play(4);
				System.out.println("비밀번호를 획득했습니다.");
				System.out.println(p.getPw()[cnt]);
				isAns = true;
			} else {
				bgm.play(5);
				System.out.println("재시도 해주십시오."); // 틀릴 경우 재시도
			}
		} // while

	}

}
