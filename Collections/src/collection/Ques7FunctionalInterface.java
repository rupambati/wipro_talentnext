package collection;

import java.util.*;

interface NumberChecker {
    void check(int number);
}

public class Ques7FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2, 5, 7, 8, 10, 13, 16, 19, 20, 25);

		NumberChecker checker = (int number) -> {
            String type = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " " + type);
        };

        for (int num : numbers) {
            checker.check(num);
        }

	}

}