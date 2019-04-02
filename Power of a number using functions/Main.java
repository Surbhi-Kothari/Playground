import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int base=in.nextInt();
    int power=in.nextInt();
    int result=pow(base,power);
    System.out.println(result);
  }
  public static int pow(int base,int power)
  {
    int count;
    int r=1;
    for(count=1;count<=power;count++)
    {
      r=r*base;
    }
    return r;
  }
}