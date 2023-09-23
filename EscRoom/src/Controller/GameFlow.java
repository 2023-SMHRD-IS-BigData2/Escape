package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GameFlow {
	QuizChoice qc = new QuizChoice();
	public int mode;
	int roomHint;
	Scanner scan = new Scanner(System.in);
	
	HashMap<Integer, String> SelOfHint = new HashMap<Integer, String>() {
		{
			put(1, "[1]가구1");
			put(2, "[2]가구2");
			put(3, "[3]가구3");
			put(4, "[4]가구4");
			put(5, "[5]가구5");
			put(6, "[6]가구6");
			put(7, "[7]가구7");
			put(8, "[8]가구8");
			put(9, "[9]가구9");
			put(10, "[10]가구10");
			put(11, "[11]가구11");
			put(12, "[12]가구12");
			put(13, "[13]가구13");
			put(14, "[14]가구14");
			put(15, "[15]가구15");
		}
	};

	public void getMode(int mode) {
		switch (mode) { // 모드 선택에 따른 출력
		case 1:
			easyMode();
			break;
		case 2:
			nomalMode();
			break;
		case 3:
			hardMode();
			break;

		}

	}// switch

	public void easyMode() {

		System.out.println("이지모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");
		System.out.println("각 방마다 비밀번호 2개씩 얻어서 탈출할 수 있다, 잘 기억해둬!");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵

		// 게임 시작

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 4; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt); // 퀴즈 문제 생성 + 맞힌 후 비밀번호 한자리씩 출력 기능
			SelOfHint.remove(roomHint);
			cnt++;// 각 방마다 얻을 수 있는 힌트 수만큼 반복 진행
		} // for

		System.out.println("멘트"); //

		System.out.println("두번째 방");

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");

		for (int cnt = 2; cnt < 4;) {
			System.out.println();
			for (int i = 4; i < 7; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		} // for
	}

	public void nomalMode() {
	
		System.out.println("노말모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 4; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		System.out.println("멘트"); //

		System.out.println("두번째 방");

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 2; cnt < 4;) {
			System.out.println();
			for (int i = 4; i < 7; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		System.out.println("멘트");

		System.out.println("세번째 방");

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 4; cnt < 6;) {
			System.out.println();
			for (int i = 7; i < 11; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}
	}

	public void hardMode() {
			
		System.out.println("하드모드의 방에 온 걸 환영한다");
		
		System.out.println("그럼 시작하지..");
		
		System.out.println("총 찾아야 할 비밀번호 8자리이니 열심히 하라구");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작
		System.out.println("이 방에 숨겨진 비밀번호 총 2개야");

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 6; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		System.out.println("멘트"); //

		System.out.println("두번째 방");

		System.out.println("이 방은 비밀번호 3개가 숨겨져 있어!");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 2; cnt < 5;) {
			System.out.println();
			for (int i = 7; i < 11; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		System.out.println("멘트");

		System.out.println("세번째 방");
		System.out.println("마지막 방이군 여기서 3개만 더 찾으면 탈출 각이군");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 5; cnt < 8;) {
			System.out.println();
			for (int i = 11; i < 16; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}

	}

}
