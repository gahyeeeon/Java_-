package ex33;


import java.util.ArrayList;

interface ISample<T>{
    public void addElement(T element);
    public T getElement(int index);
}

class SampleTest<T> implements ISample<T>{
    private ArrayList<T> arr;

    public SampleTest(){
        arr = new ArrayList<>();
    }

    @Override
    public void addElement(T element) {
        arr.add(element);
    }

    @Override
    public T getElement(int index) {
        return arr.get(index);
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        SampleTest<String> test = new SampleTest<>();
        test.addElement("Hello");
        test.addElement("World");
        System.out.println(test.getElement(0)+" "+test.getElement(1));
    }
}
