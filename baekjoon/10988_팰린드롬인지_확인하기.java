import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int palindrome = 1;
        for(int i=0;i<str.length()/2;i++){
            if(!str.substring(i, i+1).equals(str.substring(str.length()-i-1, str.length()-i))){
                palindrome = 0;
                break;
            }
        }

        System.out.println(palindrome);

        scanner.close();
    }
}