import java.util.Random;
public class Sorting {
     public static void main(String[] a){
       int[] b={4, 1, 5, 3};
       print(b);
shuffle(b);
print(b);
System.out.println(random(0,9));
     }
     /* 
     public static int[] Sortingmain(int[] a){
Random r=new Random();

     }*/
     public static void swap(int[] a,int x1, int x2){
        
       int q=a[x1];
a[x1]=a[x2];
a[x2]=q;
        
     }
     public static void array(int[] a){
        System.out.println(a.length);
     }
     public static void print(int[] a){
        for(int g=0;g<a.length;g++){
            System.out.println(a[g]);
            
        }
        System.out.println();
     }
     public static int random(int min, int max){
      Random r=new Random();
         int s=r.nextInt(max-min+1);
         return s+min;
     }
public static void shuffle(int [] s){

   for(int o=0;o<s.length;o++){
      u=s[]
      s[o]=random(0,9);

   }


}
   }
