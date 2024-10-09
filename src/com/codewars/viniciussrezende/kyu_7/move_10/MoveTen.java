package com.codewars.viniciussrezende.kyu_7.move_10;

public class MoveTen {
    public static void main(String[] args) {
        String frase = "Frase";
        System.out.println(fraseDeslocada(frase));
    }

    public static String fraseDeslocada(String frase){
        StringBuilder fraseModificada = new StringBuilder();
        for (int c = 0; c < frase.length(); c++){
            char charAtual = frase.charAt(c);
            int baseCharacter;

            if (charAtual < 97)
                baseCharacter = 65;
            else
                baseCharacter = 97;

            char charDeslocado = (char) ((((charAtual + 10) % baseCharacter) % 26) + baseCharacter);
            fraseModificada.append(charDeslocado);
        }

        return fraseModificada.toString();
    }
}
