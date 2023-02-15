import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.replaceAll("c=|c\\-|dz=|d\\-|lj|nj|s=|z=", "a");
        System.out.println(word.length());
        scanner.close();
    }
}