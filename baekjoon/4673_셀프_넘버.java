import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        int n = 1;
        while(n < 10000) {
            num.add(n);
            list.add(d(n++));
        }
        num.removeAll(list);

        for(int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }
    }
    public static int d(int n){
        int sum = n;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}