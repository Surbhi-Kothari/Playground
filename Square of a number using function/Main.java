import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	   int sq=sqroot(n);
      System.out.println(sq);
    }
  public static int sqroot(int n)
  {
    int result=n*n;
    return result;
  }
}