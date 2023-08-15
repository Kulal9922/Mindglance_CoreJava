class arms
{
public static void main (String args[])
{
       int n= 370;
       String s1=n+"";
       int digit =s1.length();
       int rem=0,sum=0,temp=n;
       while(n>0)
       {
       rem=n%10;
       sum=sum+(int)Math.pow(rem,digit);
       n=n/10;
       }
       if (sum==temp)
        System.out.print("arm");
       else
        System.out.print("not arm");
      }
  }
       
       
       