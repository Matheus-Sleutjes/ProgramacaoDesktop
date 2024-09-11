import java.util.Scanner;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//filterString
		List<String> strings = List.of("apple", "banana", "cherry", "date");
        
        Predicate<String> startsWithA = str -> str.startsWith("a");
        
        List<String> filteredList = filterStrings(strings, startsWithA);

		//removeNegativeNumbers

		List<Integer> numbers = List.of(-5, 3, -1, 7, 0, -12, 9);

		removeNegativeNumbers(numbers );

		//findFirstMatch
		List<Integer> numbers2 = List.of(-5, 3, -1, 7, 0, -12, 9);

        Predicate<Integer> isPositive = number -> number > 0;

        Integer result = findFirstMatch(numbers2, isPositive);
	}

	private static List<String> filterStrings(List<String> lista, Predicate<String> predicate){
		return lista.stream()
                    .filter(predicate)
                    .collect(Collectors.toList());
	}

	private static void removeNegativeNumbers(List<Integer> numbers) {
        numbers.removeIf(number -> number < 0);
    }

	private static Integer findFirstMatch(List<Integer> numbers, Predicate<Integer> predicate) {
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                return number;
            }
        }
        return null;
    }

}
