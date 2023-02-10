import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase();
        String split[] = word.split("");
        Arrays.sort(split);

        int frequency = 0;
        int count = 1;
        String freqAlpha = split[0];
        String alphabet = split[0];
        for(int i=1;i<split.length;i++){
            if(!alphabet.equals(split[i])){
                count = 1;
                alphabet = split[i];
            } else {
                count++;
                if(frequency < count){
                    frequency = count;
                    freqAlpha = split[i];
                } else if (frequency == count){
                    freqAlpha = "?";
                }
            }
        }
        System.out.println(freqAlpha);

        scanner.close();
    }
}