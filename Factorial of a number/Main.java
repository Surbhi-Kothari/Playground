import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fact=1;
      int c=1;
      while(c<=n)
      {
        fact=fact*c;
        c++;
      }
      System.out.println(fact);
	}
}