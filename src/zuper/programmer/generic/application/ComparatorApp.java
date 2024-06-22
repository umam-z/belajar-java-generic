package zuper.programmer.generic.application;

import java.util.Arrays;
import java.util.Comparator;

import zuper.programmer.generic.Person;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Umam", "Sumenep"),
            new Person("Nass", "Sumenep"),
            new Person("Sofa", "Sumenep")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }  
        };

        Arrays.sort(persons, comparator);
        System.out.println(Arrays.toString(persons));
    }
}
