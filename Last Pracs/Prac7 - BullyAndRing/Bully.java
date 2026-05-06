import java.util.Scanner;

public class Bully {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, failed;

        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        System.out.print("Enter failed coordinator process: ");
        failed = sc.nextInt();

        System.out.println("\nElection started...\n");

        int coordinator = 0;

        for (int i = 1; i <= n; i++) {

            if (i != failed) {
                System.out.println("Process P" + i +
                        " is active");

                coordinator = i;
            }
        }

        System.out.println("\nProcess P" +
                coordinator +
                " becomes new coordinator");

        sc.close();
    }
}
