import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String word = scanner.nextLine();
        int time = 0;

        for(int i=0;i<word.length();i++){
            for(int j=0;j<dial.length;j++){
                if(dial[j].indexOf(word.substring(i, i+1)) > -1){
                    time += j + 3;
                }
            }
        }

        System.out.println(time);

        scanner.close();
    }
}