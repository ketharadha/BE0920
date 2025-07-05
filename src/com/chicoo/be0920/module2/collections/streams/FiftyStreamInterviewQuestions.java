package com.chicoo.be0920.module2.collections.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//https://www.youtube.com/watch?v=tT3gUj6cq2U
public class FiftyStreamInterviewQuestions {

    //Problem 1 : remove duplicates and preserve the order using java
    private static void removeDuplicatesWithOrder() {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        list.stream().distinct().forEach(System.out::println);

        //Set also can remove duplicates. but cannot preserve order.
        //list.stream().collect(Collectors.toSet()).forEach(System.out::println);
        //new HashSet<>(list).forEach(System.out::println);
    }

    //Problem 2 : Find all numbers that are starting with 1 using streams.
    private static void findNumberWithPrefixOne() {
        List<Integer> list = Arrays.asList(12, 34, 15, 11, 54, 32, 10);
        list.stream().filter(n -> !String.valueOf(n).startsWith("1")).forEach(System.out::println);
    }

    //Problem 3 : How to join two streams
    private static void joinTwoStreams() {
        List<Integer> list1 = Arrays.asList(4,2,6,2);
        List<Integer> list2 = Arrays.asList(1,3,9,8);
        Stream<Integer> combinedStream = Stream.concat(list1.stream(), list2.stream());
        combinedStream.forEach(System.out::println);
    }

    //Problem 4 : Two way merge : Merge two sorted lists into single sorted lists using java streams.
    private static void twoWayMergeUsingStreams() {
        List<Integer> list1 = Arrays.asList(4,2,6,2);
        List<Integer> list2 = Arrays.asList(1,3,9,8);
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                                    .sorted()
                                    .toList();
        mergedList.forEach(System.out::print);
    }

    //Problem 5 : Check if a list of integers contains a prime number using Java Streams?
    private static void checkForPrimeNumbers() {
        List<Integer> list = Arrays.asList(2, 1, 5, 20, 14, 9);
        Boolean isPrime = list.stream()
                .anyMatch(FiftyStreamInterviewQuestions::isPrimeUsingStream);
        System.out.println(isPrime);

    }

    //Sub problem
    private static void printAllPrimes() {
        List<Integer> list = Arrays.asList(2, 1, 5, 20, 14, 9);
        list.stream()
                .filter(FiftyStreamInterviewQuestions::isPrimeUsingStream)
                .forEach(System.out::println);
    }

    //Problem 6 : How to debug streams using peek();
    private static void debugStreamsUsingPeak() {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry");
        List<String> result = words.stream()
                .peek(word -> System.out.println("Before : " + word))
                .filter(word -> word.startsWith("a"))
                .peek(word -> System.out.println("The word after filter : " + word))
                .map(String::toUpperCase)
                .peek(word -> System.out.println("After Change : " + word))
                .toList();
        result.forEach(System.out::println);
    }

    //Problem 7 : Given a list of strings, find out those strings which start with a number.
    private static void stringWithNumberPrefix() {
        List<String> list = Arrays.asList("add", "1sub", "mul", "3div");
        list.stream()
                .filter(str -> Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);
    }

    //Problem 8 : Given String is palindrome or not using Java7.
    private static void palindromeUsingJava7() {
        String str = "madam";
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            System.out.println(str.charAt(i) + " : " + str.charAt(str.length()-1-i));
            if (str.charAt(i) != str.charAt(length-1-i)) {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    //Problem 8 : Given String is palindrome or not using Streams.
    private static void palindromeUsingStreams() {
        String str = "madam1";
        boolean isPalindrome = IntStream.rangeClosed(0, str.length()/2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length()-1-i));
        System.out.println(" Is it Palindrome : " +  isPalindrome);
    }

    //Problem 9 : How do you sort given list of decimals in sorted order.
    private static void sortDecimalsList() {
        List<Double> list = Arrays.asList(3.14, 1.59, 2.45, 4.59, 0.77);
        System.out.println("Ascending order --");
        //list.stream().sorted().toList().forEach(System.out::println);
        list.stream().sorted((o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 0 : 1).toList().forEach(System.out::println);

        System.out.println("Descending order --");
        //list.stream().sorted((o1, o2) -> (o1 < o2) ? 1 : (o2 < o1) ? 0 : -1).toList().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);
    }

    //Problem 10 : Find the nth smallest element from the array using java streams.
    private static void findNthSmallestElement() {
        int[] array = {5, 3, 1 , 8, 4, 2, 9};
        int n = 4;

        //Getting Nth Smallest element
        Arrays.stream(array)
                .sorted()
                .skip(n-1)
                .findFirst().ifPresent(System.out::println);

        //Getting Nth Greatest element
        Arrays.stream(array)
                .boxed()// Used when the array is primitive type. Need to convert to Integer wrapper class.
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);
    }

    //Problem 11 : How to get the last element of an array.
    //This is not efficient using stream. But doing this just to know about the skip().
    private static void getLastElementOfArray() {
        int[] array = {4,3,5,1,8,9,13,6};
        Arrays.stream(array).skip(array.length - 1 ).findFirst().ifPresent(System.out::println);
    }

    //Problem 12 : Given a list of strings, join the strings with '[' as prefix, ']' as suffix and ',' as delimiter.
    private static void listOfStrings() {
        List<String> list = Arrays.asList("apple", "banana", "fig", "grape");
        //String str = list.stream().map(s -> "[" +s+"]").collect(Collectors.joining(","));
        String str = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(str);
    }

    //Problem 13 : Find the sum of first two numbers from the given list.
    private static void sumOfFirstTwoNumberFromList() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int sum = list.stream()
                .limit(2)
                .mapToInt(Integer::intValue)
                //.sum();
                .reduce(0, Integer::sum);
        System.out.println(sum);

        //If you want to multiply first two numbers from a list using streams.
        Optional<Integer> multiply = list.stream()
                .limit(2)
                .reduce((a,b) -> a*b);
        multiply.ifPresent(System.out::println);
    }

    // Problem 14 : Find the sum of unique numbers from a given list.
    private static void sumOfUniqueNumbersFromAList() {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 30, 40);
        int sumOfUniqueNumber = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Unique numbers : " + sumOfUniqueNumber);
    }

    //Problem 15 : Find the words with k vowels in a given sentence.
    private static void findKVowelsFromSentence() {
        String str = "This a sentence with vowels";
        int k = 2;
        Arrays.stream(str.split(" ")) // Creating a stream from a sentence
                .filter(word -> countVowels(word) >= k)
                .forEach(System.out::println);
    }

    //Problem 16 : Find the first non-repeated character in it using Stream functions.
    private static void findFirstNonRepeatedChar() {
        String str = "swiss";
        str.chars()
                .mapToObj(ch -> (char) ch)//Create Stream from a word.
                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        findFirstNonRepeatedChar();
    }

    private static long countVowels(String word) {
        return word.chars()
                .mapToObj(ch -> (char)ch) //Create Stream from a word.
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .count();
    }

    //Util Methods
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeUsingStream(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(i ->  n % i == 0);
    }
}
