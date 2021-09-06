package yichangchuli;
import java.util.Scanner;
public class ArrayIndex {
    public static void f(){
        int []a=new int[10];
        a[10]=10;
        System.out.println("这是f函数");
    }
    public static void g(){
        f();
        System.out.println("这是g函数");
    }
    public static void h(){
        int i=10;
        if(i<100){
            g();
        }
        System.out.println("这是h函数");
    }
    public static void k(){
        try{
            h();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("这是K函数");
            throw e;
        }
        System.out.println("k函数已经执行完了");
    }
    public static void main(String[] args) {
        int[]a=new int[10];
        Scanner in=new Scanner(System.in);
        int idx=in.nextInt();
        try{
            a[idx]=111;
            System.out.println(a[idx]+"hello");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        try{
            f();
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("做完了");
            System.out.println(e);
        }
        System.out.println("****************************");
        try{
            k();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("这里是调用了k函数的main主函数");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("main");
    }
}
