import java.util.Scanner;

public class TestExample3 {

	public static void main(String[] args) {
		int ra = 4, ba = 0, s = 0, r = 0;
		Scanner sc = new Scanner(System.in);
		int difference = sc.nextInt();
		int rituCandles = sc.nextInt();
		int thoCandles = sc.nextInt();

		int total = rituCandles + thoCandles;
		while ((ra - difference) != 3) {
			s += ra;
			r += ra;
			ra += 1;
		}
		ba = 3;
		while (s < total) {
			s += ra + ba;
			r += ra;
			ra += 1;
			ba += 1;
		}
		System.out.println(rituCandles - r);
	}
}
