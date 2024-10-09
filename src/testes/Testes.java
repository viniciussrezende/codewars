package testes;

public class Testes {

    public static void main(String[] args) {

        System.out.println(evenGrayCode(5,5));;

    }

    public static int contarBitsUm(int binario){
        String binarioEmString = Integer.toBinaryString(binario);

        int contador = 0;
        for (int c = 0; c < binarioEmString.length(); c++){
            if (binarioEmString.charAt(c) == '1')
                contador++;
        }

        return contador;
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
