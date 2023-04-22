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
                case 5 -> quickSort(vetor);
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
            System.out.println("[" + i + "]");
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
    }

    public static void selectionSort(int[] vetor)
    {
        System.out.println("Selection Sort");
    }

    public static void bubbleSort(int[] vetor)
    {
        System.out.println("Bubble Sort");
        for(int i = 0; i < vetor.length - 1; i++)
        {
            for(int j = i + 1; j < vetor.length; j++)
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
    }

    public static void quickSort(int[] vetor)
    {
        System.out.println("Quick Sort");
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