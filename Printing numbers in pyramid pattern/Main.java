import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int n=in.nextInt();
      int no=n;
      int value=1;
	for(int r=1;r<=n;r++)
	{
	    for(int sp=1;sp<=n-r;sp++)
	    {
	        System.out.print(" ");
	        
	    }
	    for(int p=1;p<=r;p++)
	    {
	        System.out.print(value+" " );
	    value++;
        }
	    System.out.print("\n");
  
	}
	}
}