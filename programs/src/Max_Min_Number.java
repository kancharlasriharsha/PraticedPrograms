import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max_Min_Number {
	public static void main(String[] args) {
		
		//Integer[] ar=new Integer[]{100,24,13,44,114,200,40,112};
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

System.out.println("maxNumber = " + maxNumber);
System.out.println("minNumber = " + minNumber);
	}
}
