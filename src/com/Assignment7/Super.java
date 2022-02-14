package com.Assignment7;

class SuperClass
{
      static class SubClass1 {
          public SubClass1(String name) {
              System.out.println("Hello " + name);
          }
      }
  }
class SuperClass2
{

   static  class SubClass2 extends SuperClass.SubClass1 {
        public SubClass2(String name) {
            super(name);
        }

    }

}


