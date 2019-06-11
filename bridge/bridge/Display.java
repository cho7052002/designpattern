package bridge;

//기능 클래스
//구현을 어떻게 사용해 기능할 것인가
public abstract class Display {
    private DisplayImpl impl;   //Display(기능) 과 DisplayImpl(구현) 을 잇는 bridge

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    //상속한 클래스에서 DisplayImpl을 가져와 사용함
    protected DisplayImpl getImpl(){
        return impl;
    }

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display(){
        open();
        print();
        close();
    }
}
