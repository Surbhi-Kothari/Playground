import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int n=in.nextInt();
      int num=n;
	for(int i=num;i>=1;i--)
    {
      for(int j=i;j>=1;j--)
      {
        System.out.print(j);
        
      }
      num=num-1;
      System.out.print("\n");
    }
    }
}