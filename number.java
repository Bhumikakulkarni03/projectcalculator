import java.util.Scanner;
public class number{
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int q=s.nextInt();
        int r=s.nextInt();
        if(p>q&&p>r){
            System.out.println("Largest number is: "+p);
        }
        else if(q>p&&q>r){
            System.out.println("Largest number is: "+q);
        }
        else{
            System.out.println("Largest number is: "+r);
        }
    }
}