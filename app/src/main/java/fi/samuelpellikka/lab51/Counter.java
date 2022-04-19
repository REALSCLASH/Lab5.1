package fi.samuelpellikka.lab51;

public class Counter {
    private int minimum;
    private int maximum;
    private int start;
    private int step;


    public Counter(){
        minimum = -100;
        maximum = 100;
        start = 0;
        step = 1;


    }


    public Counter(int min, int max, int start, int step){
        this.minimum = min;
        this.maximum = max;
        this.start = start;
        this.step = step;
    }

    public int getCounter(){
        return start;
    }

    public void resetCounter() {
        start = 0;
    }

    public void minusCounter() {
        int check = start-step;
        if(check < minimum){return;}
        start -= step;
    }

    public void addCounter() {
        int check = start + step;
        if(check > maximum){return;}
        start += step;
    }
}