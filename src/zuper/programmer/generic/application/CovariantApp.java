package zuper.programmer.generic.application;

import zuper.programmer.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Umam");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

        // myData.setData("Exemple"); //ERROR
    }
}
