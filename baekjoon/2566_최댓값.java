import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int column = 0, row = 0;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int num = scanner.nextInt();
                if(num > max){
                    max = num;
                    column = i;
                    row = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(column + " " + row);

        scanner.close();
    }
}