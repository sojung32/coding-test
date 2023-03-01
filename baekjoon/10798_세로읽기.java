import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        int maxLength = 0;

        for(int i=0;i<5;i++){
            array[i] = scanner.nextLine();
            if(array[i].length() > maxLength) {
                maxLength = array[i].length();
            }
        }

        String result = "";
        for(int i=0;i<maxLength;i++){
            for(int j=0;j<5;j++){
                result += array[j].length() > i ? array[j].substring(i, i+1) : "";
            }
        }
        System.out.println(result);

        scanner.close();
    }
}