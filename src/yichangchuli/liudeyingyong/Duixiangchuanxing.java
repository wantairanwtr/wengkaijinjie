package yichangchuli.liudeyingyong;

import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private int grade;
    public Student(String name,int age,int grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public String toString(){
        return name+" "+age+" "+grade;
    }
}
public class Duixiangchuanxing {
    public static void main(String[] args) {
        try{
            Student s1=new Student("john",18,5);
            System.out.println("s1:"+s1);
            ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("obj.dat"));
            out.writeObject(s1);
            out.close();
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("obj.dat"));
            Student s2;
            s2=(Student)in.readObject();
            System.out.println("s2"+s2);
            in.close();
            System.out.println(s1==s2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
