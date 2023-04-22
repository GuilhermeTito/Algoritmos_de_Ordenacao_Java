import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while(true)
        {
            menu();
            int op = entradaInteira();
            switch (op) {
                case 1 -> insertionSort();
                case 2 -> selectionSort();
                case 3 -> bubbleSort();
                case 4 -> combSort();
                case 5 -> quickSort();
                case 6 -> mergeSort();
                case 7 -> heapSort();
                case 8 -> shellSort();
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

    public static void insertionSort()
    {
        System.out.println("Insertion Sort");
    }

    public static void selectionSort()
    {
        System.out.println("Insertion Sort");
    }

    public static void bubbleSort()
    {
        System.out.println("Insertion Sort");
    }

    public static void combSort()
    {
        System.out.println("Insertion Sort");
    }

    public static void quickSort()
    {
        System.out.println("Insertion Sort");
    }
    public static void mergeSort()
    {
        System.out.println("Insertion Sort");
    }

    public static void heapSort()
    {
        System.out.println("Insertion Sort");
    }

    public static void shellSort()
    {
        System.out.println("Insertion Sort");
    }
}