package Overloading;

public class MethodOverloading {
    static int addition(int a,int b){
        return a+b;
    }
    static int addition(int a,int b,int c){
        return a+b+c;
    }
    static double addition(double a,double b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(addition(2,3));
        System.out.println(addition(3,4,5));
        System.out.println(addition(10.5,12.3,1));
    }
}
