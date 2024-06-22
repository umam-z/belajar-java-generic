package zuper.programmer.generic.application;

import zuper.programmer.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String,Integer>("Umam", 100);
        Pair<Integer, String> pair2 = new Pair<Integer,String>(200, "Muhammad");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
