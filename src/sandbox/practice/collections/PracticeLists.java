package sandbox.practice.collections;

import sandbox.practice.collections.dummy.Person;
import sandbox.practice.collections.dummy.Powers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

import static java.lang.System.out;

public class PracticeLists {
    public static void main(String[] args) {
        testingNewBoobs();
        testingArrayList();
    }

    private static void testingNewBoobs() {
        out.println("The many type of boobies :P");
        var boobs = new LinkedList<>(Arrays.asList("Large", "Small", "Medium", "Firm", "Perfect", "Soft", "Round"));
        out.print(boobs);
        boobs.set(boobs.size() / 2, boobs.pollFirst());
        out.println("\nThis is a forged data:");
        boobs.forEach(boob -> out.print(boob + " "));
        out.println("\nSorting it out");
        boobs.stream().sorted().forEach(boob -> out.print(boob + " "));
        out.println("\nPlaying with boobs");
        boobs.stream().filter(boob -> Stream.of("Perfect", "Round", "Soft").anyMatch(boob::equalsIgnoreCase))
                .forEach(boob -> out.print(boob + " "));
        out.println("\nNothing can be perfect :)\n");
    }

    private static void testingArrayList() {
        var names = new ArrayList<>(Arrays.asList("Habib5", "Habib2", "Habib3", "Habib4"));
        out.println(names);

        var persons = new ArrayList<Person>();
        persons.add(new Person("Habib", Powers.SPEED, 24, false));
        persons.add(new Person("Andy", Powers.INVISIBILITY, 10, true));
        persons.add(new Person("Sam", Powers.SPEECH, 19, false));
        persons.add(new Person("Rudy", Powers.ELASTICITY, 30, true));
        persons.stream().filter(person -> person.getAge() > 20).map(Person::getName).forEach(out::println);
        persons.forEach(person -> out.println(person.getName()));
        persons.stream().map(Person::getName).filter(name -> name.length() >= 4).forEach(out::println);
    }
}
