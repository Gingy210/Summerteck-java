import java.util.Scanner;
public class Conect4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
String[][] Board  = new String[6][7];
for(int i=0;i<6;i++){
    for(int k=0;k<7;k++){
        Board [i][k]="__";
        System.out.print( Board[i][k]+"     ");
    }
    System.out.println("");
}
String turn = "RED";
int j=1;

while(j<43){
System.out.println(turn + "'s Turn. penk a colomn");
int X=scan.nextInt(); 
while(X!=0||X!=1||X!=2||X!=3||X!=4||X!=5||X!=6||!Board [0][X].equals("__")){
   System.out.println("Use Valid Numbers");
    X=scan.nextInt();
}
for(int q=5;q>=0;q--){
    if(Board[q][X]!="🥵" && Board[q][X]!="🥶"){
if(turn=="RED"){
        Board[q][X]="🥵";
}
else{
    Board[q][X]="🥶";
}
q=0;
    }
 }
 for(int i=0;i<6;i++){
    for(int k=0;k<7;k++){
        System.out.print( Board[i][k]+"     ");
    }
    System.out.println("");
 }
 int p=0;
 int h=0;
for(int e=0;e<=5;e++){
    for(int x=0;x<=3;x++){
   
    if(Board [e][x]=="🥵" && Board [e][x+1]=="🥵" && Board [e][x+2]=="🥵" && Board [e][x+3]=="🥵"){
        System.out.println("Red wins");
    System.exit(0);
    }
    if(Board [e][x]=="🥶" && Board [e][x+1]=="🥶" && Board [e][x+2]=="🥶" && Board [e][x+3]=="🥶"){
        System.out.println("Blue wins");
    System.exit(0);
    }
    

}
}
for(int Row=0;Row<=2;Row++){
    for(int x=0;x<=3;x++){
   
    if(Board [Row][x]=="🥵" && Board [Row+1][x+1]=="🥵" && Board [Row+2][x+2]=="🥵" && Board [Row+3][x+3]=="🥵"){
        System.out.println("Red wins");
    System.exit(0);
    }
    if(Board [Row][x]=="🥶" && Board [Row+1][x+1]=="🥶" && Board [Row+2][x+2]=="🥶" && Board [Row+3][x+3]=="🥶"){
        System.out.println("Blue wins");
    System.exit(0);
    }
    

}
}
for(int Row=0;Row<=2;Row++){
    for(int x=3;x<=6;x++){
   
    if(Board [Row][x]=="🥵" && Board [Row+1][x-1]=="🥵" && Board [Row+2][x-2]=="🥵" && Board [Row+3][x-3]=="🥵"){
        System.out.println("Red wins");
    System.exit(0);
    }
    if(Board [Row][x]=="🥶" && Board [Row+1][x-1]=="🥶" && Board [Row+2][x-2]=="🥶" && Board [Row+3][x-3]=="🥶"){
        System.out.println("Blue wins");
    System.exit(0);
    }
    

}
}
for(int Row=0;Row<=2;Row++){
    for(int x=0;x<=6;x++){
   
    if(Board [Row][x]=="🥵" && Board [Row+1][x]=="🥵" && Board [Row+2][x]=="🥵" && Board [Row+3][x]=="🥵"){
        System.out.println("Red wins");
    System.exit(0);
    }
    if(Board [Row][x]=="🥶" && Board [Row+1][x]=="🥶" && Board [Row+2][x]=="🥶" && Board [Row+3][x]=="🥶"){
        System.out.println("Blue wins");
    System.exit(0);
    }
    

}
}
if(turn.equals("RED")){
    turn="Blue";
    j++;
}
else{
    turn="RED";
    j++;
}

    }
    System.out.println("Draw");
    }
}
    

