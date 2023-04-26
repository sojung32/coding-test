import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] dateList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayList = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int daySum = day;
        for(int i=0;i<month-1;i++){
            daySum += dateList[i];
        }
        System.out.println(dayList[daySum % 7]);

        scanner.close();
    }
}
