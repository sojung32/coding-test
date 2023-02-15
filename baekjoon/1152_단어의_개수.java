import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        if(!"".equals(sentence.trim())){
            System.out.println(sentence.trim().split(" ").length);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}