import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arrayCnt = n > 2 ? n : 2;

        int[] fibonacci = new int[arrayCnt + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i=2;i<=n;i++){
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        System.out.println(fibonacci[n]);

        scanner.close();
    }
}
