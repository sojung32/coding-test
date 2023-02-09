import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0;i<T;i++){
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(dweller(k, n));
        }

        scanner.close();
    }

    public static int dweller(int k, int n){
        if(k == 0) {
            return n;
        } else {
            int sum = 0;
            for(int i=1;i<=n;i++){
                sum += dweller((k-1), i);
            }
            return sum;
        }
    }
}