package test02;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Test {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
         
        try {
            in = new FileInputStream("Koala.jpg");
            out = new FileOutputStream("Bang.jpg");
 
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
            System.out.println("복사 완료");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}