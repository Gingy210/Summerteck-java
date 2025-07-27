import java.util.Scanner;
    public class Advanced_Calc {
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
                System.out.println("Figure it out. Only two numbers at a time");
                     String x=scan.nextLine();
                        while(!x.equals("Exit")){
                            switch(x){
                                case "M":
                                    float mult1=scan.nextFloat();
                                        float mult2=scan.nextFloat();
                                            System.out.println(Mult(mult1, mult2));
                                                break;
                                                    case "D":
                                                        float div1=scan.nextFloat();
                                                            float div2=scan.nextFloat();
                                                                System.out.println(Div(div1, div2));
                                                                    break;
                                                                        case "A":
                                                                            float add1=scan.nextFloat();
                                                                                float add2=scan.nextFloat();
                                                                                    System.out.println(Add(add1, add2));
                                                                                        break;
                                                                                            case "S":
                                                                                                float sub1=scan.nextFloat();
                                                                                                    float sub2=scan.nextFloat();
                                                                                                        System.out.println(Sub(sub1, sub2));
                                                                                                            break;
                                                                                                                case "P":
                                                                                                                    double pow1=scan.nextInt();
                                                                                                                        double pow2=scan.nextInt();
                                                                                                                            System.out.println(Pow(pow1, pow2));
                                                                                                                                break;
                                                                                                                                    case "R":
                                                                                                                                        double sqrt1=scan.nextDouble();
                                                                                                                                            System.out.println(Sqrt(sqrt1));
                                                                                                                                                break;
                                                                                                                            
}
                                                                                                                                                    x=scan.nextLine();

}
    }
    public static float Mult(float x, float y){
        float Mult=x*y;
            return Mult;
        }
                public static float Div(float x,float y){
                    float Div=x/y;
                        return Div;
            }
                            public static float Add(float x,float y){
                                float Add=x+y;
                                    return Add;
                }
                                        public static float Sub(float x,float y){
                                            float Sub=x-y;
                                                return Sub;
                    }
                                                    public static double Pow(double x,double y){
                                                        double Pow= Math.pow(x, y);
                                                            return Pow;
                    }
                                                                public static double Sqrt(double x){
                                                                    double Sqrt= Math.sqrt(x);
                                                                        return Sqrt;
                    }
                        }
