package zuper.programmer.generic.application;

import zuper.programmer.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        /**
         * Type Ereasur adalah menghilangkan data type pada suatu class atau method contoh:
         * sebelum 
         * MyData<String> myData = new MyData<String>("Tests");
         * menjadi
         * MyData myData = new MyData("Tests");
         */
        MyData myData = new MyData("Tests");
        
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
