import java.util.*;
class Boxmax
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
  
