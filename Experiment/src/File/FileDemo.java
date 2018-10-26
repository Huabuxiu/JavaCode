package File;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\花不休\\Desktop\\mooc");
//        System.out.println(file.exists());
        if (!file.exists())
            file.mkdir();
        else
            file.delete();
    }
}
