import java.lang.*;
import java.util.Scanner;
class FirstException extends Exception
{
    public FirstException(String name)
    {
        System.out.println(name+" is executed");
    }
}
class SecondException extends Exception
{
    public SecondException(String name)
    {
        System.out.println(name+" is executed");
    }
}
class ThirdException extends Exception
{
    public ThirdException(String name)
    {
        System.out.println(name+" is executed");
    }
}


class ThrowException
        {
            public void throwing(String expName)  throws Exception
        {
            if(expName.equals("FirstException"))
            {
                throw new FirstException("First Exception");
            }
            else if(expName.equals("SecondException"))
            {
                throw new SecondException("Second Exception");
            }
            else if (expName.equals("Third Exception"))
            {
                throw new ThirdException("Third Exception");
            }
            else
            {
                System.out.println("Please enter correct Exception");
            }

        }
        }
public class Assignment8
{
  public static void main(String[] args) throws Exception
  {
      System.out.println("Enter the Exception name you want to through");
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();

     ThrowException obj=new ThrowException();
     try
     {
         obj.throwing(str);
         throw new NullPointerException();
     }
     catch(FirstException | SecondException |ThirdException ex)
     {
         System.out.println("Exception caught "+ ex.getMessage());
     }
     finally
     {
         System.out.println("Finally clause executed even if null pointer Exception is thrown");
     }
  }
}
