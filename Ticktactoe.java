import java.util.Scanner;
public class Ticktactoe {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String[][] Board  = new String[3][3];
for(int i=0;i<3;i++){
    for(int k=0;k<3;k++){
        Board [i][k]="_";
        System.out.print(Board[i][k]);
    }
    System.out.println("");
}
System.out.println("X's Turn. Y coordinant then X coordinant 0,1,2");
int X=scan.nextInt();
int Y=scan.nextInt();
while(x>2||y>2){
   System.out.println("Use Valid Numbers (0,1,2)");
}
    Board [Y][X]="X"; 
    }
}