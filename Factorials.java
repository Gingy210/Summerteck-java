import java.util.Scanner;

public class Factorials {
    

    public static int factorials(int x) {
        if (x == 1) {
            return 1;
        }
        return factorials(x-1)*x;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
        System.out.println(factorials(x));
    }
}