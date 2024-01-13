package sandbox.practice.collections;

import sandbox.practice.collections.dummy.Person;
import sandbox.practice.collections.dummy.Powers;

import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.System.out;

public class PracticeComparator {
    public static void main(String[] args) {
        var persons = new ArrayList<Person>();
        persons.add(new Person("Habib", Powers.INVISIBILITY, 23, false));
        persons.add(new Person("Shar", Powers.SPEECH, 23, true));
        persons.add(new Person("Morty", Powers.ELASTICITY, 230, true));
        persons.add(new Person("Archy", Powers.SPEED, 10, false));
        persons.add(new Person("Zeke", Powers.STRENGTH, -120, false));
        var cmp1 = Comparator.comparing(Person::getName);
        var cmp2 = Comparator.comparing(Person::getAge);
        var cmp3 = Comparator.comparing(Person::getPower);
        var cmp4 = Comparator.comparing(Person::getAlly);
        persons.sort(cmp1);
        out.println("::Sorted by Name::");
        persons.forEach(person -> out.println(person.toString()));
        persons.sort(cmp2);
        out.println("::Sorted by Age::");
        persons.forEach(person -> out.println(person.toString()));
        persons.sort(cmp3);
        out.println("::Sorted by Power::");
        persons.forEach(person -> out.println(person.toString()));
        persons.sort(cmp4);
        out.println("::Sorted by Sides::");
        persons.forEach(person -> out.println(person.toString()));
    }
}
