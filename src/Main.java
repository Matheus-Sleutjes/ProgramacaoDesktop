import java.util.Scanner;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	}

	private List<String> filterStrings(List<String> lista, Predicate<String> predicate){
		return lista.stream()
                    .filter(predicate)
                    .collect(Collectors.toList());
	}

	private List<Integer> removeNegativeNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.removeIf(predicate);
		return numbers;
    }

	private Integer findFirstMatch(List<Integer> numbers, Predicate<Integer> predicate) {
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                return number;
            }
        }
        return null;
    }

}
