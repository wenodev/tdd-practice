package main.generic;

import java.util.List;

public class DemoClass <T> {

    private T t;

    public DemoClass(T t){
        this.t = t;
    }

    public T getVar() {
        return t;
    }

    public <T extends Number> void print(List<T> list){
        System.out.println(list);
    }

    public void printWithWildCard(List<? extends Number> list){
        System.out.println(list);
    }


}
