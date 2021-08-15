package duixiangjiaohu.display.led;

public class Display {
    private int value=0;
    private int limit=0;
    public static int step=1;
    public Display(int limit){
        this.limit=limit;
    }
    public Display(){

    }
    public void increase(){
        this.value++;
        if(this.value==this.limit){
            this.value=0;
        }
    }
    public int getValue(){
        return this.value;
    }
    public static void f(){
        System.out.println("我是Display的类变量f");
    }
    public static void main(String[] args) {
        Display d1=new Display(10);
        Display d2=new Display(20);
        d1.increase();
        System.out.println(d1.getValue());
        System.out.println(d2.getValue());
        System.out.println(d1.step);
        System.out.println(d2.step);
        d1.step=2;
        System.out.println(d1.step);
        System.out.println(d2.step);
        System.out.println(Display.step);
        Display.step=3;
        System.out.println(d1.step);
        System.out.println(d2.step);
        f();
        Display.f();
        d1.f();
        }
    }
