import java.util.*;
class digitopertion extends Thread
  {
   int id, no;
   public void run()
   {
     if (id==0)
      {
        String s1= no + "";
        System.out.println("Total digit= "+s1.length());
        }
        else
          if(id==1)
          {  int b1=no;
             int add=0;
             while(b1>0)
               { 
                   add=add+b1%10;
                   b1=b1/10;
               }
                 System.out.println("Add="+add);
              }
               else
                  if (id==2)
                  { String s1= no + "";
                    StringBuffer sb= new StringBuffer(s1);
                    System.out.println("Reverse"+sb.reverse());
                 }
                else
                   if(id==3)
                    {
                   String s1= no+"" ;
                   char ch []=s1.toCharArray();
                   Arrays.sort(ch);
                   String s2= new String (ch);
                   System.out.println("Sort="+s2);
             }
}

}
           