import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
	public static void main(String args[]) {
		int row, column;
		int matrix[][];
		
		Scanner in = new Scanner(System.in);		
		System.out.println("Number of rows :");
		row = Integer.parseInt(in.nextLine());
		System.out.println("Number of columns :");
		column = Integer.parseInt(in.nextLine());
		matrix = new int[row][column];
		System.out.println("Enter the data :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		System.out.println("\nThe Matrix is :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				if(i==j) {
				System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
	}

}