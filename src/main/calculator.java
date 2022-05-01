package main;

public class calculator {
    private double a,b;

    public calculator(){
        this.a=0;
        this.b=0;
    }
    public  calculator(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double add(){
        return a+b;
    }
    public  double subs(){
        return a-b;
    }
    public  double multi(){
        return a*b;
    }
    public  double div(){
        return a/b;
    }
    public double mod(){
        return a%b;
    }
}
