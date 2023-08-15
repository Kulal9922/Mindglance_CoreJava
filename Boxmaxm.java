import java.util.*;
class Boxmaxm
{
public static void main(String args[])
{
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter how many Boxes=");
      int n=sc.nextInt();
      Box boxarr[]=new Box[n];
      int vol[]=new int[n];
      for(int i=0;i<n;i++)
          {
         boxarr[i]=new Box(); //obj creat
         System.out.println("-----------------------------");
         System.out.println("Box no="+(i+1));
         boxarr[i].get(); //object call the methed 
         vol[i]=boxarr[i].area();  //call the function
         System.out.println("----------------------------"); 
          }
   Arrays.sort(vol);
   int max=vol[vol.length-1];
   System.out.print("The max volume is="+max);
   }
}  