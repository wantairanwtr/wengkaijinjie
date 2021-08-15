package Duixiangrongqi.notebook;
import java.util.ArrayList;
class Value{
    private int i;
    public void set(int i){
        this.i=i;
    }
    public int get(){
        return this.i;
    }
    public String toString(){
        return "我是value的实例对象";
    }
}
public class NoteBook {
    ArrayList<String> notes =new ArrayList<String>();
    public void add(String s){
        notes.add(s);
    }
    public void add(String s,int loc){
        notes.add(loc,s);
    }
    public  int getSize(){
        return notes.size();
    }
    public String getNote(int index){
        return notes.get(index);
    }
    public void removeNote(int index){
        notes.remove(index);
    }
    public String[] list(){
        String[] sz=new String[notes.size()];
        /*for(int i=0;i<notes.size();i++){
            sz[i]=notes.get(i);
        }*/
        notes.toArray(sz);
        return sz;
    }

    public static void main(String[] args) {
        NoteBook nb=new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("third",0);
        System.out.println(nb.getSize());
        for(int i=0;i<nb.getSize();i++){
            System.out.println(nb.getNote(i));
        }
        System.out.println("*****************************");
        nb.removeNote(1);
        String[] sz=nb.list();
        for(String i:sz){
            System.out.println(i);
        }
        System.out.println("*****************************");
        int[]a=new int[10];
        String[]s=new String[10];
        System.out.println(a[0]);
        System.out.println(s[0]);
        System.out.println("*****************************");
        Value[] v=new Value[10];
        ArrayList<Value> v1=new ArrayList<Value>();
        for(int i=0;i<v.length;i++){
            v[i]=new Value();
            v1.add(new Value());
            v[i].set(i);
            v1.get(i).set(i);
        }
        for(Value i:v){
            System.out.println(i.get());
            i.set(0);
        }
        for(Value i:v1){
            System.out.println("v1:"+i.get());
        }
        System.out.println("***********************");
        for(Value i:v){
            System.out.println(i.get());
        }
        System.out.println("***********************");
        ArrayList<String > s1=new ArrayList<String>();
        s1.add("first");
        s1.add("second");
        for(String i:s1){
            System.out.println(i);
        }
        Value ha=new Value();
        System.out.println(ha);
    }
}
