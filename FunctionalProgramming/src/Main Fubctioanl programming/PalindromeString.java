package com.epam.functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PalindromeString {
	public static void main(String args[])
	{
		List<String> ls=Arrays.asList("ababa","madam","banana","refer","kayak","sir","computer");
		checkPalindrome(ls,Palindrome::isPalindrome).forEach(System.out::println);
	}

	private static List<String> checkPalindrome(List<String> ls, Predicate<String> myPredicate) {
		return ls.stream().filter(st -> myPredicate.test(st)).collect(Collectors.toList());
	}
}