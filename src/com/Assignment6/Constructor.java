package com.Assignment6;

import java.util.concurrent.Callable;

class ConstructorExample
{
    String name;
    int age;
  public ConstructorExample(String name)
  {
    this.name=name;
      System.out.println("name is "+name);
      new ConstructorExample(20);
  }
  public ConstructorExample(int age)
  {
    this.age=age;
      System.out.println("age is "+age);
  }
}
public class Constructor
{
    public static void main(String[] args)
    {
          ConstructorExample obj=new ConstructorExample("Sathvika");
           ConstructorExample obj1=new ConstructorExample(25);
        ConstructorExample[] strings =new ConstructorExample[2];
        strings[1]=obj1;
    }
}



