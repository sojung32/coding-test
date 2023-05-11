import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int xGap = x > Math.abs(x - w) ? Math.abs(x - w) : x;
        int yGap = y > Math.abs(y - h) ? Math.abs(y - h) : y;

        System.out.println(xGap > yGap ? yGap : xGap);

        scanner.close();
    }
}
