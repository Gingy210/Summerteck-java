 import java.util.Scanner;
public class Shapes{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//    int o=scan.nextInt();
//         for(int i=0;i<o;i++){
//             for(int z=0;z<i+1;z++){
// System.out.print("x");
//        }
//        System.out.println("");
    
// }
int o=scan.nextInt();
for(int c=0;c<o;c++){
    for( int b=o-c;b>0;b--){
       
        System.out.print(" ");
    }
for(int d=0;d < c+1;d++){
System.out.print("x");
System.out.print(" ");

}
System.out.println("");
}


for(int c=0;c<o;c++){
    for( int b=c+1;b>0;b--){
       
        System.out.print(" ");
    }

for(int d=o-c-1;d>0;d--){
System.out.print(" ");
    System.out.print("x");
System.out.print("");

}
System.out.println("");

    }
}
    }
