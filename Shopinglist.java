import java.util.Scanner;
public class Shopinglist {
    public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      int x=0;
      while(x<10){
        System.out.print(x);
        x++;
      }
      System.out.print("How many items do you want? ");
      int o=scan.nextInt();
      scan.nextLine();
      String[] List  = new String[o];
      for(int i=0;i<List.length;i++){
        String item=scan.nextLine();
        List[i]=item;
      }
      for(int c=0;c<List.length;c++){
      System.out.print(List[c]);
      System.out.println("");
    }
    }
}
