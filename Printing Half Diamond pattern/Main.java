import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int n=in.nextInt();
	for(int r=1;r<=n;r++)
	{
	    for(int sp=1;sp<=n-r;sp++)
	    {
	        System.out.print(" ");
	        
	    }
	    for(int p=1;p<=2*r-1;p++)
	    {
	        System.out.print("*");
	    }
	    System.out.print("\n");
	}
	}
}