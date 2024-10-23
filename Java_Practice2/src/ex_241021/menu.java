package ex_241021;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//배열 정의
		String [] strArray = new String [3];
		System.out.println("먹고싶은 점심메뉴 입력");
		//반복
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(i + 1 + "번째 먹고싶은 메뉴를 입력해주세요");
		//대입받을 배열정보 입력
			strArray[i] = scanner.next(); 
		}
		//대입받은 배열 정보확인
		for (int i = 0; i < strArray.length; i++) {
			System.out.println( "먹고싶은 메뉴:" + strArray[i]);
		} 
		scanner.close();
        

	}

}
