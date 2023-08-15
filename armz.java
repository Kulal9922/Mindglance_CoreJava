class armz
{
 public static void main(String args[])
  {
    int n=153;
    String s1=n+"";
    int digit=s1.length();
    int temp=n;
    int sum=0,rem=0;

 
    while(n>0)
     {
      rem=n%10;
      sum=sum+(int)Math.pow(rem,digit);
      n=n/10;
     }
      if(sum==temp)
        System.out.println("It is armstrong num="+temp);
      else
        System.out.println("It is not armstrong num="+temp);
  }
}