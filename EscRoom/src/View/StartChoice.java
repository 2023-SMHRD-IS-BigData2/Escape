package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.MusicPlayer;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class StartChoice {
	Scanner scan = new Scanner(System.in);
	String choice;
	int cnt = 0;
	String[] ment;
	MP3Player mp3;
	ArrayList<MusicVO> playlist = new ArrayList<>();
	

	public void startSelect() {
		// 선택에 따른 화면 출력, bgm 등등
		// 거절 누를 시마다 나올 문자열s
		ment = new String[] { "선택을 번복할 수 있습니다.", "정말?", "게임을 강제 실행합니다." };
		ArrayList<MusicVO> playlist = new ArrayList<>();
		playlist.add(new MusicVO("시작브금1", "BGM", "BGM\\방탈출BGM.mp3"));
		playlist.add(new MusicVO("시작브금2", "BGM", "BGM\\011_키보드+타이핑.mp3"));
		playlist.add(new MusicVO("시작브금3", "BGM", "BGM\\효과음3.mp3"));
		playlist.add(new MusicVO("퀴즈출제", "BGM", "BGM\\11멜로디.mp3"));
		playlist.add(new MusicVO("퀴즈정답", "BGM", "BGM\\015_띠링.mp3"));
		playlist.add(new MusicVO("퀴즈오답", "BGM", "BGM\\퀴즈오답.mp3"));
		MusicPlayer bgm = new MusicPlayer(playlist);
		while (true) {
			choice = scan.next();
			if (choice.equals("Y") || choice.equals("y")) {
			opening();
			bgm.play(0);
				break;

				// 화면 출력 메소드만 모아서 있으면 괜찮을 듯
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println(ment[cnt]);
				cnt++;
				if (cnt != 3) {
					startSelect();
				} else {
					opening();
					bgm.play(0);
				}
				break;
			} else {
				System.out.println("잘못입력되었습니다.");
			}
		}
	}

	public void opening() {
		String start = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@################################################@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@##################################################@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@#####################################################@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@#######################################################@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@########################################################@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@############################################################@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@#########################$$$$$$$$$$$###########################@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@#######################$$$$$$$$$$$$$$$$$$$$#######################@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@#####################$$$$$$$$$$$$$$$$$$$$$$$$$$####################@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@###################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$##################@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@###################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$##################@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@################$$$$$$$$$$$$$$$$============$$$$$$$$$$$$$$$$################@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@###############$$$$$$$$$$$$$$====================$$$$$$$$$$$$$$###############@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@##############$$$$$$$$$$$$$========================$$$$$$$$$$$$$##############@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@##############$$$$$$$$$$$$============================$$$$$$$$$$$$##############@@@@@@@@\r\n"
				+ "@@@@@@@@@@@##############$$$$$$$$$$$================================$$$$$$$$$$$##############@@@@@@@\r\n"
				+ "@@@@@@@@@@@#############$$$$$$$$$$===============***=================$$$$$$$$$$$#############@@@@@@@\r\n"
				+ "@@@@@@@@@@##############$$$$$$$$$============**************===========$$$$$$$$$$##############@@@@@@\r\n"
				+ "@@@@@@@@@@#############$$$$$$$$$==========********************==========$$$$$$$$$#############@@@@@@\r\n"
				+ "@@@@@@@@@#############$$$$$$$$$=========************************=========$$$$$$$$$#############@@@@@\r\n"
				+ "@@@@@@@@@############$$$$$$$$$=========**************************=========$$$$$$$$$############@@@@@\r\n"
				+ "@@@@@@@@#############$$$$$$$$========**********!!!!!!!!!!!*********========$$$$$$$$$############@@@@\r\n"
				+ "@@@@@@@@############$$$$$$$$========********!!!!!!!!!!!!!!!!********========$$$$$$$$############@@@@\r\n"
				+ "@@@@@@@@############$$$$$$$$=======*******!!!!!!!!!!!!!!!!!!!!*******=======$$$$$$$$#############@@@\r\n"
				+ "@@@@@@@############$$$$$$$$=======******!!!!!!!!;;;;;;;;!!!!!!!!******=======$$$$$$$$############@@@\r\n"
				+ "@@@@@@@###########$$$$$$$$$======******!!!!!!!;;;;;;;;;;;;;!!!!!!******=======$$$$$$$#############@@\r\n"
				+ "@@@@@@############$$$$$$$$======******!!!!!;;;;;;;;;;;;;;;;;!!!!!!******======$$$$$$$$############@@\r\n"
				+ "@@@@@@############$$$$$$$=======*****!!!!!;;;;;;;::::;;;;;;;;;!!!!!*****=======$$$$$$$#############@\r\n"
				+ "@@@@@@###########$$$$$$$$======*****!!!!!;;;;;:::::::::::::;;;;!!!!!*****======$$$$$$$$############@\r\n"
				+ "@@@@@############$$$$$$$$==*=*******!!!!;;;;;:::::::-.         :!!!!*****=========$$$$$$############\r\n"
				+ "@@@@@############$$$$$$=*:    .~~~!*!!!;;;;::::::~,...        ,;;!!!!*****===!,,,,,,-,.,,,$#########\r\n"
				+ "@@@@@###########$$$$$$$..          :!!;;;;:::::~~~,...        -;;;!!!!****===;,,,,,,,,,,.,$#########\r\n"
				+ "@@@@@###########$$$$$$$.  -::::;,  :!!;;;::::~~~~-,...        -;;;!!!!*****==;,,,,~:~~...,$#########\r\n"
				+ "@@@@@###########$$$$$$$   ##$=@##- :!;;;;:::~~~~~-,,,.*@@@;  .-;;;;!!!!****==;,,.~=***;...=#########\r\n"
				+ "@@@@@####:  .-:;!;-  .* .##. . ;@- ::   .,--..,,,-,.=@@@@@@! .,:;;;!!!!****==;..:$=***=:..=#########\r\n"
				+ "@@@@@####~           .!.;#!.....#- ::      ...,,,-,.=@;..#@@: ,:;;-. ......,*;.~$$=:;*==,.=#########\r\n"
				+ "@@@@@####,           .! ;**.. ..-, ::.....--..,,,-,.;.....#@!.,:-.      ..,,*;.:$$-..:=$~.*#########\r\n"
				+ "@@@@@####~         . .;.;##$,,,... :;.  .!===.,,--,,.,.   ;@:.,: .. .. ....,*;.$$*.  ,=$: *#########\r\n"
				+ "@@@@@####; :@@@@@@@$ .~ ;#====~~ ..:; .-*=*=$*,,--,,,. .  ;#:.,:..~;#:###~.-=;.#$!   ,=$!.*#########\r\n"
				+ "@@@@@####; :@@@@@@@$ .~ ,*@$#@=@: .:: ,$$=.~!*~-....,. ,. ;=: ,~  ,*@~,-==.-=~ #$=!;;!=$=.$#########\r\n"
				+ "@@@@@####; :@@=====* .~ .~==*#=#=~.:: ,#$,,,!*@-.~-.,:!=*#@@:.-~.,.;#.,,;=!-!~ #$$=***=$=.$#########\r\n"
				+ "@@@@@####; :@@,      .: ..,,*#$#=*.:: !#=..  ;:-.--.!@@#-,;@:.-~...;#...,*;.;~ #$==***=$=.=#########\r\n"
				+ "@@@@@####; :@@,      ,; . ....;$!*.:: ##.. ,,.--.---##~.. ~@:.-~ ..;#...,;;~!~ #$!       .*#########\r\n"
				+ "@@@@@####; :@@,     .,; :;.,...;!!.:; ** .   .--.--:#$    ;@: ,;   *#,  .!;-=~.#$*.      .*#########\r\n"
				+ "@@@@@####; :@@@@@@@=.,! ;#...,.,**.:;.@# ...,,,---,@@$,...;@*.-:...=#,..,$*,=;.$$$-    . .*#########\r\n"
				+ "@@@@@####; :@@@@@@@=.,=.!#:,..,!$$.:;.@#   ...,,--,@@#....$@!.,:.. =@~..**,,=; :$$=:  ~; .*#########\r\n"
				+ "@@@@@####; :@@#####*.,=.;$$~--:$=-,:; @#    .-,,,-,!@@;-,@@@*..:   =@@@#*,,,=: ,$$=***==..=#########\r\n"
				+ "@@@@@####; :@@,......,=.,::$$$=;~,,:; =#*    #*,,-,~@@@@@@;@@*,:.  =#~:-..,,=:  ~$=***==-.=#########\r\n"
				+ "@@@@@####; :@@,......,=...,,,,,,,,,:; .#$   $##,,-,,*#@@# .$@@;:   =#.....,,=:  .,*!!**= .=#########\r\n"
				+ "@@@@@####; :@@,.....,,*,,,,,,,,,,,,:; .=#*:;$#~,,~,,,,;~    :- :   =#.....,,=:      .    .$#########\r\n"
				+ "@@@@@####; :@@-.,,,,,,*,,,,,,,,,,,-;; .!$===$=,,,~,,,,...      : . =#.....,,=;.    ...   .$#########\r\n"
				+ "@@@@@@###; :@@@@@@@@:,**!!;;;~,,,;;*;  .:==$*~,,,::::-:-.      ;.. =#- ..,,,$*::::;*$!;;;;$#########\r\n"
				+ "@@@@@@###!.:@@@@@@@@:-*$$======$$***;       ..,,,::::::;;**;;*!!  @@@#=..,,,===$$$$$$$$############@\r\n"
				+ "@@@@@@###!.,-------~--*$$$======****;  .    ..,,-;;;;;;;;;;;;;!!  ..  ...,,,===$$$$$$$#############@\r\n"
				+ "@@@@@@###!....,,,,,,,-=$$$=======********!!!!!!!;;;;;;;;;;;;!!!!      ...,,,==$$$$$$$$#############@\r\n"
				+ "@@@@@@@#@!,,-:;;;:,,,-=$$$$======*******!!!!!!;;;;;;;;;;;;!!!!!!:~~~~::::::$$$$$$$$$$#############@@\r\n"
				+ "@@@@@@@###########$$$$$$$$$=======*******!!!!!!!!!!!!!!!!!!!!!!*******=======$$$$$$$$############@@@\r\n"
				+ "@@@@@@@@############$$$$$$$$=======********!!!!!!!!!!!!!!!!!!********=======$$$$$$$$#############@@@\r\n"
				+ "@@@@@@@@############$$$$$$$$$=======*********!!!!!!!!!!!!!!*********=======$$$$$$$$$#############@@@\r\n"
				+ "@@@@@@@@@############$$$$$$$$$========**********!!!!!!!!**********=========$$$$$$$$#############@@@@\r\n"

				+ "@@@@@@@@@#############$$$$$$$$=========**************************=========$$$$$$$$$############@@@@@\r\n"

				+ "@@@@@@@@@#############$$$$$$$$$$=========**********************==========$$$$$$$$$#############@@@@@\r\n"

				+ "@@@@@@@@@@#############$$$$$$$$$$==========******************==========$$$$$$$$$$##############@@@@@\r\n"

				+ "@@@@@@@@@@##############$$$$$$$$$$============************============$$$$$$$$$$##############@@@@@@\r\n"

				+ "@@@@@@@@@@@##############$$$$$$$$$$==================================$$$$$$$$$$##############@@@@@@@\r\n"

				+ "@@@@@@@@@@@@##############$$$$$$$$$$$==============================$$$$$$$$$$$$#############@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@##############$$$$$$$$$$$============================$$$$$$$$$$$###############@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@###############$$$$$$$$$$$$=======================$$$$$$$$$$$$$###############@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@###############$$$$$$$$$$$$$$==================$$$$$$$$$$$$$$###############@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@################$$$$$$$$$$$$$$$$$$========$$$$$$$$$$$$$$$$$$###############@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@#################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$################@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@#################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#################@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@##################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$##################@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@###################$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$###################@@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@@####################$$$$$$$$$$$$$$$$$$$$$$$$$#####################@@@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@@@#######################$$$$$$$$$$$$$$$$$$$######################@@@@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@@@@##########################$$$$$$$$############################@@@@@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@@@@@###########################################################@@@@@@@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@@@@@@@#########################################################@@@@@@@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@@@@@@@@######################################################@@@@@@@@@@@@@@@@@@@@@\r\n"

				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@####################################################@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@################################################@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "**********************************!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*******************************\r\n"
				+ "                              : .~  .;:    :                ,:,.~~.,::                              \r\n"
				+ "                              ~,.,::!;$$*; ~--.  ,*!#!  =:-,,.  ~--:--                              \r\n"
				+ "                              .  .  ..,,..        ,.,.  ,..         ..                              ";
		char[] arr = new char[start.length()];
		try {
			for (int i = 0; i < start.length(); i++) {
				arr[i] = start.charAt(i);
				System.out.print(arr[i]);
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
	}
}
