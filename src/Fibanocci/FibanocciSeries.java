package Fibanocci;

public class FibanocciSeries {
    public static void main(String[] args) {
        int n1=0, n2=1, sum=0;
        System.out.println(n1+" "+n2); // 0 1
        for(int i=2;i<10;i++){
            n1=n2;
            n2=sum;
            sum=n1+n2;
            System.out.println(" "+sum);

        }
    }
}
