package yichangchuli.liu;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WenJian3 {
    public static void main(String[] args) {
        System.out.println("hi");
        byte[] b=new byte[10];
        for(int i=0;i<b.length;i++){
            b[i]=(byte)i;
        }
        try{
            PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.csv"))));
            int i=0xcafebabe;
            String s="wan,tai,ran";
            out.println(s);
            out.close();
            String name="a.csv";
            BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream(name)));
            String line;
            while((line=in.readLine())!=null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
