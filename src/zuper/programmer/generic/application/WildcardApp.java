package zuper.programmer.generic.application;

import zuper.programmer.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<String>("Wildcard"));
        print(new MyData<Integer>(13));
        print(new MyData<Boolean>(true));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        // Object o = myData.getData();
        System.out.println(myData.getData());
    }
}