package View;

import java.util.Scanner;

import Controller.GameFlow;
import Controller.userLogin;
import Model.MusicPlayer;

public class Game_main {

	public static void main(String[] args) {
		userLogin ud = new userLogin();
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
		//모드 시작 전 멘트
		System.out.println("그럼 게임을 시작해볼까");
		for (int i = 0; i < 3; i++) {
			System.out.print("하" + " ");
		}
		System.out.println(); //한줄 띄어쓰기
		//모드 선택 후 게임 진행
		if (ch == 1) {
			pe.RandomPw(4);  // 난이도에 맞는 비밀번호 자릿수만큼 랜덤 수 생성
			gf.getMode(ch);  // 난이도에 맞는 게임 진행 메소드 소환
		} else if (ch == 2) {
			pe.RandomPw(6); 
			gf.getMode(ch); 
		} else if (ch == 3) {
			pe.RandomPw(8); 
			gf.getMode(ch);
		}

		//문제를 맞힐 경우 작동메소드, 틀릴 경우 작동 메소드

		// 최종단계까지 가면 게임종료

	}	

}
