package yichangchuli.liu;

import java.io.*;

public class WenJian2 {
    public static void main(String[] args) {
        System.out.println("hi");
        byte[] b=new byte[10];
        for(int i=0;i<b.length;i++){
            b[i]=(byte)i;
        }
        try{
            DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat")));
            int i=0xcafebabe;
            out.writeInt(i);
            out.close();
            DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            int j=in.readInt();
            System.out.println(j);
            in.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
