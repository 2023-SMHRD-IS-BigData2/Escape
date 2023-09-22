package View;

import java.util.Random;

public class PwOfEscape {
	Random rd = new Random();
	int D;
	int[] pw; // 랜덤으로 생성된 비밀번호 저장 배열

	public void RandomPw() {
		pw = new int[D];
		for (int i = 0; i < D; i++) {
			pw[i] = rd.nextInt(9) + 1;
		}

	}
}
