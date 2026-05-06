import java.util.Scanner;

public class Berkeley {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter number of clocks: ");
        n = sc.nextInt();

        int[] clock = new int[n];

        System.out.println("Enter clock times:");

        for (int i = 0; i < n; i++) {
            clock[i] = sc.nextInt();
            sum += clock[i];
        }

        int average = sum / n;

        System.out.println("\nAverage time: " + average);

        System.out.println("\nSynchronized clocks:");

        for (int i = 0; i < n; i++) {
            clock[i] = average;
            System.out.println("Clock " + (i + 1) +
                    " = " + clock[i]);
        }

        sc.close();
    }
}