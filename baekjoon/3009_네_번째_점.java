import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        
        int x4 = x1 == x2 ? x3 : x1 == x3 ? x2 : x1;
        int y4 = y1 == y2 ? y3 : y1 == y3 ? y2 : y1;
        
        System.out.println(x4 + " " + y4);

        scanner.close();
    }
}
