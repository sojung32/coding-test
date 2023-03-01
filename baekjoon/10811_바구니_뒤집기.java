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

            for(int j=0;j<(change2-change1)/2+1;j++){
                swap(basket, change1+j-1, change2-j-1);
            }
        }

        for(int i=0;i<basket.length;i++){
            System.out.print(basket[i] + " ");
        }

        scanner.close();
    }

    private static void swap(int[] array, int idx1, int idx2){
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}