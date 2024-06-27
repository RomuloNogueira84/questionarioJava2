package novoquestionario;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class questao8 {
    public static void main(String[] args) {
                int[] numeros = {1, 5, 3, 4, 5, 7, 7, 8, 9, 3};
                Map<Integer, Integer> frequencia = frequencia(numeros);

                System.out.println("Lista original: " + Arrays.toString(numeros));
                System.out.println("Frequência: " + frequencia);
            }

            public static Map<Integer, Integer> frequencia(int[] numeros) {
                Map<Integer, Integer> frequencia = new HashMap<>();
                for (int numero : numeros) {
                    if (frequencia.containsKey(numero)) {
                        frequencia.put(numero, frequencia.get(numero) + 1);
                    } else {
                        frequencia.put(numero, 1);
                    }
                }
                return frequencia;
            }
        }



