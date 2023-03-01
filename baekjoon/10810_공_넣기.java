import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int basket[] = new int[N];

        for(int i=0;i<M;i++){
            int firstBasket = scanner.nextInt();
            int lastBasket = scanner.nextInt();
            int ball = scanner.nextInt();

            for(int j=firstBasket-1;j<lastBasket;j++){
                basket[j] = ball;
            }
        }

        for(int i=0;i<basket.length;i++){
            System.out.print(basket[i] + " ");
        }

        scanner.close();
    }
}