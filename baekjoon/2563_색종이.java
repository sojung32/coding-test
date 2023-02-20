import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paper[][] = new int[100][100];
        int count = scanner.nextInt();

        for(int i=0;i<count;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    paper[j][k]++;
                }
            }
        }
        int area = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(paper[i][j] > 0){
                    area++;
                }
            }
        }
        System.out.println(area);

        scanner.close();
    }
}