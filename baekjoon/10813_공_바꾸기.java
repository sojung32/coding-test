import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int basket[] = new int[N];

        for(int i=0;i<basket.length;i++){
            basket[i] = i + 1;
        }

        for(int i=0;i<M;i++){
            int change1 = scanner.nextInt();
            int change2 = scanner.nextInt();

            int temp = basket[change1-1];
            basket[change1-1] = basket[change2-1];
            basket[change2-1] = temp;
        }

        for(int i=0;i<basket.length;i++){
            System.out.print(basket[i] + " ");
        }

        scanner.close();
    }
}