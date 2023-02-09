import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int newN = N;
        int cycle = 0;

        do {
            newN = (newN % 10) * 10 + ((newN / 10) + (newN % 10)) % 10;
            cycle++;
        } while (newN != N);

        System.out.println(cycle);
        
        scanner.close();
    }
}