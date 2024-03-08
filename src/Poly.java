package src;


import java.util.Scanner;

public class Poly{
    private static float a;
    private static float b;
    private static float c;

    public static void SecondDegre(float a,float b,float c){
        //b=b;
        //a=a;
        //this.c=c;
        if( a==0 & b== 0 & c==0){
            System.out.println(" infinity solution");
            }
        if(a==0 & b != 0){
            float x= -c/b;
            System.out.println(x);
        }
        if(a==0 & b==0 & c!=0){
            throw new NullPointerException(" ensemble vide");
        }
        else{
            float delta = (float) (Math.pow(b,2) -4*a*c);
            System.out.println("the values of delta 2 " +delta);
           if(delta<0){
               System.out.println("no solution");
           }
           if(delta==0){
               float x = - b / (2*a) ;
               System.out.println(x);
           }
            if(delta !=0 & delta>0){
                float x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
               float x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
               System.out.println("we have two solution ");
               System.out.println("the first solution is " +x1);
               System.out.println("the second solution is" +x2);

           }
        }
    }

    public static void main( String[] args) {
	// write your code here
            Scanner sc = new Scanner(System.in);
            System.out.println("inter the value of a");
            a = sc.nextFloat();
            System.out.println("inter the value of b");
            b = sc.nextFloat();
            System.out.println("inter the value of c");
            c = sc.nextFloat();

            SecondDegre(a,b,c);

    }
}
