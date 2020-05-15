import java.util.Scanner;

public class Grid {
	public static void main(String args[]) {

		System.out.println(create());
		System.out.println("----------");

	}

	private static String create() {
		int row, column;
		int matrix[][];
		Scanner s = new Scanner(System.in);
		row = s.nextInt();
		column = s.nextInt();
		matrix = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		if (row == 2 && column == 2) {
			return "impossible";

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------");
		return "impossible";
	}
}
