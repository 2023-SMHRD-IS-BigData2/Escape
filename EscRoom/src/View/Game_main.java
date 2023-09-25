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
		GameEnd ge = new GameEnd();

		Scanner scan = new Scanner(System.in);
		MusicPlayer stop = null;

		// 게임 소개 화면 - 게임 로고 뿌리기 + bgm(선택사항)

		// 회원가입, 로그인
		ud.log();

		// 게임 시작 선택 (Y/N)
		// 시작용 화면 (Y- 방 화면 출력 , N-3번까지 받아주고 그 다음에는 강제 실행)
		System.out.println("" + " _  _ _  ___  ___  ___ \r\n" + "| || \\ ||_ _|| . \\| . |\r\n"
				+ "| ||    | | | |    /| | |\r\n" + "|_||_\\_| |_| |_\\_\\`__'\r\n" + "                       ");
		System.out.println("월요일에 있을 미니 프로젝트를 앞두고 열심히 코드를 짜고있던 S.\n" + "화면에 집중하다보니 빽빽하던 강의실도 텅 비어버렸다.\n"
				+ " 시간은 10시, 슬슬 집에 갈까 생각하면서 피곤한 눈을 깜빡이면….\n" + ".\n" + ".\n" + ".\n" + "'지금부터 게임을 시작하지.'\n"
				+ "... ...이건 뭐야?! 내가 짰던 코드는 어디갔어???\n" + "장난 치지 말고 내 코드 당장 돌려줘요!!!\n");
		// 인트로

		System.out.println("START?  (Y/N)");
		gs.startSelect(); // 시작하면서 게임 화면 출력 + BGM

		// 난이도 선택 사항
		System.out.println("+++++게임의 난이도를 선택해주세요+++++");
		System.out.println("[1] EASY    [2] NOMAL   [3] HARD ");
		int ch = scan.nextInt();

		System.out.println(
				"+++!!!𝗚𝗔𝗠𝗘 𝗥𝗨𝗟𝗘!!!+++\n" + "지금부터 해당 모드로 진입합니다.\n" + "플레이어는 스토리를 진행하며 무사히 S의 코드를 돌려받아야 합니다.\n"
						+ "게임을 무사히 클리어하기 위해서는 비밀번호가 필요합니다.\n" + "비밀번호는 난이도 별 각 4자리, 6자리, 8자리로 구성되어 있으며,\n"
						+ "한 문제 당 한 자리의 비밀번호를 제공합니다.\n" + "그럼, 행운을 빕니다. \n\n\n\n\n"); // 게임 룰 공개

		System.out.println(); // 한줄 띄어쓰기
		// 모드 선택 후 게임 진행
		if (ch == 1) {
			pe.RandomPw(4); // 난이도에 맞는 비밀번호 자릿수만큼 랜덤 수 생성
			gf.getMode(ch); // 난이도에 맞는 게임 진행 메소드 소환
		} else if (ch == 2) {
			pe.RandomPw(6);
			gf.getMode(ch);
		} else if (ch == 3) {
			pe.RandomPw(8);
			gf.getMode(ch);
		}

		// 게임 클리어 한 후 얻은 비밀번호 입력 받고 엔딩스토리 줄력
		ge.theEnd();

	}

}
