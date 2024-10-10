package com.codewars.viniciussrezende.kyu_6.count_char;


import java.util.Map;
import java.util.stream.Collectors;

public class CountingChar {

    public static void main(String[] args) {
        Map<Character, Integer> teste = count("aab");
        for (Character chr : teste.keySet())
            System.out.printf("'%c': %d%n", chr, teste.get(chr));

    }


    public static Map<Character, Integer> count(String str)  {

        return str.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(chr -> chr,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue
                        )
                ));
    }

}
