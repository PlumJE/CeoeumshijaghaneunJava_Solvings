import java.util.Scanner;

class Odd {
	public int getSum(int n) {
		int result = 0;
		for (int i = 0; i <= n; ++i) {
			if (i % 2 != 0)
				result += i;
		}
		return result;
	}
}

class OddEven extends Odd {
	public int getSum(int n) {
		int result = 0;
		for (int i = 0; i <= n; ++i) {
			if (i % 2 == 0)
				result += i;
		}
		return result;
	}
}

public class Chapter7 {
	public void question() {
		int number;
		Odd odd = new Odd();
		OddEven even = new OddEven();
		
		System.out.print("숫자를 입력하세요 : ");
		number = new Scanner(System.in).nextInt();
		
		System.out.println("짝수의 합 : " + even.getSum(number));
		System.out.println("홀수의 합 : " + odd.getSum(number));
	}
}
