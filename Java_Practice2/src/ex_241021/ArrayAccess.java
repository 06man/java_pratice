package ex_241021;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		int max = 0; // 현재가장큰수
		System.out.println("양수5개를입력하세요.");
		for (int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt(); // 입력받은정수를배열에저장
			if (intArray[i] > max)
				max = intArray[i]; // max 변경
		}
		System.out.print("가장큰수는" + max + "입니다.");
		scanner.close();
	}

}
