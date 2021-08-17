package jichenyuduotai;

public class CD extends Item{
    private String artist;
    private int numofTracks;
    public CD(String title,String artist,int numofTracks,int playingTime,String comment){
        super(title,playingTime,false,comment);
        this.artist=artist;
        this.numofTracks=numofTracks;
    }
    public void print(){
        System.out.print("CD:");
        super.print();
        System.out.println("-"+artist);
    }
    @Override
    public String toString(){
        return "CD的artist是"+artist+",numofTracks是"+numofTracks+",toString是"+super.toString();
    }
//    @Override
    public boolean equals(Object obj,int i){
        CD cc=(CD)obj;
        System.out.println("我是子类CD中的equals"+i);
        return artist.equals(cc.artist);
    }
public static void main(String[] args) {
    CD cd=new CD("a","b",2,2,"...");
    cd.print();
    String s="aa"+cd;
    System.out.println(cd);
    System.out.println(s);
    CD cd1=new CD("a","b",2,2,"...");
    CD cd2=new CD("a","b",2,2,"...");
    System.out.println(cd1.equals(cd2,66));
}
}
