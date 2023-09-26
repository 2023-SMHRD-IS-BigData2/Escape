package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Model.MusicPlayer;
import Model.MusicVO;

public class GameFlow {
	QuizChoice qc = new QuizChoice();
	public int mode;
	int roomHint;
	Scanner scan = new Scanner(System.in);

//	HashMap<Integer, String> SelOfHint = new HashMap<Integer, String>() {
//		{
//			put(1, "[1]S의 컴퓨터  ");
//			put(2, "[2]선생님 컴퓨터  ");
//			put(3, "[3]벽  ");
//			put(4, "[4]간식바구니  ");
//			put(5, "[5]Java의 정석 -3rd Edition-  ");
//			put(6, "[6]둥근 테이블  ");
//			put(7, "[7]정수기  ");
//			put(8, "[8]나가는 문  ");
//			put(9, "[9]분리수거통  ");
//			put(10, "[10]바닥  ");
//			put(11, "[11]빔프로젝터  ");
//			put(12, "[12]책상을 굴러다니는 영수증  ");
//			put(13, "[13]켜져있는 컴퓨터  ");
//			put(14, "[14]창문  ");
//			put(15, "[15]모니터 받침  ");
//		}
//	};

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
		ArrayList<MusicVO> playlist = new ArrayList<>();
		playlist.add(new MusicVO("시작브금1", "BGM", "BGM\\방탈출BGM.mp3"));
		playlist.add(new MusicVO("시작브금2", "BGM", "BGM\\011_키보드+타이핑.mp3"));
		playlist.add(new MusicVO("시작브금3", "BGM", "BGM\\효과음3.mp3"));
		playlist.add(new MusicVO("퀴즈출제", "BGM", "BGM\\11멜로디.mp3"));
		playlist.add(new MusicVO("퀴즈정답", "BGM", "BGM\\015_띠링.mp3"));
		playlist.add(new MusicVO("퀴즈오답", "BGM", "BGM\\퀴즈오답.mp3"));
		MusicPlayer bgm = new MusicPlayer(playlist);
		HashMap<Integer, String> SelOfHint = new HashMap<Integer, String>() {
			{
				put(1, "[1]S의 컴퓨터  ");
				put(2, "[2]선생님 컴퓨터  ");
				put(3, "[3]벽  ");
				put(4, "[4]둥근 테이블  ");
				put(5, "[5]정수기  ");
				put(6, "[6]나가는 문  ");

			}
		};

		System.out.println("≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n" + "𝙀𝘼𝙎𝙔 𝙈𝙊𝘿𝙀 𝙇𝙊𝘼𝘿𝙄𝙉𝙂···\n"
				+ "해당 모드에서는 방 별 비밀번호 2개씩 찾을 수 있습니다.\n" + "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n" + "\n\n\n\n\n");

		GameMap map1 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map1.getMap3B1());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		// 게임 시작
		System.out.println("+익숙한 강의실이다.\n" + "넓은 강의실에는 웅웅거리며 돌아가는 컴퓨터 소리만 난다.\n" + "살펴볼 수 있을 것 같다.");

		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 4; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();

			if (roomHint == 1) {
				String room1 = "지금부터 게임을 시작하지.\r\n" + "다시봐도 황당한 문구다. 아랫줄에 무언가 더 출력되어있다.\r\n" + "\r\n"
						+ "[잃어버린 코드는 돌아오지 않는다.]\n\n" + "요즘같은 시대에 백업도 클라우드도 안 된다는 게 말이 되나...? \n" + "뜬금없이 문제가 하나 나왔다.\n"
						+ "이걸 풀어야 나갈 수 있다고??";
				char[] game1 = new char[room1.length()];
				try {
					for (int i = 0; i < room1.length(); i++) {
						game1[i] = room1.charAt(i);
						System.out.print(game1[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 1번 선택
			else if (roomHint == 2) {
				String room2 ="이클립스 콘솔창만 덩그러니 남아있다.\r\n" + "\r\n" + "\r\n"
						+ "Escape(ESC) Key : 탈출 굴쇠\\r\\n"
						+ "Escape : 빠져나오다, 피하다, 무사하다\\r\\n"
						+ "Escape : 탈출 불가능한 코드??\\r\\n"
						+ "곧 콘솔창이 자동으로 움직인다.\r\n" + "문제가 하나 나왔다.\n";
				char[] game2 = new char[room2.length()];
				try {
					for (int i = 0; i < room2.length(); i++) {
						game2[i] = room2.charAt(i);
						System.out.print(game2[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 2번 선택
			else if (roomHint == 3) {
				String room3 ="\r\n"
						+ "                                                                           ,!~       \r\n"
						+ "                                                              .    .-,     ##@=      \r\n"
						+ "                                                              @#   *@@@    @.-@,     \r\n"
						+ "                                                            ,@:@;  .@=@$   @. @;     \r\n"
						+ "                                        :!!!!! ;!!!*@@=     -@.-#.  ~@,$$  @. ;@,    \r\n"
						+ "                                      .@**!***.*@=  .@#     -@,,@@   !@-$#;@   @:    \r\n"
						+ "                               .     ,@*        @$~@##       @#@#@-   =@,-@@   *~    \r\n"
						+ "                         ;=   @@@   $@          ,@@@@@@@=    @:  ,@~   =! .          \r\n"
						+ "    ~$=,       ;@:       @=  :@~@: .@-       .=  #$   ,-:@$= @:   -@.  ,,            \r\n"
						+ "    !#;@:      =@#       @~  !# :@-.@. .;=@@@!;  ,@~         @:                      \r\n"
						+ "    @$ .#=     =@$#     -@   *=  ==.@!     ,@~    *$                                 \r\n"
						+ "    @:   @~    =@,@!    =@   @#@@@@- @!    ,@@                                       \r\n"
						+ "   *@    ~@,   =@ -@-   #!   @~.  ;@..@####@;@$                                      \r\n"
						+ "   *@  !**@@,  =@  ~@:  @;  $@    .@*   ~~-  -~                                      \r\n"
						+ "   *@!!!!; $=  =@   ~@:.@-  $$     !@.                                               \r\n"
						+ "   *$      ;@, =@    .$@$   :-           =; =@~                   -----              \r\n"
						+ "   =!       @* =@                        =@  =@.                $@@@#$$              \r\n"
						+ "   =!       !~                            !#  *!               ;@.                   \r\n"
						+ "   =!                                     ,-            -!!!-  !@!!!!!@@*            \r\n"
						+ "                                                ::::  -@!!!$@   !!!!.  $@            \r\n"
						+ "                                               :@.    =@@##@#      ,,$@$.            \r\n"
						+ "                                       *      ,@.     @!         @@@-                \r\n"
						+ "                              .====! ;@:@$    ,@      =#=====-   -                   \r\n"
						+ "                       !!~   *#: -@~ @~ @@@!!. *@!!!!@- :::::                        \r\n"
						+ "                     *@**@, #$  ~@* #@  @# ,**##~!****                               \r\n"
						+ "                    =#   @=:@.$@#.  $@-~@-                                           \r\n"
						+ "                   ,@   -@*@*..    @~....                                            \r\n"
						+ "                    @: *@~ @#=====#$                                                 \r\n"
						+ "                    $$*@.   ;;;;;;~                                                  \r\n"
						+ "                    *#                                                               \r\n"
						+ "                    *@                                                               \r\n"
						+ "                     @*                                                              \r\n"
						+ "                     ;@                                                              \r\n"
						+ "                     .@:                                                             \r\n"
						+ "[유용하게 쓸 수 있는 키워드야.]\n" + "[모를 땐 이걸 입력해.]\n";
				char[] game3 = new char[room3.length()];
				try {
					for (int i = 0; i < room3.length(); i++) {
						game3[i] = room3.charAt(i);
						System.out.print(game3[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 3번 선택

			qc.Quiz(cnt, roomHint); // 퀴즈 문제 생성 + 맞힌 후 비밀번호 한자리씩 출력 기능
			SelOfHint.remove(roomHint);
			cnt++;// 각 방마다 얻을 수 있는 힌트 수만큼 반복 진행
		} // for

		System.out.println("다른 공간도 둘러보는 것이 좋을 것 같다.");

		GameMap map2 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map2.getMapRest1());

		System.out.println("++++휴게실++++\n" + "3-B 강의실 바로 옆의 휴게실이다.\n" + "살펴볼 수 있을 것 같다.");

		for (int cnt = 2; cnt < 4;) {
			System.out.println();
			for (int i = 4; i < 7; i++) {
				System.out.printf("%3s", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();

			if (roomHint == 4) {
				String room4 = "휴게실 가운데에 놓인 테이블이다. \r\n" + "포스트잇이 하나 붙어있다.\r\n" + "\r\n" + "분명 누군가 내 컴퓨터에 손을 댔어.\r\n"
						+ "이렇게까지 아무런 파일도 안 남을리가 없잖아.\n" + "\r\n" + "문제가 하나 나왔다.\n";
				char[] game4 = new char[room4.length()];
				try {
					for (int i = 0; i < room4.length(); i++) {
						game4[i] = room4.charAt(i);
						System.out.print(game4[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 4번 선택
			else if (roomHint == 5) {
				String room5 = "절반쯤 물이 찬 정수기다. 컵이 없어 마신다거나 할 순 없을 것 같다…\r\n" + "정수기와 벽 사이의 틈에 쪽지가 하나 놓여있다.\r\n" + "\r\n"
						+ "[스피어 피싱(spear phishing)]\n"
						+ ":메일, 팝업 창 또는 웹 사이트의 첨부 파일을 열 경우에... 피해자가 되거나 조직이 위험에 처할 수....\n";
				char[] game5 = new char[room5.length()];
				try {
					for (int i = 0; i < room5.length(); i++) {
						game5[i] = room5.charAt(i);
						System.out.print(game5[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 5번 선택
			else if (roomHint == 6) {
				String room6 = "잠겨있다. 잠금장치가 되어 있는데...\r\n" + "비밀번호를 알기 전까진 나갈 수 없을 것 같다." + "대체 누가 이런 짓을 저지른 걸까?";
				char[] game6 = new char[room6.length()];
				try {
					for (int i = 0; i < room6.length(); i++) {
						game6[i] = room6.charAt(i);
						System.out.print(game6[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 6번 선택
			qc.Quiz(cnt, roomHint);
			SelOfHint.remove(roomHint);
			cnt++;
		} // for
	} // 이지모드 종료

	public void nomalMode() {
		ArrayList<MusicVO> playlist = new ArrayList<>();
		playlist.add(new MusicVO("시작브금1", "BGM", "BGM\\방탈출BGM.mp3"));
		playlist.add(new MusicVO("시작브금2", "BGM", "BGM\\011_키보드+타이핑.mp3"));
		playlist.add(new MusicVO("시작브금3", "BGM", "BGM\\효과음3.mp3"));
		playlist.add(new MusicVO("퀴즈출제", "BGM", "BGM\\11멜로디.mp3"));
		playlist.add(new MusicVO("퀴즈정답", "BGM", "BGM\\015_띠링.mp3"));
		playlist.add(new MusicVO("퀴즈오답", "BGM", "BGM\\퀴즈오답.mp3"));
		MusicPlayer bgm = new MusicPlayer(playlist);
		HashMap<Integer, String> SelOfHint = new HashMap<Integer, String>() {
			{
				put(1, "[1]S의 컴퓨터  ");
				put(2, "[2]선생님 컴퓨터  ");
				put(3, "[3]벽  ");
				put(4, "[4]간식바구니  ");
				put(5, "[5]둥근 테이블  ");
				put(6, "[6]정수기  ");
				put(7, "[7]나가는 문  ");
				put(8, "[8]창문  ");
				put(9, "[9]책상을 굴러다니는 영수증  ");
				put(10, "[10]켜져 있는 컴퓨터  ");

			}
		};

		System.out.println("≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n" + "𝙉𝙊𝙍𝙈𝘼𝙇 𝙈𝙊𝘿𝙀 𝙇𝙊𝘼𝘿𝙄𝙉𝙂···\n"
				+ "해당 모드에서는 방 별 비밀번호를 2개씩 찾을 수 있습니다.\n" + "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n" + "\n\n\n\n\n");

		GameMap map1 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map1.getMap3B2());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		// 게임 시작
		String normal1 = "+익숙한 강의실이다.\n" + "넓은 강의실에는 웅웅거리며 돌아가는 컴퓨터 소리만 난다.\n" + "살펴볼 수 있을 것 같다.";
		char[] arrnor1 = new char[normal1.length()];
		try {
			for (int i = 0; i < normal1.length(); i++) {
				arrnor1[i] = normal1.charAt(i);
				System.out.print(arrnor1[i]);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 5; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();

			if (roomHint == 1) {
				String nor1 = "지금부터 게임을 시작하지.\r\n" + "다시봐도 황당한 문구다. 아랫줄에 무언가 더 출력되어있다.\r\n" + "\r\n"
						+ "[잃어버린 코드는 돌아오지 않는다.]\n\n" + "요즘같은 시대에 백업도 클라우드도 안 된다는 게 말이 되나...? \n" + "뜬금없이 문제가 하나 나왔다.\n"
						+ "이걸 풀어야 나갈 수 있다고??";
				char[] arrnormal1 = new char[nor1.length()];
				try {
					for (int i = 0; i < nor1.length(); i++) {
						arrnormal1[i] = nor1.charAt(i);
						System.out.print(arrnormal1[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 1번 선택
			else if (roomHint == 2) {
				String nor2 = "이클립스 콘솔창만 덩그러니 남아있다.\r\n" + "\r\n" + "\r\n"
						+ "Escape(ESC) Key : 탈출 굴쇠\\r\\n"
						+ "Escape : 빠져나오다, 피하다, 무사하다\\r\\n"
						+ "Escape : 탈출 불가능한 코드??\\r\\n"
						+ "곧 콘솔창이 자동으로 움직인다.\r\n" + "문제가 하나 나왔다.\n";
				char[] arrnormal2 = new char[nor2.length()];
				try {
					for (int i = 0; i < nor2.length(); i++) {
						arrnormal2[i] = nor2.charAt(i);
						System.out.print(arrnormal2[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 2번 선택
			else if (roomHint == 3) {
				String nor3 = "\r\n"
						+ "                                                                           ,!~       \r\n"
						+ "                                                              .    .-,     ##@=      \r\n"
						+ "                                                              @#   *@@@    @.-@,     \r\n"
						+ "                                                            ,@:@;  .@=@$   @. @;     \r\n"
						+ "                                        :!!!!! ;!!!*@@=     -@.-#.  ~@,$$  @. ;@,    \r\n"
						+ "                                      .@**!***.*@=  .@#     -@,,@@   !@-$#;@   @:    \r\n"
						+ "                               .     ,@*        @$~@##       @#@#@-   =@,-@@   *~    \r\n"
						+ "                         ;=   @@@   $@          ,@@@@@@@=    @:  ,@~   =! .          \r\n"
						+ "    ~$=,       ;@:       @=  :@~@: .@-       .=  #$   ,-:@$= @:   -@.  ,,            \r\n"
						+ "    !#;@:      =@#       @~  !# :@-.@. .;=@@@!;  ,@~         @:                      \r\n"
						+ "    @$ .#=     =@$#     -@   *=  ==.@!     ,@~    *$                                 \r\n"
						+ "    @:   @~    =@,@!    =@   @#@@@@- @!    ,@@                                       \r\n"
						+ "   *@    ~@,   =@ -@-   #!   @~.  ;@..@####@;@$                                      \r\n"
						+ "   *@  !**@@,  =@  ~@:  @;  $@    .@*   ~~-  -~                                      \r\n"
						+ "   *@!!!!; $=  =@   ~@:.@-  $$     !@.                                               \r\n"
						+ "   *$      ;@, =@    .$@$   :-           =; =@~                   -----              \r\n"
						+ "   =!       @* =@                        =@  =@.                $@@@#$$              \r\n"
						+ "   =!       !~                            !#  *!               ;@.                   \r\n"
						+ "   =!                                     ,-            -!!!-  !@!!!!!@@*            \r\n"
						+ "                                                ::::  -@!!!$@   !!!!.  $@            \r\n"
						+ "                                               :@.    =@@##@#      ,,$@$.            \r\n"
						+ "                                       *      ,@.     @!         @@@-                \r\n"
						+ "                              .====! ;@:@$    ,@      =#=====-   -                   \r\n"
						+ "                       !!~   *#: -@~ @~ @@@!!. *@!!!!@- :::::                        \r\n"
						+ "                     *@**@, #$  ~@* #@  @# ,**##~!****                               \r\n"
						+ "                    =#   @=:@.$@#.  $@-~@-                                           \r\n"
						+ "                   ,@   -@*@*..    @~....                                            \r\n"
						+ "                    @: *@~ @#=====#$                                                 \r\n"
						+ "                    $$*@.   ;;;;;;~                                                  \r\n"
						+ "                    *#                                                               \r\n"
						+ "                    *@                                                               \r\n"
						+ "                     @*                                                              \r\n"
						+ "                     ;@                                                              \r\n"
						+ "                     .@:                                                             \r\n"
						+ "[유용하게 쓸 수 있는 키워드야.]\n" + "[모를 땐 이걸 입력해.]\n";
				char[] arrnormal3 = new char[nor3.length()];
				try {
					for (int i = 0; i < nor3.length(); i++) {
						arrnormal3[i] = nor3.charAt(i);
						System.out.print(arrnormal3[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 3번 선택
			else if (roomHint == 4) {
				String nor4 = "아침에 눈을 뜨면 지난 밤이 궁금해~ 오늘은 어떤 간식이 날 기다릴까♫\r\n" + "간식 대신 찢어진 노트가 놓여있다.\r\n" + "\r\n"
			
						+ "                                                           \r\n"
						+ "              .!*********************************;          \r\n"
						+ "    ########=                                   .;~         \r\n"
						+ "   =.                                            :~         \r\n"
						+ "    @-                                           ~~         \r\n"
						+ "    :*         나만 당할 수 없어.                    ~$.        \r\n"
						+ "    .*                                           .=.        \r\n"
						+ "    .=.                                           *-        \r\n"
						+ "    .=.                                           ~$        \r\n"
						+ "    .=.                                            #~       \r\n"
						+ "    .=.                  나만 당할 순 없다고.           #       \r\n"
						+ "    .=.                                             $~      \r\n"
						+ "    .=.                                             ~*      \r\n"
						+ "    .=.                                              :-     \r\n"
						+ "    .=.         ⠀난 억울해.                            ~:     \r\n"
						+ "    .=.                                              -#.    \r\n"
						+ "    .#-                                               *!    \r\n"
						+ "     ;~                                               .#    \r\n"
						+ "     ~~                                                $=   \r\n"
						+ "     ~~                                                 #   \r\n"
						+ "     ~~                             .!!!!!!!!!!!!!!;;!!!#   \r\n"
						+ "     ~~                    =$$$$$$~  ,,,,,,,,,,,,,,,,,,,.   \r\n"
						+ "     ~~  .....   ~######$                                   \r\n"
						+ "     -- .*****~                                             \r\n";
				char[] arrnormal4 = new char[nor4.length()];
				try {
					for (int i = 0; i < nor4.length(); i++) {
						arrnormal4[i] = nor4.charAt(i);
						System.out.print(arrnormal4[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 4번 선택
			qc.Quiz(cnt, roomHint);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		GameMap map2 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map2.getMapRest2());
		System.out.println("+++휴게실+++");

		for (int cnt = 2; cnt < 4;) {
			System.out.println();
			for (int i = 5; i < 8; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}

			roomHint = scan.nextInt();

			if (roomHint == 5) {
				String nor5 = "휴게실 가운데에 놓인 테이블이다. \r\n" + "포스트잇이 하나 붙어있다.\r\n" + "\r\n" + "분명 누군가 내 컴퓨터에 손을 댔어.\r\n"
						+ "이렇게까지 아무런 파일도 안 남을리가 없잖아.\n" + "\r\n" + "문제가 하나 나왔다.\n";
				char[] arrnormal5 = new char[nor5.length()];
				try {
					for (int i = 0; i < nor5.length(); i++) {
						arrnormal5[i] = nor5.charAt(i);
						System.out.print(arrnormal5[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 5번 선택
			else if (roomHint == 6) {
				String nor6 = "절반쯤 물이 찬 정수기다. 컵이 없어 마신다거나 할 순 없을 것 같다…\r\n" + "정수기와 벽 사이의 틈에 쪽지가 하나 놓여있다.\r\n" + "\r\n"
						+ "[스피어 피싱(spear phishing)]\n"
						+ ":메일, 팝업 창 또는 웹 사이트의 첨부 파일을 열 경우에... 피해자가 되거나 조직이 위험에 처할 수....\n";
				char[] arrnormal6 = new char[nor6.length()];
				try {
					for (int i = 0; i < nor6.length(); i++) {
						arrnormal6[i] = nor6.charAt(i);
						System.out.print(arrnormal6[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 6번 선택
			else if (roomHint == 7) {
				String nor7 = "잠겨있다. 잠금장치가 되어 있는데...\r\n" + "비밀번호를 알기 전까진 나갈 수 없을 것 같다." + "대체 누가 이런 짓을 저지른 걸까?";
				char[] arrnormal7 = new char[nor7.length()];
				try {
					for (int i = 0; i < nor7.length(); i++) {
						arrnormal7[i] = nor7.charAt(i);
						System.out.print(arrnormal7[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 7번 선택
			qc.Quiz(cnt, roomHint);
			SelOfHint.remove(roomHint);
			cnt++;

		}
		GameMap map3 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map3.getMap3A2());
		System.out.println("+++3-A 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		for (int cnt = 4; cnt < 6;) {
			System.out.println();
			for (int i = 8; i < 11; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();

			if (roomHint == 8) {
				String nor8 = "너무 높아 포기하려던 찰나….\r\n" + "\r\n" + "툭.\r\n" + "\r\n" + "왠 쪽지?\r\n" + "\r\n"
						+ "['그들'과 똑같은 사람이 되면 안 돼.]";
				char[] arrnormal8 = new char[nor8.length()];
				try {
					for (int i = 0; i < nor8.length(); i++) {
						arrnormal8[i] = nor8.charAt(i);
						System.out.print(arrnormal8[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 8번 선택
			else if (roomHint == 9) {
				String nor9 = "일주일간의 커피 내역이라거나, 편의점에서 사먹은 듯한 영수증이 한가득 찍혀있다.\r\n" + "\r\n"
						+ "(ICE) 아메리카노  - - - 1500 원\r\n" + "샷 추가          - - - 500  원\r\n"
						+ "샷 추가          - - - 500  원 \r\n" + "샷 추가          - - - 500  원 \r\n" + "\r\n" + "\r\n"
						+ "박카스           - - - 800  원 \r\n" + "박카스           - - - 800  원 \r\n"
						+ "박카스           - - - 800  원 \r\n" + "\r\n" + "\r\n" + "몬스터 에너지      - - - 2900원\r\n"
						+ "몬스터 에너지      - - - 2900원\r\n" + "\r\n" + "이 정도면 사약 아냐?? \r\n" + "영수증마다 빨간 매직으로 C라고 적혀있다.";
				char[] arrnormal9 = new char[nor9.length()];
				try {
					for (int i = 0; i < nor9.length(); i++) {
						arrnormal9[i] = nor9.charAt(i);
						System.out.print(arrnormal9[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 9번 선택
			else if (roomHint == 10) {
				String nor10 = "메모장 파일이 켜져있다.\r\n" + "\r\n" + "[코드를 뜯어보니 누군가 계속해서 덧붙인 흔적이 있다.]\r\n"
						+ "[혼자서 해결하려다 되려 컴퓨터가 먹혀 파일이 날아갔다….\n]" + "[C이면서 C가 아닐 수 있는 방법은, 내가...]";
				char[] arrnormal10 = new char[nor10.length()];
				try {
					for (int i = 0; i < nor10.length(); i++) {
						arrnormal10[i] = nor10.charAt(i);
						System.out.print(arrnormal10[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 10번 선택

			qc.Quiz(cnt, roomHint);
			SelOfHint.remove(roomHint);
			cnt++;
		}

	} // 노말모드 종료

	public void hardMode() {
		ArrayList<MusicVO> playlist = new ArrayList<>();
		playlist.add(new MusicVO("시작브금1", "BGM", "BGM\\방탈출BGM.mp3"));
		playlist.add(new MusicVO("시작브금2", "BGM", "BGM\\011_키보드+타이핑.mp3"));
		playlist.add(new MusicVO("시작브금3", "BGM", "BGM\\효과음3.mp3"));
		playlist.add(new MusicVO("퀴즈출제", "BGM", "BGM\\11멜로디.mp3"));
		playlist.add(new MusicVO("퀴즈정답", "BGM", "BGM\\015_띠링.mp3"));
		playlist.add(new MusicVO("퀴즈오답", "BGM", "BGM\\퀴즈오답.mp3"));
		MusicPlayer bgm = new MusicPlayer(playlist);
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

		System.out.println("≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n" + "𝙃𝘼𝙍𝘿 𝙈𝙊𝘿𝙀 𝙇𝙊𝘼𝘿𝙄𝙉𝙂···\n"
				+ "해당 모드에서는 방 별 비밀번호를 2~3개씩 찾을 수 있습니다.\n" + "≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡ ≡≡≡≡≡\n" + "\n\n\n\n\n");

		GameMap map1 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map1.getMap3B3());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		for (int cnt = 0; cnt < 2;) {
			System.out.println();
			for (int i = 1; i < 6; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();

			if (roomHint == 1) {
				String hard1 = "지금부터 게임을 시작하지.\r\n" + "다시봐도 황당한 문구다. 아랫줄에 무언가 더 출력되어있다.\r\n" + "\r\n"
						+ "[잃어버린 코드는 돌아오지 않는다.]\n\n" + "요즘같은 시대에 백업도 클라우드도 안 된다는 게 말이 되나...? \n" + "뜬금없이 문제가 하나 나왔다.\n"
						+ "이걸 풀어야 나갈 수 있다고??";
				char[] arrhard1 = new char[hard1.length()];
				try {
					for (int i = 0; i < hard1.length(); i++) {
						arrhard1[i] = hard1.charAt(i);
						System.out.print(arrhard1[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 1번 선택
			else if (roomHint == 2) {
				String hard2 = "이클립스 콘솔창만 덩그러니 남아있다.\r\n" + "\r\n" + "\r\n"
						+ "Escape(ESC) Key : 탈출 굴쇠\\r\\n"
						+ "Escape : 빠져나오다, 피하다, 무사하다\\r\\n"
						+ "Escape : 탈출 불가능한 코드??\\r\\n"
						+ "곧 콘솔창이 자동으로 움직인다.\r\n" + "문제가 하나 나왔다.\n";
				char[] arrhard2 = new char[hard2.length()];
				try {
					for (int i = 0; i < hard2.length(); i++) {
						arrhard2[i] = hard2.charAt(i);
						System.out.print(arrhard2[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 2번 선택
			else if (roomHint == 3) {
				String hard3 =  "\r\n"
						+ "                                                                           ,!~       \r\n"
						+ "                                                              .    .-,     ##@=      \r\n"
						+ "                                                              @#   *@@@    @.-@,     \r\n"
						+ "                                                            ,@:@;  .@=@$   @. @;     \r\n"
						+ "                                        :!!!!! ;!!!*@@=     -@.-#.  ~@,$$  @. ;@,    \r\n"
						+ "                                      .@**!***.*@=  .@#     -@,,@@   !@-$#;@   @:    \r\n"
						+ "                               .     ,@*        @$~@##       @#@#@-   =@,-@@   *~    \r\n"
						+ "                         ;=   @@@   $@          ,@@@@@@@=    @:  ,@~   =! .          \r\n"
						+ "    ~$=,       ;@:       @=  :@~@: .@-       .=  #$   ,-:@$= @:   -@.  ,,            \r\n"
						+ "    !#;@:      =@#       @~  !# :@-.@. .;=@@@!;  ,@~         @:                      \r\n"
						+ "    @$ .#=     =@$#     -@   *=  ==.@!     ,@~    *$                                 \r\n"
						+ "    @:   @~    =@,@!    =@   @#@@@@- @!    ,@@                                       \r\n"
						+ "   *@    ~@,   =@ -@-   #!   @~.  ;@..@####@;@$                                      \r\n"
						+ "   *@  !**@@,  =@  ~@:  @;  $@    .@*   ~~-  -~                                      \r\n"
						+ "   *@!!!!; $=  =@   ~@:.@-  $$     !@.                                               \r\n"
						+ "   *$      ;@, =@    .$@$   :-           =; =@~                   -----              \r\n"
						+ "   =!       @* =@                        =@  =@.                $@@@#$$              \r\n"
						+ "   =!       !~                            !#  *!               ;@.                   \r\n"
						+ "   =!                                     ,-            -!!!-  !@!!!!!@@*            \r\n"
						+ "                                                ::::  -@!!!$@   !!!!.  $@            \r\n"
						+ "                                               :@.    =@@##@#      ,,$@$.            \r\n"
						+ "                                       *      ,@.     @!         @@@-                \r\n"
						+ "                              .====! ;@:@$    ,@      =#=====-   -                   \r\n"
						+ "                       !!~   *#: -@~ @~ @@@!!. *@!!!!@- :::::                        \r\n"
						+ "                     *@**@, #$  ~@* #@  @# ,**##~!****                               \r\n"
						+ "                    =#   @=:@.$@#.  $@-~@-                                           \r\n"
						+ "                   ,@   -@*@*..    @~....                                            \r\n"
						+ "                    @: *@~ @#=====#$                                                 \r\n"
						+ "                    $$*@.   ;;;;;;~                                                  \r\n"
						+ "                    *#                                                               \r\n"
						+ "                    *@                                                               \r\n"
						+ "                     @*                                                              \r\n"
						+ "                     ;@                                                              \r\n"
						+ "                     .@:                                                             \r\n"
						+ "[유용하게 쓸 수 있는 키워드야.]\n" + "[모를 땐 이걸 입력해.]\n";
				char[] arrhard3 = new char[hard3.length()];
				try {
					for (int i = 0; i < hard3.length(); i++) {
						arrhard3[i] = hard3.charAt(i);
						System.out.print(arrhard3[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 3번 선택
			else if (roomHint == 4) {
				String hard4 = "아침에 눈을 뜨면 지난 밤이 궁금해~ 오늘은 어떤 간식이 날 기다릴까♫\r\n" + "간식 대신 찢어진 노트가 놓여있다.\r\n" + "\r\n"
			
						+ "                                                           \r\n"
						+ "              .!*********************************;          \r\n"
						+ "    ########=                                   .;~         \r\n"
						+ "   =.                                            :~         \r\n"
						+ "    @-                                           ~~         \r\n"
						+ "    :*         나만 당할 수 없어.                    ~$.        \r\n"
						+ "    .*                                           .=.        \r\n"
						+ "    .=.                                           *-        \r\n"
						+ "    .=.                                           ~$        \r\n"
						+ "    .=.                                            #~       \r\n"
						+ "    .=.                  나만 당할 순 없다고.           #       \r\n"
						+ "    .=.                                             $~      \r\n"
						+ "    .=.                                             ~*      \r\n"
						+ "    .=.                                              :-     \r\n"
						+ "    .=.         ⠀난 억울해.                            ~:     \r\n"
						+ "    .=.                                              -#.    \r\n"
						+ "    .#-                                               *!    \r\n"
						+ "     ;~                                               .#    \r\n"
						+ "     ~~                                                $=   \r\n"
						+ "     ~~                                                 #   \r\n"
						+ "     ~~                             .!!!!!!!!!!!!!!;;!!!#   \r\n"
						+ "     ~~                    =$$$$$$~  ,,,,,,,,,,,,,,,,,,,.   \r\n"
						+ "     ~~  .....   ~######$                                   \r\n"
						+ "     -- .*****~                                             \r\n";
				char[] arrhard4 = new char[hard4.length()];
				try {
					for (int i = 0; i < hard4.length(); i++) {
						arrhard4[i] = hard4.charAt(i);
						System.out.print(arrhard4[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 4번 선택
			else if (roomHint == 5) {
				String hard5 = "익숙한 자바 교재다. 수상 할 정도로 깨끗하고 말끔하다...\r\n" + "인덱스로 표시가 되어있는 페이지가 보인다.\r\n" + "\r\n"
						+ "p.136\r\n" + "1. 조건문 - if, switch\r\n" + "1. 1 if문\r\n" + "만일(if)조건식이 참(true)이면...\r\n"
						+ "-> 만일 나에게 이런 일이 일어나지 않았더라면……";
				char[] arrhard5 = new char[hard5.length()];
				try {
					for (int i = 0; i < hard5.length(); i++) {
						arrhard5[i] = hard5.charAt(i);
						System.out.print(arrhard5[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 5번 선택
			qc.Quiz(cnt, roomHint);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		GameMap map2 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map1.getMapRest3());
		System.out.println("+++3-B 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		for (int cnt = 2; cnt < 5;) {
			System.out.println();
			for (int i = 6; i < 11; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();

			if (roomHint == 6) {
				String hard6 = "휴게실 가운데에 놓인 테이블이다. \r\n" + "포스트잇이 하나 붙어있다.\r\n" + "\r\n"
						+ "분명 누군가 내 컴퓨터에 손을 댔어.\r\n" + "이렇게까지 아무런 파일도 안 남을리가 없잖아.\n" + "\r\n" + "문제가 하나 나왔다.\n";
				char[] arrhard6 = new char[hard6.length()];
				try {
					for (int i = 0; i < hard6.length(); i++) {
						arrhard6[i] = hard6.charAt(i);
						System.out.print(arrhard6[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 6번 선택
			else if (roomHint == 7) {
				String hard7 = "절반쯤 물이 찬 정수기다. 컵이 없어 마신다거나 할 순 없을 것 같다…\r\n" + "정수기와 벽 사이의 틈에 쪽지가 하나 놓여있다.\r\n"
						+ "\r\n" + "[스피어 피싱(spear phishing)]\n"
						+ ":메일, 팝업 창 또는 웹 사이트의 첨부 파일을 열 경우에... 피해자가 되거나 조직이 위험에 처할 수....\n";
				char[] arrhard7 = new char[hard7.length()];
				try {
					for (int i = 0; i < hard7.length(); i++) {
						arrhard7[i] = hard7.charAt(i);
						System.out.print(arrhard7[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 7번 선택
			else if (roomHint == 8) {
				String hard8 = "잠겨있다. 잠금장치가 되어 있는데...\r\n" + "비밀번호를 알기 전까진 나갈 수 없을 것 같다." + "대체 누가 이런 짓을 저지른 걸까?";
				char[] arrhard8 = new char[hard8.length()];
				try {
					for (int i = 0; i < hard8.length(); i++) {
						arrhard8[i] = hard8.charAt(i);
						System.out.print(arrhard8[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 8번 선택
			else if (roomHint == 9) {
				String hard9 = "정리가 안 된건가? 오늘따라 유난히 일회용 커피 컵이 산처럼 쌓여있다.\r\n"
						+ "컵 사이로 찢어진 다이어리 페이지가 보인다. 급히 쓴 듯 알아보기 힘들다.\r\n" + "\r\n" + "[나는 널 도와주러 왔어.]" + "...돕는다고??";
				char[] arrhard9 = new char[hard9.length()];
				try {
					for (int i = 0; i < hard9.length(); i++) {
						arrhard9[i] = hard9.charAt(i);
						System.out.print(arrhard9[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 9번 선택
			else if (roomHint == 10) {
				String hard10 = "[코드는 내가 백업해뒀어.]\r\n" + "[수 많은 C사이에서 나는 다르게 움직이기로 했거든.]\r\n"
						+ "[동요하지 말고 비밀번호를 찾아.]\r\n" + "[그러면 모든 게 해결 될 거야.]" + "...이게 다 무슨 말이야??";
				char[] arrhard10 = new char[hard10.length()];
				try {
					for (int i = 0; i < hard10.length(); i++) {
						arrhard10[i] = hard10.charAt(i);
						System.out.print(arrhard10[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 10번 선택

			qc.Quiz(cnt, roomHint);
			SelOfHint.remove(roomHint);
			cnt++;
		}

		GameMap map3 = new GameMap(null, null, null, null, null, null, null, null);
		System.out.println(map3.getMap3A1());
		System.out.println("+++3-A 강의실+++"); // 처음 입장하는 방 화면 또는 맵

		for (int cnt = 5; cnt < 8;) {
			System.out.println();
			for (int i = 11; i < 16; i++) {
				System.out.printf("%3s  ", SelOfHint.get(i));
			}
			roomHint = scan.nextInt();

			if (roomHint == 11) {
				String hard11 = "너무 높아 포기하려던 찰나….\r\n" + "\r\n" + "툭.\r\n" + "\r\n" + "왠 쪽지?\r\n" + "\r\n"
						+ "['그들'과 똑같은 사람이 되면 안 돼.]";
				char[] arrhard11 = new char[hard11.length()];
				try {
					for (int i = 0; i < hard11.length(); i++) {
						arrhard11[i] = hard11.charAt(i);
						System.out.print(arrhard11[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 11번 선택
			else if (roomHint == 12) {
				String hard12 = "일주일간의 커피 내역이라거나, 편의점에서 사먹은 듯한 영수증이 한가득 찍혀있다.\r\n" + "\r\n"
						+ "(ICE) 아메리카노  - - - 1500 원\r\n" + "샷 추가          - - - 500  원\r\n"
						+ "샷 추가          - - - 500  원 \r\n" + "샷 추가          - - - 500  원 \r\n" + "\r\n" + "\r\n"
						+ "박카스           - - - 800  원 \r\n" + "박카스           - - - 800  원 \r\n"
						+ "박카스           - - - 800  원 \r\n" + "\r\n" + "\r\n" + "몬스터 에너지      - - - 2900원\r\n"
						+ "몬스터 에너지      - - - 2900원\r\n" + "\r\n" + "이 정도면 사약 아냐?? \r\n" + "영수증마다 빨간 매직으로 C라고 적혀있다.";
				char[] arrhard12 = new char[hard12.length()];
				try {
					for (int i = 0; i < hard12.length(); i++) {
						arrhard12[i] = hard12.charAt(i);
						System.out.print(arrhard12[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 12번 선택
			else if (roomHint == 13) {
				String hard13 = "메모장 파일이 켜져있다.\r\n" + "\r\n" + "[코드를 뜯어보니 누군가 계속해서 덧붙인 흔적이 있다.]\r\n"
						+ "[혼자서 해결하려다 되려 컴퓨터가 먹혀 파일이 날아갔다….\n]" + "[C이면서 C가 아닐 수 있는 방법은, 내가...]";
				char[] arrhard13 = new char[hard13.length()];
				try {
					for (int i = 0; i < hard13.length(); i++) {
						arrhard13[i] = hard13.charAt(i);
						System.out.print(arrhard13[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 13번 선택
			else if (roomHint == 14) {
				String hard14 = "창 밖이 깜깜하다. 정말 내 코드는 다시 살아날 수 있는걸까….\r\n" + "마음이 싱숭생숭하던 찰나,\r\n" + "\r\n"
						+ "[한 사람이 시작했으나 불특정 다수가 동조했다.\n]" + "[그게 그들의... C의 정체야.]";
				char[] arrhard14 = new char[hard14.length()];
				try {
					for (int i = 0; i < hard14.length(); i++) {
						arrhard14[i] = hard14.charAt(i);
						System.out.print(arrhard14[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 14번 선택
			else if (roomHint == 15) {
				String hard15 = "음? 자세히보니…. 끝난 수업들의 교재들이다.\r\n" + "사람 사는 건 다 똑같나보다…\n";
				char[] arrhard15 = new char[hard15.length()];
				try {
					for (int i = 0; i < hard15.length(); i++) {
						arrhard15[i] = hard15.charAt(i);
						System.out.print(arrhard15[i]);
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // 15번 선택
			qc.Quiz(cnt, roomHint);
			SelOfHint.remove(roomHint);
			cnt++;
		}

	} // 하드모드 종료

}
