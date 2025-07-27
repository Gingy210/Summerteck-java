import java.util.Scanner;
public class AreaVolume {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int side1=scan.nextInt();
int side2=scan.nextInt();
Area(side1,side2);
System.out.println(Area(side1,side2));

int volside1=scan.nextInt();
int volside2=scan.nextInt();
int volside3=scan.nextInt();
volume(volside1,volside2,volside3);
System.out.println(volume(volside1,volside2,volside3));
    }
    public static int Area(int x, int y){
        int area=x*y;
        return area;
    }
    public static int volume(int w,int r,int z){
        int volume=w*r*z;
        return volume;
    }
}
