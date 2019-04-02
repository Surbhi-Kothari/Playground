import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int Fact,i;
      int Rem,Temp;
      Temp=n;
      int Sum=0;
      while( Temp > 0)
		{
		Fact=1;
			i = 1; 
		    Rem = Temp % 10;
		    while (i <= Rem)
		    {
		     	Fact = Fact * i;
		  	i++;
            }
         Sum = Sum + Fact;
		     Temp = Temp /10;
      }
        if(n==Sum)
          System.out.println("Yes");
        else
          System.out.println("No");
        
	}
}