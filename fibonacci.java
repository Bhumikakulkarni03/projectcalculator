import java.util.Scanner;
public class fibonacci {
  int fib(int count) {
    if (count==0) {
      return 0;
    }
    if (count==1||count==2) {
      return 1;
    } 
    return fib(count-1)+fib(count-2);
  }
  public static void main(String args[]) {
    fibonacci f=new fibonacci();
    System.out.println("Enter a number");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for (int i=0;i<n;i++) {
      System.out.println(f.fib(i));
    }
  }
}