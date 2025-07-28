import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
public class Fibinachi {
    

    private static BigInteger fibinachiArray(ArrayList<BigInteger>list, int x) {
        if(x<list.size()){
return  list.get (x);
        }
        BigInteger a=fibinachiArray(list,x-2) .add (fibinachiArray(list,x-1));
        list.add(a);
        return a;
    
    }
public static BigInteger fibinachi(int x){
    ArrayList<BigInteger>list=new ArrayList<BigInteger>();
    list.add(BigInteger.valueOf(0));
    list.add(BigInteger.valueOf(1));
    return fibinachiArray(list,x);
}
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
        System.out.println(fibinachi(x));
    }
}