import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=N;i++){
            if(hansu(i)){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
    public static boolean hansu(int X){
        int diff = X % 10 - (X / 10) % 10;
        X /= 10;

        while(X > 9) {
            if(diff != X % 10 - (X / 10) % 10){
                return false;
            }
            X /= 10;
        }
        return true;
    }
}