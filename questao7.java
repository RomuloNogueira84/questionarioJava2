package novoquestionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class questao7 {
    public static void main(String[] args) {


                List<Integer> lista = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

                System.out.println("Lista original: " + lista);

                int n = 3;
                char r = 'd'; // 'd' para direita, 'e' para esquerda

                Collections.rotate(lista, r == 'd' ? -n : n);

                System.out.println("Lista rotacionada: " + lista);
            }
        }



