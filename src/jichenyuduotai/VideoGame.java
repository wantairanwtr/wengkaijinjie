package jichenyuduotai;

public class VideoGame extends Item{
    private int players;
    public VideoGame(String title,int playingTime,boolean gotIt,String comment,int number){
        super(title,playingTime,gotIt,comment);
        this.players=number;
    }
    @Override
    public void print(){
        System.out.print("VideoGame:");
        super.print();
        System.out.println("-"+players);
    }

}
