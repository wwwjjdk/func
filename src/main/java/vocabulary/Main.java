package vocabulary;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str = "Привет Пока Нет Да Старт Конец Хочу";
        start(str);
    }

    public static void start(String str) {
        Sort<String,String [] > stringSort = x -> {
            String[] words = x.split(" ");
            return words;
        };
       // Arrays.asList(stringSort.sort(str)).stream().forEach(System.out::println);
        Arrays.stream(stringSort.sort(str)).forEach(System.out::println);
    }
}
