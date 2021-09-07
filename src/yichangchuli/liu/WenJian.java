package yichangchuli.liu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WenJian {
    public static void main(String[] args) {
        System.out.println("hi");
        byte [] buffer=new byte[10];
        byte [] b=new byte[10];
        for(int i=0;i<buffer.length;i++){
            buffer[i]=(byte)i;
        }
        try {
            FileOutputStream out = new FileOutputStream("a.dat");
            out.write(buffer);
            out.close();
            FileInputStream in =new FileInputStream("a.txt");
            System.out.println("读取前:");
            for(byte k:b){
                System.out.println(k);
            }
            in.read(b,0,9);
            System.out.println("读取后:");
           for(byte k:b){
               System.out.println(k);
           }
           in.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
