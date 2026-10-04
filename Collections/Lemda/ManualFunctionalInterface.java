package Collections.Lemda;

public class ManualFunctionalInterface {
    public static void main(String[] args){
        // print(7,25, (a,b)->a+b);
        Calculator c = (a,b)->a+b;
        print(7,25,c);
    }
    static void print(int a , int b , Calculator c){
        System.out.println(c.calculate(a, b));
    }

}
    @FunctionalInterface 
    interface Calculator{
        int calculate(int a,int b);
    }
