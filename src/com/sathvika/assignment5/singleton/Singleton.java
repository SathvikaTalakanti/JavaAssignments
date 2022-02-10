package com.sathvika.assignment5.singleton;

public class Singleton
{

        String singletonVar;
        public static Singleton getObject(String var)
        {
            Singleton obj=new Singleton();
            obj.singletonVar=var;
            return obj;
        }
        public void printString()
        {
            System.out.println("The string is "+singletonVar);
        }
    }


