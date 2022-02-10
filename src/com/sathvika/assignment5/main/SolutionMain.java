package com.sathvika.assignment5.main;

import com.sathvika.assignment5.data.Solution;
import com.sathvika.assignment5.singleton.Singleton;


public class SolutionMain
{

        public static void main(String[] args)
        {
            Solution obj1=new Solution();
            obj1.getVariables(4,'s');
            obj1.getLocalVariables(10,20);
            Singleton obj=Singleton.getObject("sathvika");
            obj.printString();
        }
    }

