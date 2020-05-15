import java.util.Scanner;

public class RightAngle {
	public static void main(String[] args) {
		int i, j, n, k = 1;

		System.out.print("Input number of rows : ");

		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		/* all stars */
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("*********************************");

		/* RIGHT ANGLE */
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}

		System.out.println("*********************************");

		/* INVERTED RIGHT ANGLE */
		for (i = n; i > 0; i--) {
			for (j = 0; j < i; j++)
				System.out.print("*");
			System.out.println("");
		}

		System.out.println("*********************************");

		/* MIRROR RIGHT ANGLE */
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			for (k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}