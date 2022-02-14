import java.io.*;
import java.util.*;

public class Assignment11 {
    public static  void main(String[] args) {

        try {
            File infile=new File("C:\\Users\\talakanti sathvika\\IdeaProjects\\JavaAssignments\\src\\Assign11.txt");
            BufferedReader br=new BufferedReader(new FileReader(infile));
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            int c;
            while((c = br.read()) != -1)
            {
                char character = (char) c;
                if (map.containsKey(character)){
                    map.put(character,map.get(character)+1);//if character is already presnt in map it will add +1
                }
                else{
                    map.put(character,1);
                }

            }
            PrintWriter pw=new PrintWriter("Assign11Solution");
            Set set=map.entrySet();
            Iterator itr=set.iterator();
            while(itr.hasNext()){
                //converting to Map.Entry so that we can get key and value separately
                Map.Entry entry=(Map.Entry)itr.next();
                System.out.println(entry.getKey()+" "+entry.getValue());
                pw.print(entry.getKey());
                pw.print(" ");
                pw.println(entry.getValue());
            }
            pw.close();
        }

        catch(IOException  e){
            System.out.println(e.getMessage());
        }
    }



}

