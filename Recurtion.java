public class Recurtion {
    public static int countup(int x, int y){
if(x==y){
    return x;
} 
System.out.println(x);
return countup(x-1, y);
        

    }
public static void main(String [] args){
System.out.println(countup(5, 0));
}
}
