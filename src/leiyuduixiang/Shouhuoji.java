package leiyuduixiang;

public class Shouhuoji {
    int price = 10;
    int balance=this.f();
    int total;
    Shouhuoji(){
        total=1000;
    }
    Shouhuoji(int price){
        this();
        this.price=price;
    }
    int f(){
        return 10;
    }
    void setPrice(int price){
        this.price=price;
    }
    void showPrompt() {
        System.out.println("欢迎");
    }

    void insertMoney(int amount) {
        balance += amount;
        this.showBalance();
    }

    void showBalance() {
        System.out.println("你的余额为" + this.balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("东西是那你的了");
            balance -= price;
            total += price;
        }
    }
    public static void main(String[] args) {
        Shouhuoji shj = new Shouhuoji();
        shj.showPrompt();
        shj.showBalance();
        shj.insertMoney(100);
        shj.getFood();
        shj.showBalance();
        System.out.println(shj.total);
        System.out.println("************************************");
        Shouhuoji shj2 = new Shouhuoji(500);
        System.out.println(shj2.price);
        shj2.insertMoney(200);
        shj.showBalance();
        shj2.showBalance();
        System.out.println(shj2.total);
    }
}
