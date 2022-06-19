package triangleS;

public class Triangle {
    public static double a=3.0;
    public static double b=4.0;
    public static double c=5.0;


    public static void main(String[] args) {
        System.out.println(trS());

    }
    public static double trS(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));




    }
}