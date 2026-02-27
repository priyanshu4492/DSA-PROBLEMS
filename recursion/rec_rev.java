package recursion;

public class rec_rev {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int num = factorial(3);
        System.out.println(num);

    }
}
