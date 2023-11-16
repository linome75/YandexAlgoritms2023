import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int [] array = new int[length];

        String[] inputArray = scanner.nextLine().split(" ");
        for (int i = 0; i<length; i++){
            array[i] = Integer.parseInt(inputArray[i]);
        }

        int pivot = Integer.parseInt(scanner.nextLine());

        partition(array, length, pivot);
    }

    protected static int[] partition(int[] array, int length, int pivot) {
        int lThen = 0, equal = 0, unexplored = 0;

        while (unexplored < length){

        }


        return array;
    }
}