import java.util.Scanner;
public class ConwaysGameofLife {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        boolean [][]board=new boolean[50][50];

for(int x=0;x<50;x++){
    for(int y=0;y<50;y++){
        
        board[x][y]=Math.random()>0.5;
    }
}
while(true){
    print(board);
    board=Conway(board);
    System.out.println("");
    scan.nextLine();
}
        
    }
    public static boolean[][] Conway(boolean [][] board){
        boolean[][]francis=new boolean[board.length][board[0].length]; 
        for(int x=0;x<board.length;x++){
            for(int y=0;y<board[x].length;y++){
                int r=neibors(board,x,y);
if(r>=4){
francis[x][y]=false;
}
if(r<=1){
francis[x][y]=false;
}
if(r==3){
    francis[x][y]=true;
}
if(r==2){
    francis[x][y]=board[x][y];
}
            }
        }
        return francis;
    }
    public static int neibors(boolean [][] board, int x,int y){
        int neibor=0;
        for(int u=x-1;u<x+2;u++){
            for(int p=y-1;p<y+2;p++){
                try{
                    if(board[u][p]==true&&(u!=x||p!=y)){
            neibor++;
        }

                }catch(ArrayIndexOutOfBoundsException e){

                }
                
           
        }
        
        }
        
    return neibor;
    }
public static void print(boolean [][] board){
    for(int x=0;x<board.length;x++){
    for (int y=0;y<board[x].length;y++){
        System.out.print(board[x][y]?"🟩":"⬜");
    }
    System.out.println("");
    }
}
    
}
//🟩
//⬜