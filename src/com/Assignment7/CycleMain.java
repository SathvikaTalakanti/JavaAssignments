package com.Assignment7;
class Cycle
{
}
class UniCycle extends Cycle
{
    public void balance()
{
    System.out.println("UniCycle is balanced by only one wheel");
}
}
class BiCycle extends Cycle
{
    public void balance()
    {
        System.out.println("BiCycle is balanced by two wheels");
    }
}
class TriCycle extends Cycle
{

}
public class CycleMain
{
   public static void main(String[] args)
   {
       Cycle[] arr= new Cycle[3];
       arr[0]=new UniCycle();//upcast
       arr[1]=new BiCycle();
       arr[2]=new TriCycle();

       UniCycle obj=(UniCycle) arr[0];//downcast
       obj.balance();
       BiCycle bobj=(BiCycle) arr[1];
       bobj.balance();
       TriCycle tobj=(TriCycle) arr[2];
   }
}
