package com.Assignment7;

class SubClass implements NewInterface
{


    public void methodOne()
    {
        System.out.println("Method one");
    }

    @Override
    public void methodTwo()
    {
        System.out.println("Method two");
    }

    @Override
    public void methodThree()
    {
        System.out.println("Method three");
    }

    @Override
    public void methodFour() {
        System.out.println("Method four");
    }

    @Override
    public void methodFive()
    {
        System.out.println("Method five");
    }

    @Override
    public void methodSix()
    {
        System.out.println("Method six");
    }

    @Override
    public void newMethod() {
        System.out.println("New method");
    }

public void takeFirstInterface(FirstInterface firstInterface)
{
  firstInterface.methodOne();
  firstInterface.methodTwo();
}
public void takeSecondInterface(SecondInterface secondInterface)
{
 secondInterface.methodThree();
 secondInterface.methodFour();

}
public void takeThirdInterface(ThirdInterface thirdInterface)
{
  thirdInterface.methodFive();
  thirdInterface.methodSix();
}
public void takeNewInterface(NewInterface newInterface)
{
 newInterface.newMethod();
}
}
 public class Demo
{
    public static void main(String[] main)
    {
      SubClass obj=new SubClass();
      obj.takeFirstInterface(obj);
      obj.takeSecondInterface(obj);
      obj.takeThirdInterface(obj);
      obj.takeNewInterface(obj);
    }
}


