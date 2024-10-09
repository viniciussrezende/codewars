package com.codewars.viniciussrezende.kyu_7.move_10;

public class MoveTen {
    public static void main(String[] args) {
        String frase = "Frase";
        System.out.println(fraseDeslocada(frase));
    }

    public static String fraseDeslocada(String frase){

        StringBuilder fraseDeslocada = frase.chars().map((chr) -> {
            if (chr < 97){
                return (((chr + 10 - 'A') % 26)) + 'A';
            }else {
                return (((chr + 10 - 'a') % 26)) + 'a';
            }
        }).collect(StringBuilder::new, (sb, chr) -> sb.append((char) chr), StringBuilder::append);

        return fraseDeslocada.toString();
    }
}
