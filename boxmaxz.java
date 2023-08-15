import java.util.*;
class boxmaxz
{
  public static void main(String args[])
  {
  
  Scanner sc = new Scanner(System.in);
  System.out.print("How many box enter=");
  int n=sc.nextInt();
  Boxz boxarr[] = new Boxz[n];
  int vol[] = new int[n];
  for(int i=0;i<n;i++)
     {
       boxarr[i]=new Boxz();
       System.out.println("........................................");
       System.out.println("box num="+(i+1));
       boxarr[i].get();
       vol[i]=boxarr[i].area();
       System.out.println("..............................");
      }
   Arrays.sort(vol);
   int max=vol[vol.length-1];
   System.out.print("The max volume is="+max);  
  }
}


   
       