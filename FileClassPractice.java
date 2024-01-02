import java.io.File;
import java.io.IOException;

public class FileClassPractice{
    public static void main(String[] args) {
        //create a new file 
        // String path = "C:\\Users\\xiaofeng\\java-io-practice\\IOClassPractice.java";
        // File f = new File(path);
        // try {
        //     if (f.createNewFile()) {
        //         System.out.println("File created: " + f.getName());
        //       } else {
        //         System.out.println("File already exists.");
        //       }
        // } catch (IOException e) {
            // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        //get some file details here 
        // System.out.println("Absolute path " + f.getAbsolutePath());
        // System.out.println("File path " + f.getPath());
        // System.out.println("File path " + f.getName());
        // System.out.println("File path " + f.length() + " byte");

        //delete file
        // if (f.delete()) {
        //     System.out.println("delete success " + f.getAbsolutePath());
        // }else{
        //     System.out.println("delete failed " + f.getAbsolutePath());
        // }

        //create dir
        // File dir = new File("C:\\Users\\xiaofeng\\java-io-practice");
        // if (dir.mkdir()) {
        //     System.out.println("create success");
        // }else{
        //     System.out.println("create failed");
        // }

        //delete dir
        // if (dir.delete()) {
        //     System.out.println("delete success " + dir.getAbsolutePath());       
        // }else{
        //     System.out.println("delete failed " + dir.getAbsolutePath());
        // }

        //show all document name under dir 
        // File directory = new File("C:\\Users\\xiaofeng\\java-io-practice");
        // String[]files = directory.list();
        // for (String string : files) {
        //     System.out.println(string);
        // }       
        File ff = new File("C:\\Users\\xiaofeng\\Desktop\\oopdemo");
        traverseDir(ff);
    }

    //A traverse directory function here 
    public static void traverseDir(File dir){
        File[]filesAndDir = dir.listFiles();

        //traverse all doc and dir
        for (File file : filesAndDir) {
            if (file.isFile()) {
                System.out.println("doc name : " + file.getName() + "\n" + file.length());
            }else if (file.isDirectory()) {
                System.out.println("dir name : " + file.getName());
                traverseDir(dir);
            }
        }
    }
}