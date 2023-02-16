import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = N;

        for(int i=0;i<N;i++){
            String word = scanner.next();
            for(int j=0;j<word.length()-1;j++){
                String alphabet = word.substring(j, j+1);
                if(alphabet.equals(word.substring(j+1, j+2))){
                    continue;
                } else {
                    if(word.indexOf(alphabet, j+1) > -1){
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }
}