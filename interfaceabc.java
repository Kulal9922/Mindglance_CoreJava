interface abc 
{
   void show();
   void fun();
 }
 class xyz implement abc
   {
    pulic void show()
    {
      System.out.print("In show");
    }

     public void fun()
      System.out.print("In fun");
    }
} 
    
    class test 
  {
     public static void main(String args[])
  {
      xyz obj =new xyz();
         obj.show();
         obj.show();
  }
}