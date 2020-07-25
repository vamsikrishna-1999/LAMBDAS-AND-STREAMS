package com.epam.functional_programming;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	public static void main(String args[])
	{
		List<String> lst=List.of("ant","apple","basket","ask","aunt","cat","are","aba","abc");
		filterString(lst).forEach(System.out::println);
	}

	private static List<String> filterString(List<String> lst) {
		return lst.stream().filter(st->st.charAt(0)=='a'&&st.length()==3).collect(Collectors.toList());
	}

}