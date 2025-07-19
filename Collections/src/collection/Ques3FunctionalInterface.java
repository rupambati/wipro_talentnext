
package collection;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface PalindromeChecker {
    boolean isPalindrome(String str);
}

public class Ques3FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList(
	            "madam", "apple", "banana", "level",
	            "hello", "rotor", "world", "noon", "java"
	        );

	        PalindromeChecker checker = str -> {
	            String reversed = new StringBuilder(str).reverse().toString();
	            return str.equalsIgnoreCase(reversed);
	        };

	        List<String> palindromes = words.stream()
	                .filter(word -> checker.isPalindrome(word))
	                .collect(Collectors.toList());

	        System.out.println("Palindrome words:");
	        palindromes.forEach(System.out::println);
	}

}
