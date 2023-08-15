import java.util.*;
class Boxm
{
   int height;int width;int depth ;
   void get()
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter height,depth,width=");
           height =sc.nextInt();
           depth=sc.nextInt();
           width=sc.nextInt();
   }
      int area()
       {
           int vol=height*depth*width;
           return vol;
  }
} 
  

class test
{
public static void main (String args[])
{
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter how many Boxes=");
     int n=sc.nextInt();
     Box b[]=new Box[n];
      for(int i=0;i<n;i++)
   {
       b[i]=new Box();
       b[i].get();
       int v=b[i].area();
       System.out.print("Ans="+v);
}
}
}