import java.util.*;
import java.io.*;
class filewrite
{
 public static void main(String args[])throws Exception
{
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter file name=");
 String dname = sc.nextLine();
 System.out.println("Enter data=");
 String info = sc.nextLine();
 FileOutputStream fout = new FileOutputStream(dname);
 for(int i=0;i<info.length();i++)
  {
    fout.write(info.charAt(i));
  }
   fout.close();
 }
}