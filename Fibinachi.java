import java.util.Scanner;

public class Fibinachi {
    

    public static int Fibinachi(int x) {
        if (x == 1) {
            return 1;
        }
        if(x== 0){
            return 0;
        }
        return Fibinachi(x-2) + Fibinachi(x-1);

    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
        System.out.println(Fibinachi(x));
    }
}