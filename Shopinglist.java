import java.util.Scanner;
public class Shopinglist {
    public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      System.out.print("How many items do you want");
      int o=scan.nextInt();
      String[] List  = new String[o];
      for(int i=0;i<List.length;i++){
      String item=scan.nextLine();
      List[i]=item;
      }
      System.out.print()
    }
}
