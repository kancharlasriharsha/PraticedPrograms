import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 3, 2,3,4,3,43,4,3,45,2,6,5 };
		int temp;

		/* REMOVE dulpicate */
		// Integer[] a = { 1, 3, 4, 3, 5, 2 };
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		System.out.println("***********");

		/* SecondMaxNumber */
		int lenght = a.length;
		for (int i = 0; i <lenght; i++) {
			for (int j = i + 1; j < lenght; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		//System.out.print(a[lenght]+" ");
		System.out.println();
		System.out.println("Max value: " + a[lenght - 1]);
		
		System.out.println("Second Max value: " + a[lenght - 2]);
		
		System.out.println("Smallest value: " + a[0]);
		
		/*
		 * second minimum number 2nd element because index starts from 0 only one 1
		 * should me there in the array
		 */
		
		System.out.println("second Smallest value: " + a[1]);
	}
}
