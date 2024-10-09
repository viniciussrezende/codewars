package com.codewars.viniciussrezende.kyu_7.move_10;

public class MoveTen {
    public static void main(String[] args) {
        String frase = "Frase";
        System.out.println(fraseDeslocada(frase));
    }

    public static String fraseDeslocada(String frase){

        StringBuilder fraseDeslocada = frase.chars().map((chr) -> {
            if (chr < 97){
                return (((chr + 10) % 65) % 26) + 65;
            }else {
                return (((chr + 10) % 90) % 26) + 97;
            }
        }).collect(StringBuilder::new, (sb, chr) -> sb.append((char) chr), StringBuilder::append);

        return fraseDeslocada.toString();
    }
}
