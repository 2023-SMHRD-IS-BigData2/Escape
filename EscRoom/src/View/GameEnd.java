package View;

import java.util.ArrayList;
import java.util.Scanner;

public class GameEnd {
	Scanner scan = new Scanner(System.in);
	PwOfEscape pe = new PwOfEscape();
	String password;
	
	boolean isRight = true;

	public void theEnd() {
		System.out.println("모든 힌트를 모았나? 그럼 한번 입력해보도록");
		password = scan.next(); //비밀번호를 문자열로 입력받음

		String[] array = password.split(""); //입력받은 문자열로 하나씩 자르기
		ArrayList<Integer> answer = new ArrayList<>(); //입력받은 비밀번호 저장
		for (int i = 0; i < array.length; i++) {
			answer.add(Integer.parseInt(array[i]));
		} // 자른 문자열 정수형로 변환 후 저장

		for (int i = 0; i < answer.size(); i++) {
			if (pe.getPw()[i] != answer.get(i)) {
				isRight = false;
				break;
			} // if 비밀번호 불일치 시 거짓 반환
		} // for
		
		//엔딩 스토리 출력
		if(isRight) {
			System.out.println("GAME CLEAR");
			System.out.println();
			System.out.println("제대로 다 찾아왔군, 하 하 핫");
			System.out.println("자네가 작성 중이던 코드는 돌려주도록 하지!!!");
			System.out.println("근데... 내가 잠깐....");
			System.out.println("봤는데 공부 좀 더 해야겠어... 그게 실행될까??");
		} else {
			System.out.println("GAME FAIl");
			System.out.println();
			System.out.println("에잉...  누굴 닯아서 원...");
			System.out.println("자넨 밤새서 공부해야겠구만");
			System.out.println("나 먼저 가겠네 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		}
		
	}// theEnd method

}
