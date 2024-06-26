package novoquestionario;

import java.util.Arrays;

public class questao2 {
    public static void main(String[] args) {
        // 2- questao Fusão de Arrays: Crie um método que receba dois arrays de Pokémon ordenados e os funda em um único array ordenado.

        String[] array1 = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon"};
        String[] array2 = {"Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie"};

        String[] fusao = fusaoArray(array1, array2);

        System.out.println("Array fusionado:");
        for (int i = 0; i < fusao.length; i++) {
            System.out.print(fusao[i] + " ");
        }
    }

    public static String[] fusaoArray(String[] array1, String[] array2) {
        String[] resultado = new String[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i].compareTo(array2[j]) <= 0) {
                resultado[k++] = array1[i++];
            } else {
                resultado[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            resultado[k++] = array1[i++];
        }

        while (j < array2.length) {
            resultado[k++] = array2[j++];
        }

        return resultado;
    }
}

