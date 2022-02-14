package com.Assignment6;
import java.util.*;
public class Vampire
{
    public static int checkDigits(long num)
    {
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count=count+1;
        }
        return count;
    }
    public static boolean checkTrailing(long num)
    {
        if(num%10==0)
            return true;
        else
            return false;
    }
    public static boolean checkOccurence(long a,long b)
    {
        String s1=String.valueOf(a);
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        String s2 = String.valueOf(b);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)) {
            return true;
        }
        else
            return false;
    }
    public static boolean checkVampire(long num) {
        int c = checkDigits(num);
        boolean bol = false;
        for (long i = (long) Math.pow(10, c / 2 - 1); i < (long) Math.pow(10, c / 2); i++) {
            //if no of digits are 6 then we run loop from 10^2 to 10^3-1 i.e from 100 to 999
            //bcz no of digits for the factors  shld be half of the no of digits of the number
            if(num% i==0)
            {
                long j=num/i; // finding other factor
                if(j>=(long)Math.pow(10,c/2-1) && j<=(long)Math.pow(10,c/2))
                // Checking if no of digits are half of the no of digits of the num
                {
                 if(!(checkTrailing(i) && checkTrailing(j)))
                    {
                        bol=checkOccurence(num,(i*(long)Math.pow(10,c/2))+j);
                        // checking if both the digits are same or not
                        //1260 factors are 21 and 60; 21*10^2+60=2160
                        if(bol)
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
       int num=100;
        System.out.println("First 100 vampire numbers are");
        int count=0;
        long i=1;
        while(count<100)
        {
            int digits=checkDigits(i);
            if(digits%2==0)
            {
                if(checkVampire(i))
                {
                    System.out.println(i);
                    count++;
                }
            }
            i=i+1;
        }

    }
}
