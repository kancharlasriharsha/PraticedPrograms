import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsCount {
	public static void main(String[] args) throws IOException {
		String input = "Welcome to Java Session Session Session";
		String[] words = input.split(" "); // Split the word from String
		int count = 1; // Variable for getting Repeated word count

		for (int i = 0; i < words.length; i++) // Outer loop for Comparison
		{
			for (int j = i + 1; j < words.length; j++) // Inner loop for Comparison
			{
				if (words[i].equals(words[j])) // Checking for both strings are equal
				{
					count = count + 1; // if equal increment the count
					words[j] = "0"; // Replace repeated words by zero
				}
			}
			if (words[i] != "0")
				System.out.println(words[i] + " - " + count); // Printing the word along with count
			count = 1;
		}

		System.out.println("***************************");

		List<String> list = new ArrayList<>();
		list.add("Welcome to Java Session Session Session");
		list.stream().flatMap(i -> Arrays.stream(i.split(" "))).map(i -> i.toLowerCase())
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " - " + v));
	}

}
