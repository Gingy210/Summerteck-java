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
            
            b=false;
         }
         }
         String w;
         do{
         System.out.println(list);
            System.out.println(list.size());
         System.out.println("Is there anything wrong?");
         w=scan.nextLine();
         if (w.equalsIgnoreCase("Yes")){
         System.out.println("Change or Remove?");
         String c=scan.nextLine();
         if(c.equalsIgnoreCase("change")){
            System.out.println("which do you want to change?");
            int n=scan.nextInt();
            scan.nextLine();
            System.out.println("Change to what?");
            String s=scan.nextLine();
            list.set(n,s);
            System.out.println(list);
            System.out.println(list.size());
         }
         else{
            System.out.println("What do you want to remove?");
            int r=scan.nextInt();
            scan.nextLine();
            list.remove(r);
         }
         }
         }
         while(!w.equalsIgnoreCase("no"));
        
         


scan.close();
    }
}
