package shejiyuanze.castle;
public class Handler {
    protected Game game;
    public Handler(Game game){
        this.game=game;
    }
    public Handler(){}
    public void doCmd(String value){
        System.out.println("父类doCmd方法");
    }
    public boolean isBye(){
        System.out.println("父类isBye方法");
        return false;
    }
}
