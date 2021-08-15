package Duixiangrongqi.jiherongqi;
import java.util.ArrayList;
import java.util.HashSet;
public class Jiherongqi {
    public static void main(String[] args) {
        ArrayList<String> s1=new ArrayList<String>();
        s1.add("first");
        s1.add("second");
        s1.add("first");
        System.out.println(s1);
        System.out.println("--------------------------");
        HashSet<String> s=new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
//        for(String i:s){
//            System.out.println(i);
//        }
        System.out.println(s);
    }
}
