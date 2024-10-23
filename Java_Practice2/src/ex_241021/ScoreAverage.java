package ex_241021;

public class ScoreAverage {
	public static void main(String[] args)
//	1
//	2중 배열 정의 및 값 할당,초기화
	{
		double score[][] = { { 3.3, 3.4 }, // 1학년1, 2학기평점
				{ 3.5, 3.6 }, // 2학년1, 2학기평점
				{ 3.7, 4.0 }, // 3학년1, 2학기평점
				{ 4.1, 4.2 } }; // 4학년1, 2학기평점
		// 임시 변수,합계
//		2
		double sum = 0;
//		이중 for 문

//		3
		for (int year = 0; year < score.length; year++) {// 각학년별로반복
//			3-1
			for (int term = 0; term < score[year].length; term++) { // 각학년의학기별로반복
//				3-1-1
		sum += score[year][term]; // 전체평점합
		System.out.println("score[" + year+"]["+ term +"]" + score[year][term]);
			}
		}
//		4
		int n = score.length; // 배열의행개수, 4
//		5
		int m = score[0].length; // 배열의열개수, 2
		System.out.println("4년전체평점평균은" + sum / (n * m));
	}
}
