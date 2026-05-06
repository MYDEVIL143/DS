import java.util.Scanner;

public class TokenRing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, token;

        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        System.out.print("Enter process holding token initially: ");
        token = sc.nextInt();

        System.out.println("\nToken passing...\n");

        for (int i = 0; i < n; i++) {

            System.out.println("Process " + token +
                    " has token.");

            System.out.println("Process " + token +
                    " entering Critical Section");

            System.out.println("Process " + token +
                    " exiting Critical Section\n");

            token = (token + 1) % n;
        }

        sc.close();
    }
}