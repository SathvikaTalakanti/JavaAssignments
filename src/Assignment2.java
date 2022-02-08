import java.util.*;
public class Assignment2 {
    public static void  checkString(String str)
    {
        if(	str.matches("[a-zA-Z]{26}"))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        checkString(str);
    }
}
