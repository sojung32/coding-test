import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<N-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j=2*(N-1-i);j>1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}