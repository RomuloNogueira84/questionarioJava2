package novoquestionario;

import java.util.Scanner;
// 4- Questão - Pesquisa em Matriz: Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado.
public class questao4 {
    public static void main(String[] args) {
        // Matrizes dos Digimons
        String[][] matriz1 = {
                {"Agumon", "Gabumon", "Biyomon", "Tentomon", "Palmon"},
                {"Gomamon", "Patamon", "Gatomon", "Veemon", "Hawkmon"},
                {"Armadillomon", "Wormmon", "Flamedramon", "Raidramon", "Digmon"},
                {"Magnamon", "Rapidmon", "ExVeemon", "Stingmon", "Paildramon"},
                {"Imperialdramon", "Omnimon", "WarGreymon", "MetalGarurumon", "Phoenixmon"}
        };

        String[][] matriz2 = {
                {"Koromon", "Tsunomon", "Yokomon", "Motimon", "Tanemon"},
                {"Bukamon", "Tokomon", "Salamon", "DemiVeemon", "Poromon"},
                {"Upamon", "Minomon", "Flamedramon", "Raidramon", "Digmon"},
                {"Magnamon", "Rapidmon", "ExVeemon", "Stingmon", "Paildramon"},
                {"Imperialdramon", "Omnimon", "WarGreymon", "MetalGarurumon", "Phoenixmon"}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a matriz para pesquisar:");
        System.out.println("1. Matriz 1");
        System.out.println("2. Matriz 2");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        String[][] matrizEscolhida;
        if (escolha == 1) {
            matrizEscolhida = matriz1;
        } else if (escolha == 2) {
            matrizEscolhida = matriz2;
        } else {
            System.out.println("Escolha inválida. Usando Matriz 1 por padrão.");
            matrizEscolhida = matriz1;
        }

        System.out.println("Digite o nome do Digimon a ser pesquisado:");
        String elemento = scanner.nextLine();

        int[] posicao = pesquisar(matrizEscolhida, elemento);

        if (posicao[0] == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado na posição: (" + posicao[0] + ", " + posicao[1] + ")");
        }

        scanner.close();
    }

    public static int[] pesquisar(String[][] matriz, String elemento) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equals(elemento)) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
