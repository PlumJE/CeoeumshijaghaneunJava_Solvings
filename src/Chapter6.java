import java.util.Scanner;

public class Chapter6 {
	public void question() {
		Scanner in = new Scanner(System.in);
		int[][] students = {
				{1, 3, 2, 4, 3, 1, 4, 2, 2, 1},
				{3, 2, 4, 2, 2, 1, 1, 3, 4, 1},
				{2, 4, 3, 2, 1, 2, 1, 3, 3, 4},
				{2, 3, 3, 1, 1, 3, 2, 2, 4, 4},
				{3, 1, 1, 2, 4, 1, 2, 3, 1, 3}
		};
		int[] answer = new int[10];
		int score;
		
		System.out.print("정답을 입력하세요(10개) : ");
		for (int i = 0; i < 10; ++i)
			answer[i] = in.nextInt();
		
		for (int i = 0; i < 5; ++i) {
			score = 0;
			for (int j = 0; j < 10; ++j) {
				if (students[i][j] == answer[j])
					score++;
			}
			System.out.println("학생 " + (i + 1) + "의 점수 : " + score + "점");
		}
	}
}
