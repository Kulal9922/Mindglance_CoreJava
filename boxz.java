import java.util.*;
class Boxz
{
 
    int height,breadth,length;
    void get()  
   {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the height,breadth,length=");
  
         height=sc.nextInt();
         breadth=sc.nextInt();
         length=sc.nextInt();
    }
 

       int area()
          {
           int vol=height*breadth*length;
           return vol;
          }
 }


   class test
    {
      public static void main(String args[])
      {
       Boxz b1=new Boxz();
       b1.get();
       int v=b1.area();
       System.out.print("Volume="+v);
  }
}
   




   
  