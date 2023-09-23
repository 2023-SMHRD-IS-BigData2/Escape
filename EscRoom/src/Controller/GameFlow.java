package Controller;

import java.util.Scanner;

public class GameFlow {
	QuizChoice qc = new QuizChoice();
	public int mode;
	int roomHint;
	Scanner scan = new Scanner(System.in);

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
			System.out.println("[1]가구1 [2]가구2 [3]가구");
			roomHint = scan.nextInt();
			System.out.println(cnt);
			qc.Quiz(cnt);// 스토리에 따른 퀴즈 나오고 게임 진행 메소드
			cnt++;
		}

		System.out.println("멘트"); //

		System.out.println("두번째 방");
		
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 2; cnt < 4;) {
			System.out.println("[1]가구1 [2]가구2 [3]가구3");
			roomHint = scan.nextInt();
			qc.Quiz(cnt); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
			cnt++;
		}
	}

	public void nomalMode() {
		System.out.println("노말모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 0; cnt < 2;) {
			System.out.println("[1]가구1 [2]가구2 [3]가구");
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			cnt++;
		}

		System.out.println("멘트"); //

		System.out.println("두번째 방");

		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 2; cnt < 4;) {
			System.out.println("[1]가구1 [2]가구2 [3]가구3");
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			cnt++;
		}

		System.out.println("멘트");

		System.out.println("세번째 방");
		
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for(int cnt = 4; cnt < 6; ) {
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4");
		roomHint = scan.nextInt();
		qc.Quiz(cnt);
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
		for(int cnt=0; cnt < 2; ) {
		System.out.println("[1]가구1 [2]가구2 [3]가구 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
		qc.Quiz(cnt);
		cnt++;
		}

		System.out.println("멘트"); //

		System.out.println("두번째 방");
		
		System.out.println("이 방은 비밀번호 3개가 숨겨져 있어!");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for(int cnt=2; cnt<5;) {
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
		qc.Quiz(cnt);
		cnt++;
		}

		System.out.println("멘트");

		System.out.println("세번째 방");
		System.out.println("마지막 방이군 여기서 3개만 더 찾으면 탈출 각이군");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for(int cnt=5; cnt<8;) {
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
		qc.Quiz(cnt);
		cnt++;
		}

	}

}
