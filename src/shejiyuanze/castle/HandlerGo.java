package shejiyuanze.castle;
public class HandlerGo extends Handler{
    public HandlerGo(Game game){
        super(game);
    }
    @Override
    public void doCmd(String value){
        super.game.goRoom(value);
    }
}
