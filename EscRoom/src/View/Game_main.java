package View;

import java.util.Scanner;

import Controller.GameFlow;
import Controller.userLogin;
import Model.MusicPlayer;

public class Game_main {

	public static void main(String[] args) {
		userLogin ud = new userLogin();
		// 로그인 회원가입
		PwOfEscape pe = new PwOfEscape();
		StartChoice gs = new StartChoice();
		GameFlow gf = new GameFlow();
		Scanner scan = new Scanner(System.in);
		MusicPlayer stop = null;
		// 게임 소개 화면 - 게임 로고 뿌리기 + bgm(선택사항)

		// 회원가입, 로그인
		ud.log();

		// 게임 시작 선택 (Y/N)
		// 시작용 화면 (Y- 방 화면 출력 , N-3번까지 받아주고 그 다음에는 강제 실행)
		System.out.println("+++++지금부터 나와 함께 게임을 즐겨볼텐가, 거절은 거절하지...(Y/N)");
		gs.startSelect(); //시작하면서 게임 화면 출력 + BGM
		
		// 난이도 선택 사항
		System.out.println("+++++게임을 즐길 난이도를 골라주세요+++++");
		System.out.println("[1] EASY    [2] NOMAL   [3] HARD ");
		int ch = scan.nextInt();
		if (ch == 1) {
			pe.D = 4; // 난이도에 따른 비밀번호 자릿 수 선택
			gf.mode = 1; //난이도 선택에 따라 진행되는 게임 메소드용
		} else if (ch == 2) {
			pe.D = 6;
			gf.mode = 2;
		} else if (ch == 3) {
			pe.D = 8;
			gf.mode = 3;
		}
		pe.RandomPw(); //모드별 비밀번호 생성
		
		System.out.println("그럼 게임을 시작해볼까");
		for (int i = 0; i < 3; i++) {
			System.out.print("하" + " ");
		}

		gf.getMode(gf.mode); //모드에 따라 진행되는 게임 진행용 메소드

		//문제를 맞힐 경우 작동메소드, 틀릴 경우 작동 메소드

		// 최종단계까지 가면 게임종료

	}	

}
