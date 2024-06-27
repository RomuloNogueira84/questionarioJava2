import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class questao5 {
    public static void main(String[] args) {
        // Questão 5 - Operações de Conjunto: Escreva funções que realizem operações de união, interseção e diferença entre dois arrays.
        String[] array1 = {"Angular", "Java", "Javascript", "Python", "Ruby"};
        String[] array2 = {"C++", "Go", "C#", "C", "React"};

        System.out.println("União:");
        String[] uniao = uniao(array1, array2);
        imprimirArray(uniao);

        System.out.println("Interseção:");
        String[] intersecao = intersecao(array1, array2);
        imprimirArray(intersecao);

        System.out.println("Diferença:");
        String[] diferenca = diferenca(array1, array2);
        imprimirArray(diferenca);
    }

    public static String[] uniao(String[] array1, String[] array2) {
        Set<String> conjunto = new HashSet<>(Arrays.asList(array1));
        conjunto.addAll(Arrays.asList(array2));
        return conjunto.toArray(new String[0]);
    }

    public static String[] intersecao(String[] array1, String[] array2) {
        Set<String> conjunto1 = new HashSet<>(Arrays.asList(array1));
        conjunto1.retainAll(Arrays.asList(array2));
        return conjunto1.toArray(new String[0]);
    }

    public static String[] diferenca(String[] array1, String[] array2) {
        Set<String> conjunto1 = new HashSet<>(Arrays.asList(array1));
        conjunto1.removeAll(Arrays.asList(array2));
        return conjunto1.toArray(new String[0]);
    }

    public static void imprimirArray(String[] arr) {
        for (String elemento : arr) {
            System.out.println(elemento);
        }
    }
}


