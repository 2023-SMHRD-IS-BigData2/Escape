package View;

import java.util.Random;

public class PwOfEscape {
	Random rd = new Random();
//	int digit;
	static int[] pw; // 랜덤으로 생성된 비밀번호 저장 배열

	public void RandomPw(int digit) {
		pw = new int[digit];
		for (int i = 0; i < digit; i++) {
			pw[i] = rd.nextInt(10);
		}

	}

//	public int getD() {
//		return digit;
//	}

	public int[] getPw() {
		return pw;
	}
	
//	public void setDigit(int digit) {
//		this.digit = digit;
//	}

	public void setPw(int[] pw) {
		this.pw = pw;
	}
	
}
