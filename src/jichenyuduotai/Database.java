package jichenyuduotai;

import java.util.ArrayList;

public class Database {
//    private ArrayList<CD> listCD=new ArrayList<CD>();
//    private ArrayList<DVD> listDVD=new ArrayList<DVD>();
    private ArrayList<Item> listItem=new ArrayList<Item>();
//    public void add(CD cd){
//        listCD.add(cd);
//    }
//    public void add(DVD dvd){
//        listDVD.add(dvd);
//    }
    public void add(Item item){
        listItem.add(item);
    }
    public void list(){
//        for(CD cd:listCD){
//            cd.print();
//        }
//        for(DVD dvd:listDVD){
//            dvd.print();
//        }
        for(Item item:listItem){
            item.print();
        }
    }

    public static void main(String[] args) {
        Database db=new Database();
        db.add(new CD("ABC","abc",4,60,"..."));
        db.add(new CD("DEF","def",4,60,"..."));
        db.add(new CD("GHI","ghi",4,60,"..."));
        db.add(new DVD("xxx","aaa",60,"..."));
        db.add(new VideoGame("ddd",10,true,"...",4));
        db.list();
        System.out.println("***********************************************************");
        Item a1=new Item("a",20,false,"...");
        DVD a2=new DVD("aaa","bbb",30,"...");
//        a1=a2;
//        System.out.println(a1);
//        DVD a3=(DVD)a1;
//        System.out.println(a3);
    }

}
