package ex_241021;

public class foreachEx {
	{
		int[] n = { 1, 2, 3, 4, 5 };
		// 임시로 합계를 구하기 위한 변수.
		int sum = 0;
//		for ~ each 예제
		for (int k : n) { // k는n[0], n[1], ..., n[4]로반복
			System.out.print(k + " "); // 반복되는k 값출력
			sum += k;
		}
		System.out.println("합은" + sum);
		String f[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		for (String s : f) // s는f[0], f[1], ..., f[5]로반복
			System.out.print(s + " ");
	}
}
