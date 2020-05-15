import java.util.Scanner;

public class Func {
	public static int solution(int n) {
		int output = 0;
		for (int i = 0; i < n; i++) {
			if (output > n) {
				return i - 2;
			} else
				output = output + i;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(solution(s.nextInt()));
	}
}
