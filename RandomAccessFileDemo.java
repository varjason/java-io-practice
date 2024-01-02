import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        //create a new file
        String s = "C:/Users/xiaofeng/java-io-practice/test.txt";
        try {
            writeToFile(s, "Hello World");
            String content = readFromFle(s);
            System.out.println("content of file is : " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }   
    
    }

    //write file function
    public static void writeToFile(String filePath,String content) throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            //move the pointer to the last of the file 
            randomAccessFile.seek(randomAccessFile.length());
            //write something inside
            randomAccessFile.writeUTF(content);
        }
    }

    //read file function
    public static String readFromFle(String filePath) throws IOException{
        StringBuilder content = new StringBuilder();
        try(        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath,"r");)
        {
            randomAccessFile.seek(0);
            content.append(randomAccessFile.readUTF());
        }
        return content.toString();
    }
}
