package novoquestionario;
import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {


                Scanner teclado = new Scanner(System.in);
                System.out.println("Digite um número: ");
                int numero = teclado.nextInt();

                int fatorial = 1;
                for (int i = 1; i <= numero; i++) {
                    fatorial = fatorial * i;
                }

                System.out.println("O fatorial de " + numero + "! é " + fatorial);

                teclado.close();

            }
}
