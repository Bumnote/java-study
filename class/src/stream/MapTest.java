package stream;

import java.util.Arrays;
import java.util.List;

public class MapTest {

  public static void main(String[] args) {

    List<String> sentences = List.of("hello world", "java stream");

    List<String[]> result1 = sentences.stream()
        .map(s -> s.split(" "))
        .toList();

    System.out.println("-- Map 결과 --");
    for (String[] words : result1) {
      for (String word : words) {
        System.out.println(word);
      }
    }

    List<String> result2 = sentences.stream()
        .flatMap(s -> Arrays.stream(s.split(" ")))
        .toList();

    System.out.println("-- FlatMap 결과 --");
    for (String word : result2) {
      System.out.println(word);
    }

    List<String> lst = List.of("hello", "world", "date");

    List<String> result3 = lst.stream()
        .map(String::toUpperCase)
        .toList();

    System.out.println("-- 대문자 변환 결과 --");
    for (String word : result3) {
      System.out.println(word);
    }

  }

}
