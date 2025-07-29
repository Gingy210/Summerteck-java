import java.util.Random;
public class Sorting {
     public static void main(String[] a){
      int[] b=new int[100];
      for(int y=1;y<101;y++){
         b[y-1]=y;
      }
      shuffle(b);
       System.out.println(bubblesort(b));
        print(b);
     }
     public static int bogosort(int [] a){
int time=0;

      while(sorttf(a)==false){
         shuffle(a);
time++;
}
return time;
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
     int u=random(o, s.length -1);
      swap(s, u, o);

   }


}
public static boolean sorttf(int [] a){
boolean tf=true;
for(int miles=0; miles<a.length-1; miles++){
   if(a[miles]<=a[miles+1]){
   }
   else{
      tf=false;
   }
}
 return tf;  
}
public static int bubblesort(int [] a){
   boolean tf=false;
   int time=0;
   while(tf==false){
       tf=true;
   for(int miles=0; miles<a.length-1; miles++){
   if(a[miles]<=a[miles+1]){
   }
   else{
      swap (a, miles, miles+1);
      tf=false;
   }
   }
  time++;
}
return time;
}
   }
