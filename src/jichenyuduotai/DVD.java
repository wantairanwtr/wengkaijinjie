package jichenyuduotai;

public class DVD extends Item{
    private String director;
    public DVD(String title,String director,int playingTime,String comment){
        super(title,playingTime,false,comment);
        this.director=director;
    }
    public void print(){
        System.out.print("DVD:");
        super.print();
        System.out.println("-"+director);
    }

    public static void main(String[] args) {
        DVD dvd=new DVD("a","b",1,"...");
        dvd.print();
    }
}
