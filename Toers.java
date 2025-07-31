public class Toers {
    public static void main(String [] arrgs){
towers(0,1,2,5);
    }
    public static void towers(int start, int middle, int end, int discs){
if(discs==0){
return;
}
towers(start,end,middle,discs-1);
System.out.println("Move disc "+discs+"  from "+start+" to "+end);
towers(middle,start,end,discs-1);
    }
}