package leiyuduixiang;

public class Fraction {
    private int a;
    private int b;
    Fraction(int a,int b){
        this.a=a;
        this.b=b;
        gongyue(a,b);
    }
    double toDouble(){
        return ((double)a)/b;
    }
    Fraction plus(Fraction r){
        Fraction m=new Fraction(a*r.b+r.a*b,b*r.b);
        return m;
    }
    Fraction multiply(Fraction r){
        Fraction m =new Fraction(a*r.a,b*r.b);
        return m;
    }
    private void gongyue(int j,int k){
        int s=0;
        for(int i=0;i<i+1;i++){
            s=j%k;
            if(s==0){
                break;
            }else{
                j=k;
                k=s;
            }
        }
        this.a/=k;
        this.b/=k;
    }
    void print(){
        if(a!=b) {
            System.out.printf("%d/%d\n",a,b);
        }else{
            System.out.println(1);
        }
    }
}
