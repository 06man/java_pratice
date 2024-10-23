package ex_241021;

public class ForSample {
	public static void main(String[] args) {
		//1
		int i, sum = 0;
		//2
		for (i = 1; i <= 10; i++) { // 1~10까지반복
			//1
			sum += i;
			//2
			System.out.print(i); // 더하는수출력
			//3
			if (i <= 9) // 1~9까지는'+' 출력
				System.out.print("+");
			//4
			else { // i가10인경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈결과출력
			}//else
		}//for
	}//main

}//class
