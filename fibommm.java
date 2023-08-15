import java.util.*;
class fibommm
{
public static void main (String args[]) 
{ 
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter limit=");
   int n=sc.nextInt();
   int f1=1;
   int f2=f1*f1;
   System.out.print(f1+" "+f2);
    for(int i=2;i<=n;i++)
        {
          System.out.print(" "+f2);
         f1++;
         f2=f1*f1;
     }
   }
}