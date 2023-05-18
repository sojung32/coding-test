import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();

        int result = 0;
        for(int i=0;i<N.length();i++){
            if((int)N.charAt(i) < 65) {
                result = result * B + (N.charAt(i) - '0');
            } else {
                result = result * B + (N.charAt(i) - 55);
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
