import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;

public class file {
    public static void  main(String[] args) throws FileNotFoundException
    {

        File f = new File("C:\\Users\\花不休\\IdeaProjects\\hello\\src\\myfile.txt");
        Scanner in = null;
        try{
            in  = new Scanner(f);
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        PrintWriter out = new PrintWriter(new FileOutputStream(f));
        //out.write("this is a file.");
        String text = in.next();
        System.out.println(text);
        //out.close();
    }
}
