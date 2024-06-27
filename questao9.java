package novoquestionario;public class questao9 {
    public static void main(String[] args) {
        // Questão 9 - Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio de elementos em um array cuja soma seja igual a zero.
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean resultado = hasZeroSum(numeros);
        System.out.println(resultado);
    }

    public static boolean hasZeroSum(int[] numeros) {
        int sum = 0;
        for (int numero : numeros) {
            sum += numero;
        }
        return sum == 0;
    }
}
