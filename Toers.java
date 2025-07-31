public class Toers {
    public static void main(String [] arrgs){
towers(0,1,2,3);
    }
    public static void towers(int start, int middle, int end, int discs){
if(discs==0){
return;
}
towers(0,2,1,discs-1);
System.out.println("Move disc "+discs+"  from "+start+" to "+end);
towers(0,1,2,discs-1);
    }
}