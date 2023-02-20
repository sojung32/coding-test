import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        String mult = Long.toString(A * B * C);
        int[] count = new int[10];

        for(int i=0;i<mult.length();i++){
            count[Integer.parseInt(mult.substring(i, i+1))]++;
        }

        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }
        
        scanner.close();
    }
}