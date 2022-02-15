import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
public class Assignment9
{
    public static void checkingString(String str)
    {
        if(str.matches("[A-Z]+[a-zA-Z0-9]*[0-9]+"))
        {
            System.out.println("String matches");
        }
        else
        {
            System.out.println("String doesn't matches");
        }

    }
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     String str;
     System.out.println("Enter a string");
     str=sc.nextLine();
     checkingString(str);
 }

}
//added comment to assignment 9 and modified