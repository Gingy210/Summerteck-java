public class ConwaysGameofLife {
    public static void main(String [] args){
        boolean [][]board=new boolean[10][10];
Math
        System.out.println(Conway());
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
        if(board[x+1][y]==true){
            neibor++;
        }
        if(board[x-1][y]==true){
            neibor++;
        }
        if (board[x][y-1]==true){
neibor++;
        }
        if(board[x][y+1]==true){
            neibor++;
        }
        if(board[x+1][y+1]==true){
            neibor++;
        }
        if(board[x-1][y-1]==true){
            neibor++;
        }
        if(board[x-1][y+1]==true){
            neibor++;
        }
        if(board[x+1][y-1]==true){
            neibor++;
        }
    return neibor;
    }
    
}
