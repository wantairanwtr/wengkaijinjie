package duixiangjiaohu;

import duixiangjiaohu.display.led.Display;

public class Clock {
    private Display hour=new Display(24);
    private Display minute=new Display(60);
    public void start(int n) {
        for (int i=0;i<n;i++) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());

        }
    }
    public static void main(String[] args) {
        Clock c=new Clock();
        c.start(1200);
        Display.f();
        System.out.println(Display.step);
    }
}
