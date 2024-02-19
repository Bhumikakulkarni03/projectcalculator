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
        calculator c=new calculator();
        extendedarith e=new extendedarith();
        c.add(2,6);
        c.substract(6,7);
        c.multi(3,6);
        c.division(6,9);
        e.square(4);
        e.cube(8);
    }
}
