package Controller;

import java.util.Scanner;

public class GameFlow {
	public int mode;
	int roomHint;
	Scanner scan = new Scanner(System.in);
	public void getMode(int mode) {
		switch(mode) { //모드 선택에 따른 출력
		case 1 :
			easyMode();
			break;
		case 2 :
			nomalMode();
			break;
		case 3 :
			hardMode();
			break;

		}
		
	}//switch

	public void easyMode() {
		System.out.println("이지모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
		System.out.println("멘트"); //
		System.out.println("두번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
	}

	public void nomalMode() {
		System.out.println("노말모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
		System.out.println("멘트"); //
		
		System.out.println("두번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
		System.out.println("멘트");
		
		System.out.println("세번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
	}

	public void hardMode() {
		System.out.println("하드모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
		System.out.println("멘트"); //
		
		System.out.println("두번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
		System.out.println("멘트");
		
		System.out.println("세번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
//		QuizChoice(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드

	}

}
