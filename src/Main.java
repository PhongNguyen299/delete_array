import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr;
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size = scanner.nextInt();
        arr = new int [size];

        for (i = 0; i < size ;i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Property list: ");
        for (j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("\nEnter number you want to delete: ");
        int x = scanner.nextInt();
        for (i = j = 0; i < size; i++){
            if (arr[i] != x) {
                arr[j] = arr[i];
                j++;
            }
        }

        size = j;

        for (i = 0; i < j; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}