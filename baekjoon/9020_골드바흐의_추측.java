import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0;i<T;i++){
            int n = scanner.nextInt();
            if(n % 2 == 0){
                for(int j=n/2;j>2;j--){
                    boolean prime = true;
                    for(int k=2;k<=Math.sqrt(j);k++){
                        if(j % k == 0){
                            prime = false;
                            break;
                        }
                    }
                    if(prime){
                        for(int k=2;k<=Math.sqrt(n-j);k++){
                            if((n-j) % k == 0){
                                prime = false;
                                break;
                            }
                        }
                    }
                    if(prime){
                        System.out.println(j + " " + (n-j));
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}