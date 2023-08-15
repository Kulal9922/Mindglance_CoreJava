import java.io.*;
class BRtest
{
public static void main (String args[])throws Exception  
{ 
   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
   System.out.print("Enter name=");
   String s1=br.readLine(); // enter paryat line read karato
   System.out.println("Name="+s1);
 }
}