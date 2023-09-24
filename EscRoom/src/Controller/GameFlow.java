package Controller;

import java.util.HashMap;
import java.util.Scanner;

public class GameFlow {
	QuizChoice qc = new QuizChoice();
	public int mode;
	int roomHint;
	Scanner scan = new Scanner(System.in);

	HashMap<Integer, String> SelOfHint = new HashMap<Integer, String>() {
		{
			put(1, "[1]S의 컴퓨터  ");
			put(2, "[2]선생님 컴퓨터  ");
			put(3, "[3]벽  ");
			put(4, "[4]간식바구니  ");
			put(5, "[5]Java의 정석 -3rd Edition-  ");
			put(6, "[6]둥근 테이블  ");
			put(7, "[7]정수기  ");
			put(8, "[8]나가는 문  ");
			put(9, "[9]분리수거통  ");
			put(10, "[10]바닥  ");
			put(11, "[11]빔프로젝터  ");
			put(12, "[12]책상을 굴러다니는 영수증  ");
			put(13, "[13]켜져있는 컴퓨터  ");
			put(14, "[14]창문  ");
			put(15, "[15]모니터 받침  ");
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

		System.out.println( "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n"
				+ "𝙀𝘼𝙎𝙔 𝙈𝙊𝘿𝙀 𝙇𝙊𝘼𝘿𝙄𝙉𝙂···\n"
				+"해당 모드에서는 방 별 비밀번호 2개씩 찾을 수 있습니다.\n"
				+ "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n"
				+ "\n\n\n\n\n");

		GameMap map1 = new GameMap(null, null, null, null, null, null);
		System.out.println(map1.getMap3B1());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		// 게임 시작
		System.out.println("+익숙한 강의실이다.\n"
				+"넓은 강의실에는 웅웅거리며 돌아가는 컴퓨터 소리만 난다.\n"
				+"살펴볼 수 있을 것 같다.");
		
		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 4; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			
			if (roomHint == 1) {
				System.out.println("System.out.print(”지금부터 게임을 시작하지.”);\r\n"
						+ "다시봐도 황당한 문구다. 아랫줄에 무언가 더 출력되어있다.\r\n"
						+ "\r\n"
						+ "잃어버린 코드는 돌아오지 않는다.\n"
						+ "요즘같은 시대에 백업도 없다는게 말이되나...? \n"
						+ "문제가 하나 나왔다.\n");
			} //1번 선택시 스크립트
			else if (roomHint == 2) {			
				System.out.println("이클립스 콘솔창만 덩그러니 남아있다.\r\n"
						+ "\r\n"
						+ "Escape Key : 탈출 글쇠\n"
						+ "Escape : 빠져나오다, 피하다, 무사하다\n"
						+ "아직 이해하지 못할 이야기가 적혀있다.\r\n"
						+ ".\r\n"
						+ ".\r\n"
						+ ".\r\n"
						+ "곧 콘솔창이 자동으로 움직인다.\r\n"
						+ "문제가 하나 나왔는데?\n");
			} //2번 선택시 스크립트
			else if (roomHint == 3) {
				System.out.println("누군가 꼬부랑 글씨로 낙서를 해뒀다.\r\n"
						+ "EASTEREGG :: eelmph");
			} //3번 선택시 스크립트
			
			qc.Quiz(cnt); // 퀴즈 문제 생성 + 맞힌 후 비밀번호 한자리씩 출력 기능
			SelOfHint.remove(roomHint);
			cnt++;// 각 방마다 얻을 수 있는 힌트 수만큼 반복 진행
		} // for

		System.out.println("다른 공간도 둘러보는 것이 좋을 것 같다.");
		
		GameMap map2 = new GameMap(null, null, null, null, null, null);
		System.out.println(map2.getMapRest1());

		System.out.println("++++휴게실++++\n"
				+"3-B 강의실 바로 옆의 휴게실이다.\n"
				+ "살펴볼 수 있을 것 같다.");

		if (roomHint == 4) {
			System.out.println("휴게실 가운데에 놓인 테이블이다. \r\n"
					+ "포스트잇이 하나 붙어있다.\r\n"
					+ "\r\n"
					+ "분명 누군가 내 컴퓨터에 손을 댔어.\r\n"
					+ "이렇게까지 아무런 파일도 안 남을리가 없잖아.\n"
					+ "\r\n"
					+ "문제가 하나 나왔다.\n");
		} //1번 선택시 스크립트
		else if (roomHint == 5) {			
			System.out.println("절반쯤 물이 찬 정수기다. 컵이 없어 마신다거나 할 순 없을 것 같다…\r\n"
					+ "정수기와 벽 사이의 틈에 쪽지가 하나 놓여있다.\r\n"
					+ "\r\n"
					+ "스피어 피싱(spear phishing)\n"
					+ ":메일, 팝업 창 또는 웹 사이트의 첨부 파일을 열 경우에... 피해자가 되거나 조직이 위험에 처할 수....\n");
		} //2번 선택시 스크립트
		else if (roomHint == 6) {
			System.out.println("잠겨있다. 자물쇠가 걸려있는데….\r\n"
					+ "비밀번호를 알기 전까진 나갈 수 없을 것 같다.");
		} //3번 선택시 스크립트
		
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
	} //이지모드 종료

	
	
	

	public void nomalMode() {
	
		System.out.println( "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n"
				+ "𝙉𝙊𝙍𝙈𝘼𝙇 𝙈𝙊𝘿𝙀 𝙇𝙊𝘼𝘿𝙄𝙉𝙂···\n"
				+"해당 모드에서는 방 별 비밀번호를 2개씩 찾을 수 있습니다.\n"
				+ "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n"
				+ "\n\n\n\n\n");

		GameMap map1 = new GameMap(null, null, null, null, null, null);
		System.out.println(map1.getMap3B2());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		// 게임 시작
		System.out.println("+익숙한 강의실이다.\n"
				+"넓은 강의실에는 웅웅거리며 돌아가는 컴퓨터 소리만 난다.\n"
				+"살펴볼 수 있을 것 같다.");
		
		for (int cnt = 0; cnt < 4;) {
			System.out.println();
			for (int i = 1; i < 5; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}
		if (roomHint == 1) {
			System.out.println("System.out.print(”지금부터 게임을 시작하지.”);\r\n"
					+ "다시봐도 황당한 문구다. 아랫줄에 무언가 더 출력되어있다.\r\n"
					+ "\r\n"
					+ "잃어버린 코드는 돌아오지 않는다.\n"
					+ "요즘같은 시대에 백업도 없다는게 말이되나...? \n"
					+ "문제가 하나 나왔다.\n");
		} //1번 선택시 스크립트
		else if (roomHint == 2) {			
			System.out.println("이클립스 콘솔창만 덩그러니 남아있다.\r\n"
					+ "\r\n"
					+ "Escape Key : 탈출 글쇠\n"
					+ "Escape : 빠져나오다, 피하다, 무사하다\n"
					+ "아직 이해하지 못할 이야기가 적혀있다.\r\n"
					+ ".\r\n"
					+ ".\r\n"
					+ ".\r\n"
					+ "곧 콘솔창이 자동으로 움직인다.\r\n"
					+ "문제가 하나 나왔는데?\n");
		} //2번 선택시 스크립트
		else if (roomHint == 3) {
			System.out.println("누군가 꼬부랑 글씨로 낙서를 해뒀다.\r\n"
					+ "EASTEREGG :: eelmph");
		} //3번 선택시 스크립트
		else if (roomHint == 4) {
			System.out.println("아침에 눈을 뜨면 지난 밤이 궁금해~ 오늘은 어떤 간식이 날 기다릴까♫\r\n"
					+ "간식 대신 찢어진 노트가 놓여있다.\n"
					+ "오늘도 야근, 내일도 야근..... \n"
					+ "그래도 내일이면 프로젝트가 끝나는 날이다. 드디어.....\n");
		}


		GameMap map2 = new GameMap(null, null, null, null, null, null);
		System.out.println(map2.getMapRest2());
		System.out.println("+++휴게실+++"); 

	
		for (int cnt = 3; cnt < 6;) {
			System.out.println();
			for (int i = 5; i < 8; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
			
			if (roomHint == 5) {
				System.out.println("");
			} //1번 선택시 스크립트
			else if (roomHint == 6) {			
				System.out.println();
			} //2번 선택시 스크립트
			else if (roomHint == 7) {
				System.out.println("");
			}



		}
		GameMap map3 = new GameMap(null, null, null, null, null, null);
		System.out.println(map3.getMap3A1());
		System.out.println("+++3-A 강의실+++"); // 처음 입장하는 방 화면 또는 맵
		
		for (int cnt = 4; cnt < 6;) {
			System.out.println();
			for (int i = 8; i < 11; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
			
			if (roomHint == 8) {
				System.out.println("");
			} //1번 선택시 스크립트
			else if (roomHint == 9) {			
				System.out.println("");
			} //2번 선택시 스크립트
			else if (roomHint == 10) {			
				System.out.println("");
			} //2번 선택시 스크립트
		}
		
	} //노말모드 종료
	
	
	
	
	

	public void hardMode() {
			
		System.out.println("≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n"
				+ "𝙃𝘼𝙍𝘿 𝙈𝙊𝘿𝙀 𝙇𝙊𝘼𝘿𝙄𝙉𝙂···\n"
				+"해당 모드에서는 방 별 비밀번호를 2~3개씩 찾을 수 있습니다.\n"
				+ "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n"
				+ "\n\n\n\n\n");

		GameMap map1 = new GameMap(null, null, null, null, null, null);
		System.out.println(map1.getMap3B2());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		
		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 6; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		if (roomHint == 1) {
			System.out.println("");
		} 
		else if (roomHint == 2) {			
			System.out.println("");
		} 
		else if (roomHint == 3) {			
			System.out.println("");
		}
		else if (roomHint == 4) {			
			System.out.println("");
		} 
		else if (roomHint == 5) {			
			System.out.println("");
		}	

		
		GameMap map2 = new GameMap(null, null, null, null, null, null);
		System.out.println(map1.getMapRest2());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		for (int cnt = 2; cnt < 5;) {
			System.out.println();
			for (int i = 7; i < 11; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}
		
		if (roomHint == 6) {
			System.out.println("");
		} 
		else if (roomHint == 7) {			
			System.out.println("");
		} 
		else if (roomHint == 8) {			
			System.out.println("");
		}
		else if (roomHint == 9) {			
			System.out.println("");
		} 
		else if (roomHint == 10) {			
			System.out.println("");
		}	

		GameMap map3 = new GameMap(null, null, null, null, null, null);
		System.out.println(map3.getMap3A2());
		System.out.println("+++3-A 강의실+++"); // 처음 입장하는 방 화면 또는 맵
		
		for (int cnt = 4; cnt < 6;) {
			System.out.println();
			for (int i = 8; i < 11; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
			
			if (roomHint == 11) {
				System.out.println("");
			} 
			else if (roomHint == 12) {			
				System.out.println("");
			} 
			else if (roomHint == 13) {			
				System.out.println("");
			}
			else if (roomHint == 14) {			
				System.out.println("");
			} 
			else if (roomHint == 15) {			
				System.out.println("");
			}	
			
		}
		for (int cnt = 5; cnt < 8;) {
			System.out.println();
			for (int i = 11; i < 16; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();
			qc.Quiz(cnt);
			SelOfHint.remove(roomHint);
			cnt++;
		}

	}

}
