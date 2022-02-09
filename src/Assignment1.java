import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;
import java.io.*;

import static java.lang.System.exit;
import static java.lang.System.setOut;

class FilesFun {

    public void search() {
        //Scanner is used to read input
        Scanner sc = new Scanner(System.in);
        //Creates a new File instance by converting the given pathname string into an abstract pathname
        File file = new File("C:\\Users\\Public\\JavaFiles");
        try {
            do {
                int count = 0;//initilaizing count to 0
                System.out.println("Enter file Name... If you want to exit press exit ");
                String fileName = sc.nextLine();//nextLine is used to take string input
                if (fileName.equals("exit")) {
                    exit(0);// If user press exit it will exit the program
                }


                String filelis[] = file.list();//file.list will lists the files present in the directory
                for (String var : filelis) {
                    if (fileName.equals(var))//if input matches with the any one of the files present  in directory it will enter inside if
                    {
                        System.out.println("File Found");
                        System.out.println("And Absolute Path of the file is " + file.getAbsolutePath());//prints its path
                        System.out.println();
                        count++;

                    }

                }
                if (count == 0)//if input not match with none of the files it will print file not found
                {
                    System.out.println("File Not Found ");
                    System.out.println();
                }

            } while (true);
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception occured" + e.getMessage());
        }


    }
}

class Assignment1
{
    public static void main(String[] args)
    {
        FilesFun obj=new FilesFun();
        obj.search();

    }
}

