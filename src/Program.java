import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int num = scan.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the value of #" + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        int evenCount = 0;
        System.out.println("Even numbers: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
                evenCount++;
            }
        }

        System.out.println();
        System.out.println("Quantity of even numbers: " + evenCount);

        scan.close();
    }
}
