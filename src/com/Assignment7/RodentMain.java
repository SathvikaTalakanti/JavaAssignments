package com.Assignment7;
class Rodent
{
    public Rodent()
    {
        System.out.println("Inside Rodent class");
    }
    public void colour()
    {
        System.out.println("Most of the Rodents are black in colour");
    }
}
class Mouse extends Rodent
{
     public Mouse()
     {
         System.out.println("Inside Mouse class");
     }
     public void colour()
    {
        System.out.println("colour of mouse is black");
    }

}
class Gerbil extends Rodent
{
    public Gerbil()
    {
        System.out.println("Inside Gerbil class");
    }
    public void colour()
    {
        System.out.println("colour of Gerbil is grey");
    }
}
class Hamster extends Rodent
{
    public Hamster()
    {
        System.out.println("Inside Hamster class");
    }
    public void colour()
    {
        System.out.println("colour of Hamster is white");
    }
}
public class RodentMain
{
 public static void main(String[] args)
 {
     Rodent[] arr=new Rodent[3];
      arr[0]=new Mouse();
      arr[0].colour();
     System.out.println();
      arr[1]=new Gerbil();
      arr[1].colour();
     System.out.println();
      arr[2]=new Hamster();
      arr[2].colour();

 }
}
