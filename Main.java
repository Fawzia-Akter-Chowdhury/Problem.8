import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        N = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= N; i++)
        {
            fact *= i;
        }
        System.out.println(N + "! = " + fact);

    }
}