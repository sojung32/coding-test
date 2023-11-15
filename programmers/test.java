/**
 * test
 */
public class test {

    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.max(3l, 5l));
        System.out.println(Math.min(3l, 5l));
        System.out.println(Math.max(3.5d, 1.6d));
        System.out.println(Math.min(3.5d, 1.6d));
        System.out.println(Math.max(4.6f, 3.1f));
        System.out.println(Math.min(4.6f, 3.1f));

        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(3, 2));

        System.out.println(Math.abs(-32));
        System.out.println(Math.abs(-32l));
        System.out.println(Math.abs(-3.2d));
        System.out.println(Math.abs(-3.2f));

        System.out.println(Math.ceil(3.0));
        System.out.println(Math.round(1.2f));
        System.out.println(Math.round(2.3d));
        System.out.println(Math.floor(3.2d));

        System.out.println((int) (Math.random() * 100));
    }
}