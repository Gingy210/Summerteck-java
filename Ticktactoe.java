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
int j=1;
int count = 0;
while(j<10){

if(j%2==1 && j<10){
System.out.println("X's Turn. Y coordinant then X coordinant 0,1,2");
int X=scan.nextInt();
int Y=scan.nextInt();
while(X>2||Y>2||Board [Y][X]!="_"){
   System.out.println("Use Valid Numbers (0,1,2)");
    X=scan.nextInt();
     Y=scan.nextInt();
}
    Board [Y][X]="X"; 
   for(int i=0;i<3;i++){
    for(int k=0;k<3;k++){
        System.out.print(Board[i][k]);
    }
System.out.println("");
} 
checkboard(Board);
j++;
if(j%2==0 && j<9){
    System.out.println("O's Turn. Y coordinant then X coordinant 0,1,2");
    X=scan.nextInt();
     Y=scan.nextInt();
    while(X>2||Y>2||Board [Y][X]!="_"){
   System.out.println("Use Valid Numbers (0,1,2)");
    X=scan.nextInt();
     Y=scan.nextInt();
}
Board [Y][X]="O"; 
for(int i=0;i<3;i++){
    for(int k=0;k<3;k++){
        System.out.print(Board[i][k]);
    }
System.out.println("");
}
checkboard(Board);
j++;
}

}
    }
    System.out.print("Tie, no one wins");
    System.exit(0);
}

public static void checkboard (String[][] Board){
for(int w=0;w<3;w++){
if(Board [w][0].equals("X") && Board [w][1].equals("X") && Board [w][2].equals("X")){
    System.out.print("X wins");
    System.exit(0);
}

    }
    for(int w=0;w<3;w++){
if(Board [0][w].equals("X") && Board [1][w].equals("X") && Board [2][w].equals("X")){
    System.out.print("X wins");
    System.exit(0);
}

    }
    for(int w=0;w<3;w++){
if(Board [w][0].equals("O") && Board [w][1].equals("O") && Board [w][2].equals("O")){
    System.out.print("O wins");
    System.exit(0);
}

    }
    for(int w=0;w<3;w++){
if(Board [0][w].equals("O") && Board [1][w].equals("O") && Board [2][w].equals("O")){
    System.out.print("O wins");
    System.exit(0);
}

    }
    if(Board [0][0].equals("X") && Board [1][1].equals("X") && Board [2][2].equals("X")){
        System.out.print("X wins");
        System.exit(0);
    }
   if(Board [0][2].equals("X") && Board [1][1].equals("X") && Board [2][0].equals("X")){
        System.out.print("X wins");
        System.exit(0);
    }
if(Board [0][0].equals("O") && Board [1][1].equals("O") && Board [2][2].equals("O")){
        System.out.print("O wins");
        System.exit(0);
    }
   if(Board [0][2].equals("O") && Board [1][1].equals("O") && Board [2][0].equals("O")){
        System.out.print("O wins");
        System.exit(0);
    }
}
    
}