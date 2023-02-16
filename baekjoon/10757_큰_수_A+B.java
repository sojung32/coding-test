import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String split[] = num.split(" ");
        String result = "";

        int add = 0;
        while((!"".equals(split[0]) || !"".equals(split[1]))){
            int n1 = "".equals(split[0]) ? 0 : Integer.parseInt(split[0].substring(split[0].length()-1));
            int n2 = "".equals(split[1]) ? 0 : Integer.parseInt(split[1].substring(split[1].length()-1));
            result = Integer.toString((n1 + n2 + add) % 10) + result;
            add = (n1 + n2 + add) / 10;

            split[0] = "".equals(split[0]) ? "" : split[0].substring(0, split[0].length()-1);
            split[1] = "".equals(split[1]) ? "" : split[1].substring(0, split[1].length()-1);

            if(("".equals(split[0]) || "".equals(split[1])) && add == 0){
                break;
            }
        }
        if(!"".equals(split[0]) || !"".equals(split[1])){
            System.out.println(split[0] + split[1] + result);
        } else {
            System.out.println(add > 0 ? Integer.toString(add) + result : result);
        }

        scanner.close();
    }
}