package zuper.programmer.generic.application;

import zuper.programmer.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Umam");
        // doIt(stringMyData); // ERROR
        // MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objecMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objecMyData; // ERROR

        // doInteger(objecMyData); // ERROR
    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }
    
    public static void doInteger(MyData<Integer> objectMyData) {
        // do nothing
    }
}
