import java.util.Random;

public class Sorting {
   public static void main(String[] a) {
      int[] b = new int[1_0];
      for (int y = 1; y < 1_1; y++) {
         b[y - 1] = y;
      }
      shuffle(b);

     print(b);
   }

   public static int bogosort(int[] a) {
      int time = 0;

      while (sorttf(a) == false) {
         shuffle(a);
         time++;
      }
      return time;
   }

   /*
    * public static int[] Sortingmain(int[] a){
    * Random r=new Random();
    * 
    * }
    */
   public static void swap(int[] a, int x1, int x2) {

      int q = a[x1];
      a[x1] = a[x2];
      a[x2] = q;

   }

   public static void array(int[] a) {
      System.out.println(a.length);
   }

   public static void print(int[] a) {
      for (int g = 0; g < a.length; g++) {
         System.out.println(a[g]);

      }
      System.out.println();
   }

   public static int random(int min, int max) {
      Random r = new Random();
      int s = r.nextInt(max - min + 1);
      return s + min;
   }

   public static void shuffle(int[] s) {

      for (int o = 0; o < s.length; o++) {
         int u = random(o, s.length - 1);
         swap(s, u, o);

      }

   }

   public static boolean sorttf(int[] a) {
      boolean tf = true;
      for (int miles = 0; miles < a.length - 1; miles++) {
         if (a[miles] <= a[miles + 1]) {
         } else {
            tf = false;
         }
      }
      return tf;
   }

   public static int bubblesort(int[] a) {
      boolean tf = false;
      int time = 0;
      while (tf == false) {
         tf = true;
         for (int miles = 0; miles < a.length - 1; miles++) {
            if (a[miles] <= a[miles + 1]) {
            } else {
               swap(a, miles, miles + 1);
               tf = false;
            }
         }
         time++;
      }
      return time;
   }

   public static void Selectionsort(int[] a) {
      for (int sizer = 0; sizer < a.length; sizer++) {
         int min = sizer;
         for (int num = min + 1; num < a.length; num++) {
            if (a[num] < a[min]) {
               min = num;
            }
         }
         swap(a, min, sizer);
      }
   }

   public static void insertionsort(int[] a) {
      for (int sort = 1; sort < a.length; sort++) {
         int insert = sort - 1;
         while (insert > -1 && a[insert] > a[insert + 1]) {
            swap(a, insert, insert + 1);
            insert--;
         }
      }
   }

public static int [] merge(int [] a, int [] b){
int []arr=new int[a.length+b.length];
int aPosition=0;
int bPosition=0;
   while(aPosition<a.length || bPosition <b.length){
if (aPosition>=a.length){
   arr[aPosition+bPosition]=b[bPosition];
   bPosition++;
}else if (bPosition>=b.length){
   arr[aPosition+bPosition]=a[aPosition];
   aPosition++;
}
else{
 if(a[aPosition]>b[bPosition]){
   arr[aPosition+bPosition]=b[bPosition];
   bPosition++;
 }  
 else{
   arr[aPosition+bPosition]=a[aPosition];
   aPosition++;
 }
 
}

   }
   return arr;

   
}
public static void mergesort(int [] a){
   if(a.length<=1){
      return;
   }
   int[]array1=new int[a.length/2];
   int[]array2=new int[a.length-array1.length];
   for(int mover=0;mover<array1.length;mover++){
      array1[mover]=a[mover];
   }
for (int mover2=array1.length; mover2<a.length;mover2++){
array2[mover2-array1.length]=a[mover2];
}
mergesort(array1);
mergesort(array2);
int[]mergearray=merge(array1,array2);
for(int point=0;point<a.length;point++){
   a[point]=mergearray[point];
}

}
public static void quicksort(int [] a,int start,int end){
   
   if(start>=end){
      return;
   }
   int pivot=a[end];
   int mover1=0;
   int mover2=0;
while(mover2<end){
if(a[mover2]<pivot){
   swap(a,mover2,mover1);
   mover2++;
   mover1++;
}
else{
   mover2++;
}

}
swap(a, mover1,end);
}
}
