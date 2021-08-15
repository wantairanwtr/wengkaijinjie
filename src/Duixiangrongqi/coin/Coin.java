package Duixiangrongqi.coin;
import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    public HashMap<Integer,String> coinnames=new HashMap<Integer,String>();
    public Coin(){
        coinnames.put(1,"penny");
        coinnames.put(10,"dime");
        coinnames.put(25,"quarter");
        coinnames.put(50,"half-dolar");
        coinnames.put(50,"五毛");
        System.out.println("总数量为:"+coinnames.keySet().size());
        System.out.println(coinnames);
        for(Integer k:coinnames.keySet()){
            System.out.println(k+":"+coinnames.get(k));
        }
    }
    public String getName(int amount){
        if(coinnames.containsKey(amount)) {
            return coinnames.get(amount);
        }else{
            return "没找到";
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int amount;
        Coin c=new Coin();
        do{
            System.out.println("输入数字");
            amount=in.nextInt();
            System.out.println(c.getName(amount));
        }while(amount!=-1);
    }
}
