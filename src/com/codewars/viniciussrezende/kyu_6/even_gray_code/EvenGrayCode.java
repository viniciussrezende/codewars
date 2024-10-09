package com.codewars.viniciussrezende.kyu_6.even_gray_code;

import java.util.stream.Stream;

public class EvenGrayCode {

    public static void main(String[] args) {

        System.out.println(evenGrayCode(5,5));;

    }

    public static int contarBitsUm(int binario){
        String binarioEmString = Integer.toBinaryString(binario);
        return (int) binarioEmString.chars().filter(c -> c == '1').count();
    }

    public static String evenGrayCode(int size, int position) {

        int base = 0, contadorEvenGrayCode = 0;
        for (int contador = 0; contadorEvenGrayCode <= position; contador++){
            if (contarBitsUm(base^contador) % 2 == 0){
                base = contador;
                contadorEvenGrayCode++;
            }
        }

        return String.format("%"+size+"s", Integer.toBinaryString(base)).replace(" ", "0");
    }
}

