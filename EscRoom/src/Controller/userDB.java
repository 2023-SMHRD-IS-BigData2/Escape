package Controller;

import java.util.Scanner;

import Model.ModelDAO;
import Model.ModelDTO;

public class userDB {
	
	Scanner sc = new Scanner(System.in);
	ModelDAO mdao = new ModelDAO();
	
 public void log() {
	
	while(true) {
		System.out.println("=========방 탈출 게임=========");
		System.out.println("[1]로그인 [2]회원가입 [3] 게임종료");
		System.out.print("숫자를 입력해 주세요 >> ");
		int num = sc.nextInt();

		if (num == 1) {

			System.out.print("아이디를 입력해 주세요 >> ");
			String inpID = sc.next();
			System.out.print("패스워드를 입력해 주세요 >> ");
			String inpPw = sc.next();

			if (mdao.getlog(inpID, inpPw)==true) {
				System.out.println(inpID + "님 로그인 완료했습니다!");
				break;
			} // if
			else {
				System.out.println("로그인 실패하셨습니다!");
			}

		} else if (num == 2) {
			System.out.print("아이디를 입력해 주세요 >> ");
			String inpID = sc.next();
			System.out.print("패스워드를 입력해 주세요 >> ");
			String inpPw = sc.next();
			System.out.print("이름을 입력해 주세요 >> ");
			String inpName = sc.next();

		ModelDTO dto = new ModelDTO(inpID, inpPw, inpName);
			int row = mdao.getjoin(dto);

			if (row > 0) {
				System.out.println("회원가입에 성공하셨습니다");
			} else {
				System.out.println("회원가입에 실패하셨습니다.");
			} // if
			
		} else if (num == 3) {
			break;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		} // if
	}// while
 }
}//login
