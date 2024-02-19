import java.util.Scanner;
class calculator extends extendedarith{
    void add(int a,int b){
        System.out.println("Addition "+(a+b));
    }
    void substract(int a,int b){
        System.out.println("Substraction "+(a-b));
    }
    void multi(int a,int b){
        System.out.println("product "+(a*b));
    }
    void division(int a,int b){
        System.out.println("division "+(a/b));
    }
    public static void main(String args[]){
        int a=12;
        int b=15;
        calculator c=new calculator();
        extendedarith e=new extendedarith();
        c.add(a,b);
        c.substract(a,b);
        c.multi(a,b);
        c.division(a,b);
        e.square(4);
        e.cube(8);
    }
}