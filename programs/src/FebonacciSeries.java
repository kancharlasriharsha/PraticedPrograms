import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FebonacciSeries {
	public static void main(String[] args) {
		// System.out.println(FebonacciSeries.generateFebonacciSeries(10));

		int count = 10, num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series of " + count + " numbers:");

		for (int i = 1; i <= count; ++i) {
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
		}
	}

	public static List<Integer> generateFebonacciSeries(int number) {
		List<Integer> fb = Stream.iterate(new int[] { 0, 1 }, i -> new int[] { i[1], i[0] + i[1] }).limit(number)
				.map(i -> i[0])
				/* if you more than 5 use filter */
			    //.filter(i-> i>5)
				.collect(Collectors.toList());
		// fb.forEach((i)-> System.out.println(i));
		return fb;

	}
}
