import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long even= s.stream().filter(i->i%2==0).peek(e->System.out.println(e)).count();
		System.out.println(even);
		
		
		int a[] = { 5, 3, 6, 2, 7, 1 };
		int total = a.length;
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println(a[total-1]);
	}
}
