class C    //multi level inhiritens
{
  int x=10;
 }
 class B extends A
{
  int y=20;
 }
 class C extends B
{
   int z=30;
 } 
 class test
{
public static void main(String args[])
{
  C obj =new C();
  System.out.println(obj.x);
  System.out.println(obj.y);
    System.out.println(obj.z);
}
}