class armnusingwhile
{
public static void main (String args[])
{  int num=11;
   while(num>0)
   {
   int z=0,number=5,q=0;
   for(int n=1;q<number;n++)    {
   String s1=n+"";   //define typing consting .... to string
   int digit=s1.length();  //define length
   int rem=0,sum=0,temp=n;
   while(n>0)
    {
    rem=n%10;
    sum=sum+(int)Math.pow(rem,digit);
    n=n/10;
    }
    if (sum==temp){
    System.out.println(temp);
    num--;     }
    n=temp;
    n++;
                                }
    }
                       
 }

}