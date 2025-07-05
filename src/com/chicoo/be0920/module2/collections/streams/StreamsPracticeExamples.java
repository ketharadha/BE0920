package com.chicoo.be0920.module2.collections.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPracticeExamples {

    /**
     * Write a program that filters a list of integers to only include even numbers
     * and then maps those numbers to their squares.
     * [4, 16, 36]
     */
    private void filterAndMap() {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        System.out.println(
                integers.stream()
                        .filter((Integer n) -> (n%2 == 0))
                        .map((Integer n) -> n*n)
                        .collect(Collectors.toList())
        );
    }

    /**
     * From a list of strings, find the first string that starts with "A" and is longer than 3 characters.
     * "Alex"
     */
    private void privateFindFirstMatchElement() {
        List<String> strings = List.of("Alex", "Amy", "Bob", "Anna", "John");
        Optional<String> firstElementWithA = strings.stream()
                .filter((String s) -> s.startsWith("A"))
                .findFirst();
        System.out.println(firstElementWithA.orElse(""));
    }

    /**
     * Given a list of integers, sort them in descending order and pick the top three numbers.
     * [9, 8, 4]
     */
    private void sortAndLimit() {
        List<Integer> numbers = List.of(8,2,3,1,9,4);
        System.out.println(numbers.stream()
                .sorted((Integer i, Integer j) -> j - i)
                .limit(3)
                .collect(Collectors.toList())
        );
    }

    /**
     * Convert all the strings in a list to uppercase.
     * [HELLO, WORLD, JAVA]
     */
    private void convertToUpperCase() {
        List<String> words = List.of("hello", "world", "java");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCaseWords);
    }

    /**
     * Group a list of strings by their lengths.
     * {3=[cat, dog, rat, bat], 8=[elephant]}
     */
    private void groupByLength() {
        List<String> words = List.of("cat", "eagle", "elephant", "rat", "bat");
        Map<Integer,List<String>> groupBY = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupBY);
    }

    /**
     * Count the occurrences of each word in a list.
     * {apple=3, banana=2, orange=1}
     */
    private void countOfOccurrencesUsingGroupingBy() {
        List<String> words = List.of("apple", "banana", "apricot", "orange", "banana", "apple");
        Map<String,Long> countBY = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(countBY); // {orange=1, banana=2, apple=3}

        Map<String,Long> sortedCountBY = words.stream()
                .collect(Collectors.groupingBy(word -> word, TreeMap::new, Collectors.counting()));
        System.out.println(sortedCountBY); // {apple=3, banana=2, orange=1}

        Map<String,List<String>> groupCountBY = words.stream()
                .collect(Collectors.groupingBy(word -> word.substring(0, 2))
                );

        System.out.println("\n\n"+groupCountBY+"\n\n");

        //Nested Grouping By
        Map<Character,Map<Integer, List<String>>> nestedGroupCountBY = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0),
                                                Collectors.groupingBy(String::length)
                                                )
                        );
        System.out.println(nestedGroupCountBY);
        String outputString = """
                                {
                                    a={
                                        5=[apple, apple],\s
                                        7=[apricot]
                                      },\s
                                    b={
                                        6=[banana, banana]
                                      },\s
                                    o={
                                        6=[orange]
                                      }
                                }
                """;
    }

    private void maxNumber() {
        List<Integer> numbers = List.of(3, 7, 2, 8, 5, 9);
        Integer maxNumber = numbers.stream()
                .max(Comparator.comparingInt((Integer x) -> x))
                .get();
        System.out.println(maxNumber);

        Integer minNumber = numbers.stream()
                .min(Comparator.comparingInt((Integer x) -> x))
                .get();
        System.out.println(minNumber);
    }

    private void reduceToSum() {
        List<Integer> numbers = List.of(2,1,4,7,10);
        Integer total = numbers.stream()
                .reduce((Integer x, Integer y) -> x+y).get();
        System.out.println(total);
    }

    private void findPalindrome() {
        List<String> words = List.of("madam", "level", "world", "java", "radar"); // Input
        List<String> palindromeWords = words.stream()
                .filter((String word) -> {
                    return new StringBuilder(word).reverse().toString().equals(word);
                }).toList();
        System.out.println(palindromeWords);
    }

    private void flatMap() {
        List<List<Integer>> listOfLists = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6), List.of(7, 8));
        List<Integer> flatMap = listOfLists.stream()
                //.flatMap((List<Integer> numbers) -> numbers.stream().map((Integer n) -> n))
                .flatMap(Collection::stream)
                .map((Integer n) -> n/2)
                .toList();
        System.out.println(flatMap);
        System.out.println("\n");

        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY"));
        //List<String> stringFlatMap = sentenceList.stream().flatMap(Collection::stream).toList();
        List<String> stringFlatMap = sentenceList.stream()
                                    .flatMap((List<String> sentence) -> sentence.stream().map(String::toLowerCase))
                                    .toList();

        System.out.println(stringFlatMap);
    }

    public static void main(String[] args) {
        StreamsPracticeExamples practiceExamples = new StreamsPracticeExamples();
        practiceExamples.findPalindrome();
    }
}
