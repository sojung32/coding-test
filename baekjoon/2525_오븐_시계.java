import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        C += A * 60 + B;

        System.out.println((C / 60) % 24 + " " + C % 60);

        scanner.close();
    }
}