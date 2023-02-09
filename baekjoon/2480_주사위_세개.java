import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int price = 0;

        if (A == B && B == C){
            price = 10000 + 1000 * A;
        } else if (A != B && B != C && C != A){
            price = 100 * (Math.max(A, Math.max(B, C)));
        } else {
            if(A == B || A == C){
                price = 1000 + 100 * A;
            } else {
                price = 1000 + 100 * B;
            }
        }

        System.out.println(price);

        scanner.close();
    }
}