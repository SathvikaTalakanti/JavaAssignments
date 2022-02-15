import java.util.*;
public class Assignment4
{
  public static void date(Calendar startingDate,Calendar endingDate)
  {
      System.out.print(startingDate.get(Calendar.DATE)+"-"+startingDate.get(Calendar.MONTH)+"-"+startingDate.get(Calendar.YEAR)+" ");
      System.out.println(endingDate.get(Calendar.DATE)+"-"+endingDate.get(Calendar.MONTH)+"-"+endingDate.get(Calendar.YEAR)+" ");

  }

    public static void  range()
 {
   Scanner sc=new Scanner(System.in);
     System.out.println("Enter number of test cases");
     int input=Integer.parseInt(sc.nextLine());
     System.out.println("Enter signup and current dates");
   while(input>=0)
   {
       String[] givenDates=sc.nextLine().split(" ");
       String[] signUpDates=givenDates[0].split("-");
       String[] presentDates=givenDates[1].split("-");
       System.out.println();
       Calendar signedDate= Calendar.getInstance();
       Calendar currentDate=Calendar.getInstance();
       signedDate.set(Integer.parseInt(signUpDates[2]),Integer.parseInt(signUpDates[1]),Integer.parseInt(signUpDates[0]));
       currentDate.set(Integer.parseInt(presentDates[2]),Integer.parseInt(presentDates[1]),Integer.parseInt(presentDates[0]));
       Calendar start= Calendar.getInstance();
       Calendar end=Calendar.getInstance();
       start.add(Calendar.DATE,-30);
       end.add(Calendar.DATE,30);
       start.set(Calendar.YEAR,currentDate.get(Calendar.YEAR));
       end.set(Calendar.YEAR,currentDate.get(Calendar.YEAR));
       if(signedDate.get(Calendar.YEAR)>=currentDate.get(Calendar.YEAR) || start.after(currentDate)) {
           System.out.println("No range");
       }
       else if(end.after(currentDate)) {
           end = currentDate;
           date(start,end);
       }
       else
       {
           date(start,end);
       }

       input--;
   }
 }
 public static void main(String[] args)
 {
     range();
 }

}
