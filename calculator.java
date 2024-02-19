import java.util.Scanner;
class calculator{
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
    void square(int a){
        System.out.println("square "+(a*a));
    }
    void cube(int a){
        System.out.println("cube "+(a*a*a));
    }
    public static void main(String args[]){
        calculator c=new calculator();
        c.add(5,7);
        c.substract(9,7);
        c.multi(5,9);
        c.division(8,7);
        c.square(5);
        c.cube(9);
    }
}