import java.util.*;
class factorial
{
public static void main (String args[]) 
{ 
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter limit=");
   int n=sc.nextInt();
   int r=fact(n);
   System.out.print("Ans="+r);
  }
    public static int fact (int n) 
    {
      if (n==1)
         return 1;
      else
         return n*fact(n-1);
     }
    }
