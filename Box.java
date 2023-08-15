import java.util.*;
class Box
{
   int height;int width;int depth;
   void get()    //method
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter height,depth,width=");
           height =sc.nextInt();
           depth=sc.nextInt();
           width=sc.nextInt();
   }
      int area()     //function
       {
           int vol=height*depth*width;
           return vol;
  }
} 
  

class test
{
public static void main (String args[])
{
      Box b1=new Box();  //creat object
      b1.get();  //called method
      int v=b1.area();   //called function
      System.out.print("Volume="+v);

   }
} 