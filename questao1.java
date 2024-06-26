package novoquestionario;

public class questao1 {
    public static void main(String[] args) {

                // Criando um array com alguns nomes de times de futebol
                String[] times = {
                        "Flamengo", "Palmeiras", "São Paulo", "Corinthians", "Grêmio",
                        "Internacional", "Atlético-MG", "Fluminense", "Cruzeiro", "Vasco da Gama"};

                // Ordenando o array por ordem alfabética usando Bubble Sort
                bubbleSort(times);

                System.out.println("Times ordenados por ordem alfabética:");
                for (String time : times) {
                    System.out.println(time);
                }

                // Agora, vamos embaralhar o array para dar um toque divertido!
                embaralharArray(times);

                System.out.println("\nArray embaralhado:");
                for (String time : times) {
                    System.out.println(time);
                }
            }

            // Método para ordenação com Bubble Sort
            public static void bubbleSort(String[] array) {
                int n = array.length;
                boolean swapped;
                do {
                    swapped = false;
                    for (int i = 1; i < n; i++) {
                        if (array[i - 1].compareTo(array[i]) > 0) {
                            String temp = array[i - 1];
                            array[i - 1] = array[i];
                            array[i] = temp;
                            swapped = true;
                        }
                    }
                } while (swapped);
            }

            public static void embaralharArray(String[] array) {
                for (int i = array.length - 1; i > 0; i--) {
                    int j = (int) (Math.random() * (i + 1));
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

