package zuper.programmer.generic.application;


import java.util.Arrays;

import zuper.programmer.generic.Person;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Umam", "Sumenep"),
            new Person("Nass", "Sumenep"),
            new Person("Sofa", "Sumenep")
        };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
