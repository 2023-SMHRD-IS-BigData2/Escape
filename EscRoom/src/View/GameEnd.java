package View;

import java.util.Arrays;
import java.util.Scanner;

public class GameEnd {
	Scanner scan = new Scanner(System.in);
	PwOfEscape pe = new PwOfEscape();
	String password;
	
	boolean isRight = false;

	public void theEnd() {
		System.out.println("... ...\n"
				+"삑. 삑. 삑. 삑.\n"
				+"잠금장치에서 소리가 들린다.\n"
				+"비밀번호를 입력해보자.\n");
		password = scan.next(); //비밀번호를 문자열로 입력받음

//		String[] array = password.split(""); //입력받은 문자열로 하나씩 자르기
//		ArrayList<Integer> answer = new ArrayList<>(); //입력받은 비밀번호 저장
//		for (int i = 0; i < array.length; i++) {
//			answer.add(Integer.parseInt(array[i]));
//		} // 자른 문자열 정수형로 변환 후 저장
//
//		for (int i = 0; i < answer.size(); i++) {
//			if (pe.getPw()[i] != answer.get(i)) {
//				isRight = false;
//				break;
//			}
//		} // for
		
		String str = Arrays.toString(pe.pw).replaceAll("[^0-9]","");
		if(str.equals(password)) isRight = true;
		
		//엔딩 스토리 출력
		if(isRight) {
			System.out.println("비밀번호가 모두 일치합니다.");
			System.out.println(".\n"
					+ ".\n"
					+ ".\n");
			System.out.println("찰칵, 잠금이 풀리는 소리가 난다.");
			System.out.println("띠링, 이건... 메일 알림 소리다.");
			System.out.println("제목 없는 메일에 파일이 첨부되어 있다.");
			System.out.println("언뜻 보이는 파일명은");
			System.out.println("'escape.exe'");
			System.out.println("이 파일, 설마...");
			System.out.println("... ..."
					+"억울하다 해서 남에게 피해를 주는 C가 되고 싶지는 않다. 망설임 없이 파일을 삭제한다."
					+"파일을 삭제한 이후, 또 다른 메일이 한 통 도착한다."
					+"...오늘 열심히 작업했던 프로젝트 파일이다."
					+"나를 도와준 C는 누구였을까?"
					+"확실한 건 나 또한 나를 도운 C의 길을 걷게 될 거라는 거다."
					+ " ___  _          ___         _ \r\n"
					+ "|_ _|| |_  ___   | __>._ _  _| |\r\n"
					+ " | | | . |/ ._>  | _> | ' |/ . |\r\n"
					+ " |_| |_|_|\\]___.|___>|_|_|\\__|\r\n\n\n\n\n\n\n\n\n\n\n"
					+ "                               ");
			
			
			
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("... ...");
			System.out.println("잠금장치에서 아무 일도 일어나지 않는다.");
			System.out.println("띠링, 이건... 메일 알림 소리다.");
			System.out.println("제목 없는 메일에 파일이,");
			System.err.println("지금부터 게임을 시작하지.");
			System.err.println("지금부터 게임을 시작하지.");
			System.err.println("지금부터 게임을 시작하지.");
			System.err.println("지금부터 게임을 시작하지.");
			System.err.println("지금부터 게임을 시작하지.");
			System.err.println(".");
			System.err.println(".");
			System.err.println(".");
			System.err.println(""
					+ " ___  _          ___         _ \r\n"
					+ "|_ _|| |_  ___   | __>._ _  _| |\r\n"
					+ " | | | . |/ ._>  | _> | ' |/ . |\r\n"
					+ " |_| |_|_|\\]___.|___>|_|_|\\__|\r\n"
					+ "                               ");
		}
		
	}// theEnd method

}
