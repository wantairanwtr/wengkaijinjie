package yichangchuli.yichangjizhi;
class CloseException extends OpenException{
    @Override
    public String toString(){
        return "我是Close异常";
    }
}
class OpenException extends Exception{

}
class NewException extends Exception{}
public class ArrayIndex{
    public ArrayIndex()throws OpenException{}
    public static int open(){
        int []a=new int[10];
        a[10]=10;
        return 1;
    }
    public static void readFile()throws OpenException,CloseException,Exception{
        if(open()==-1){
            throw new OpenException();
        }else if(open()==0){
            throw new Exception("默认异常");
        }else if(open()==1){
            throw new CloseException();
        }
    }
    public void f()throws OpenException{

    }
    public static void main(String[]args){
        try{
            readFile();
        }
        catch(CloseException e){
            System.out.println(e);
            System.out.println("Close");
        }catch(OpenException e){
            System.out.println(e);
            System.out.println("open ");
        }catch(Exception e){
            System.out.println(e);
            System.out.println("未知种类的默认异常");
        }
    }
}
class NewClass extends ArrayIndex{
    public NewClass()throws OpenException,NewException{}
    public void f()throws OpenException{}
    public static void main(String[]args){
        try{
            ArrayIndex a=new NewClass();
            a.f();
        }catch(OpenException e){
            System.out.println(e);
            System.out.println("open");
        }catch(Exception e){
            System.out.println("未知的默认异常");
        }
    }
}