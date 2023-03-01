import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double creditTotal = 0;
        double sum = 0;

        for(int i=0;i<20;i++){
            String[] lesson = scanner.nextLine().split(" ");
            double credit = Double.parseDouble(lesson[1]);
            String score = lesson[2];
            if(!score.equals("P")){
                creditTotal += credit;
            }

            switch (score) {
                case "A+":
                    sum += 4.5 * credit;
                    break;
                case "A0":
                    sum += 4.0 * credit;
                    break;
                case "B+":
                    sum += 3.5 * credit;
                    break;
                case "B0":
                    sum += 3.0 * credit;
                    break;
                case "C+":
                    sum += 2.5 * credit;
                    break;
                case "C0":
                    sum += 2.0 * credit;
                    break;
                case "D+":
                    sum += 1.5 * credit;
                    break;
                case "D0":
                    sum += 1.0 * credit;
                    break;
                default:
                    break;
            }
        }

        System.out.println(sum / creditTotal);
        
        scanner.close();
    }
}