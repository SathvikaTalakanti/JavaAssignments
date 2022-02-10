import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;

import static java.lang.System.exit;

class PingHost
{
        public Long pingingHost(String hostId) throws IOException
        {
             Long startTime =System.currentTimeMillis();
            System.out.println( "start time is "+startTime);
            InetAddress hostName = InetAddress.getByName(hostId);
            System.out.println("Sending Ping Request to " + hostId);
            if (hostName.isReachable(5000)) {
                System.out.println("Host is reachable");
                    Long time = System.currentTimeMillis();
                    System.out.println("current time is "+time);
                    Long timeTaken = time - startTime;
                    System.out.println("time taken to reach host is " + timeTaken);
                System.out.println();
                    return timeTaken;
                }
            else
            {
                System.out.println("Sorry ! We can't reach to this host");
                exit(0);
                return Long.valueOf(-1);

            }
        }

}

public class Assignment3
{
  public static void main(String[] args)
  {
      ArrayList<Long> var=new ArrayList<>();
      PingHost obj=new PingHost();
      int count=0;
      try {
          while (count < 5) {
              Long num= obj.pingingHost("123.22.22.22");
              var.add(num);
              count++;
          }

          int check=var.size();
          if(check%2!=0)
          {
              int i=check/2;
              System.out.println("Median time is "+var.get(i));
          }
          else
          {
              int i=(check%2)+((check%2)+1)/2;
              System.out.println("Median time is "+var.get(i));
          }
      }
      catch(Exception e)
      {
          System.out.println("Exception caught "+e.getMessage());
      }
  }
}
