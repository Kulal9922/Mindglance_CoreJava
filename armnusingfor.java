class armnusingfor
{
public static void main (String args[])
{  int number=20,q=0;
   for(int z=1;q<number;z++)    {
   int n=z,temp=n;
   String s1=n+"";   //typecasting .... to string
   int digit=s1.length();  //define length
   int rem=0,sum=0;
   while(n>0)
    {
    rem=n%10;
    sum=sum+(int)Math.pow(rem,digit);
    n=n/10;
    }
    if (sum==temp){
    System.out.println(temp);
    q++;          }
                                }
                       
 }

}