import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int array[] = new int[N];
        int max = 0;
        double sum = 0;

        for(int i=0;i<N;i++){
            array[i] = scanner.nextInt();
            if(array[i] > max){
                max = array[i];
            }
        }
        for(int i=0;i<N;i++){
            sum += array[i] / (double) max * 100;
            System.out.println("sum = " + sum);
        }
        System.out.println(sum / (double) N);

        scanner.close();
    }
}