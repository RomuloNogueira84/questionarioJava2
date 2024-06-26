package novoquestionario;

public class questao3 {
    public static void main(String[] args) {
        // 3- Questão - Média e Desvio Padrão: Escreva um programa que calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double media = mediaArray(array);
        double desvioPadrao = desvioPadraoArray(array);

        System.out.println("Média: " + media);
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }

    public static double mediaArray(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return (double) soma / array.length;
    }

    public static double desvioPadraoArray(int[] array) {
        double media = mediaArray(array);
        double desvioPadrao = 0;
        for (int i = 0; i < array.length; i++) {
            desvioPadrao += Math.pow(array[i] - media, 2);
        }
        return Math.sqrt(desvioPadrao / array.length);
    }
}