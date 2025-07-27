import java.util.ArrayList;
import java.util.Scanner;
public class ArayShoppinglist { 
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("How many items?");
        int a=scan.nextInt();
        scan.nextLine();
         ArrayList<String>list=new ArrayList<String>(a);
         boolean b=true;
         while(b==true){
             String s=scan.nextLine();
         if(!s.equalsIgnoreCase("Done")){
            list.add(s);
         }
         else{
            System.out.println(list);
            System.out.println(list.size());
            b=false;
         }
         }
         System.out.println(list.get(0));
         System.out.println(list.get(list.size()-1));
         System.out.println("Is there anything wrong?");
         String w=scan.nextLine)();
         if (w.equalsIgnoreCase("Yes")){
         System.out.println("Change or Remove?");
         String c=scan.nextLine();
         }
         
        
         


scan.close();
    }
}
