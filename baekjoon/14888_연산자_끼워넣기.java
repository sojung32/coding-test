import java.util.Scanner;

public class Main {

    private static int[] numeric;
    private static int min = 1000000000;
    private static int max = -1000000000;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        numeric = new int[N];
        int ops[] = new int[4];
        for(int i=0;i<N;i++){
            numeric[i] = scanner.nextInt();
        }
        for(int i=0;i<4;i++){
            ops[i] = scanner.nextInt();
        }

        find(1, ops, numeric[0]);
        System.out.println(max);
        System.out.println(min);
        
        scanner.close();
    }

    private static void find(int index, int[] ops, int num){
        if(index < numeric.length){
            for(int i=0;i<4;i++){
                if(ops[i] > 0){
                    ops[i]--;
                    int sum = num;
                    switch(i){
                        case 0:
                            sum += numeric[index];
                            break;
                        case 1:
                            sum -= numeric[index];
                            break;
                        case 2:
                            sum *= numeric[index];
                            break;
                        case 3:
                            sum /= numeric[index];
                            break;
                    }
    
                    find(index+1, ops, sum);
                    ops[i]++;
                    sum = num;
                }
            }
        } else {
            if(num < min) {
                min = num;
            } 
            if(num > max) {
                max = num;
            }
        }
    }
}
