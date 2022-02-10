package com.sathvika.assignment5.data;

public class Solution
{

        int intVar;
        char charVar;
        public void getVariables(int intVar,char charVar)
        {
            this.intVar=intVar;
            this.charVar=charVar;
            System.out.println("Integer Variable is "+intVar+" character Variable is "+charVar);
        }
        public void getLocalVariables(int a,int b)
        {
            int var1=a;
            int var2=b;
            System.out.println("Value of variable1 is "+var1+" Value of Variable2 is "+var2);
        }

}
