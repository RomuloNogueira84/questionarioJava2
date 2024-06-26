package novoquestionario;

public class questao4 {
    public static void main(String[] args) {
        // 4- Questão 4 - Pesquisa em Matriz: Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado.
        String[][] matriz = {
                {"Agumon", "Gabumon", "Biyomon", "Tentomon", "Palmon"},
                {"Gomamon", "Patamon", "Gatomon", "Veemon", "Hawkmon"},
                {"Armadillomon", "Wormmon", "Flamedramon", "Raidramon", "Digmon"},
                {"Magnamon", "Rapidmon", "ExVeemon", "Stingmon", "Paildramon"},
                {"Imperialdramon", "Omnimon", "WarGreymon", "MetalGarurumon", "Phoenixmon"}
        };
        String elemento = "Veemon";
        int[] posicao = pesquisar(matriz, elemento);

        if (posicao[0] == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado na posição: (" + posicao[0] + ", " + posicao[1] + ")");
        }
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
