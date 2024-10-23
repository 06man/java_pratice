package ex_241021;

import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눗수
		System.out.print("나뉨수를입력하시오:");
		dividend = scanner.nextInt(); // 나뉨수입력
		System.out.print("나눗수를입력하시오:");
		divisor = scanner.nextInt(); // 나눗수입력
		try {
			// 실험장
			// 실제로 나중에, 많이 접하게 되는 예외 예제
			// 1. 파일 데이터를 읽는 경우 예를들어 이미지 읽기
			// 2. 데이터를 전달하는 경우, 예) 서버로,데이터 전달
			// 3. 널 포인터 예외 , 예) 참조형 변수가 초기화 안될 경우. 등등
			System.out.println(dividend + "를" + divisor + "로나누면몫은" + dividend / divisor + "입니다.");
			System.out.println("정상일 경우 출력, 예외발생 출력안됨.");
		} catch (ArithmeticException e) { // ArithmeticException예외처리코드
			System.out.println("0으로나눌수없습니다!");
		} finally {
			scanner.close(); // 정상적이든 예외가 발생하든 최종적으로 scanner 를닫는다.
		}
	} 
}
