import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[] vetor = new int[20];
        while(true)
        {
            vetor = gerarVetor(vetor);
            menu();
            int op = entradaInteira();
            switch (op) {
                case 1 -> insertionSort(vetor);
                case 2 -> selectionSort(vetor);
                case 3 -> bubbleSort(vetor);
                case 4 -> combSort(vetor);
                case 5 ->
                {
                    System.out.println("Quick Sort");
                    gerarVetor(vetor);
                    quickSort(vetor, 0, vetor.length - 1);
                    imprimirVetor(vetor);
                }
                case 6 -> mergeSort(vetor);
                case 7 -> heapSort(vetor);
                case 8 -> shellSort(vetor);
                case 9 -> System.exit(0);
                default -> System.out.println("Inválido. Digite novamente.");
            }
        }
    }

    public static void menu()
    {
        System.out.println("Algoritmos de Ordenação");
        System.out.println("1 - Insertion sort");
        System.out.println("2 - Selection sort");
        System.out.println("3 - Bubble sort");
        System.out.println("4 - Comb sort");
        System.out.println("5 - Quick sort");
        System.out.println("6 - Merge sort");
        System.out.println("7 - Heap sort");
        System.out.println("8 - Shell sort");
        System.out.println("9 - Sair");
    }

    public static int[] gerarVetor(int[] vetor)
    {
        Random gerador = new Random();
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = gerador.nextInt(100);
        }
        return vetor;
    }

    public static void imprimirVetor(int[] vetor)
    {
        for (int i : vetor) {
            if(i < 10)
            {
                System.out.println("[0" + i + "]");
            }
            else
            {
                System.out.println("[" + i + "]");
            }
        }
    }

    public static int entradaInteira()
    {
        Scanner leitor = new Scanner(System.in);

        boolean ime = true; //InputMismatchException

        while(ime)
        {
            if(leitor.hasNextInt())
            {
                ime = false;
            }
            else
            {
                System.out.println("Inválido. Digite novamente.");
                leitor.nextLine();
            }
        }
        return leitor.nextInt();
    }

    public static void insertionSort(int[] vetor)
    {
        System.out.println("Insertion Sort");

        int n = vetor.length;

        for(int i = 0; i < n; i++)
        {
            int j = i;

            while(j > 0 && vetor[j - 1] > vetor[j])
            {
                int aux = vetor[j];
                vetor[j] = vetor[j - 1];
                vetor[j - 1] = aux;
                j--;
            }
        }
        imprimirVetor(vetor);
    }

    public static void selectionSort(int[] vetor)
    {
        System.out.println("Selection Sort");

        int n = vetor.length;

        for(int i = 0; i < n - 1; i++)
        {
            int min = i;

            for(int j = i; j < n; j++)
            {
                if(vetor[j] < vetor[min])
                {
                    min = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }
        imprimirVetor(vetor);
    }

    public static void bubbleSort(int[] vetor)
    {
        System.out.println("Bubble Sort");

        int n = vetor.length;

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(vetor[j] < vetor[i])
                {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        imprimirVetor(vetor);
    }

    public static void combSort(int[] vetor)
    {
        System.out.println("Comb Sort");

        int n = vetor.length;
        int intervalo = n;
        boolean trocou = true;

        while(intervalo != 1 || trocou) //se o intervalo for 1 e nenhuma troca for feita, o vetor está ordenado
        {
            intervalo = (intervalo * 10) / 13;

            if(intervalo < 1)
            {
                intervalo = 1;
            }

            trocou = false;

            for(int i = 0; i < n - intervalo; i++)
            {
                if(vetor[i + intervalo] < vetor[i])
                {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + intervalo];
                    vetor[i + intervalo] = aux;

                    trocou = true;
                }
            }
        }
        imprimirVetor(vetor);
    }

    public static int particao(int[] vetor, int inicio, int fim)
    {
        int ref = vetor[inicio];
        int down = inicio;
        int up = fim;
        while(down < up)
        {
            //encontrar um valor maior que o valor ref (pivô)
            while(vetor[down] <= ref && down < fim)
            {
                down++;
            }
            //encontrar um valor menor que o valor ref (pivô)
            while(vetor[up] > ref)
            {
                up--;
            }
            //fazer a troca dos valores se a posição down for menor que up, ou seja, se os índices não se cruzaram
            if(down < up)
            {
                int aux = vetor[down];
                vetor[down] = vetor[up];
                vetor[up] = aux;
            }
        }
        //
        vetor[inicio] = vetor[up];
        vetor[up] = ref;
        return up; //up agora é a posição correta do pivô
    }
    public static void quickSort(int[] vetor, int inicio, int fim)
    {
        int pivo;
        if(inicio >= fim) return;
        pivo = particao(vetor, inicio, fim);
        quickSort(vetor, inicio, pivo - 1);
        quickSort(vetor, pivo + 1, fim);
    }

    public static void mergeSort(int[] vetor)
    {
        System.out.println("Merge Sort");
    }

    public static void heapSort(int[] vetor)
    {
        System.out.println("Heap Sort");
    }

    public static void shellSort(int[] vetor)
    {
        System.out.println("Shell Sort");
    }
}