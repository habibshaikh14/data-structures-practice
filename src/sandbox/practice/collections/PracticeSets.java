package sandbox.practice.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import static java.lang.System.out;

public class PracticeSets {
    public static void main(String[] args) {
        practiceHashSets();
        practiceLinkedHashSets();
        practiceTreeSets();
    }

    private static void practiceTreeSets() {
        var families = new TreeSet<>(Arrays.asList("Dad", "Mom", "Son", "Daughter", "GrandSon", "GrandDaughter"));
        out.println("\n\n Working with Tree Sets");
        out.println(families);
        out.println(families.floor("Dau"));
        out.println(families.ceiling("Grand"));
        out.println(families.headSet("Mom"));
        out.println(families.tailSet("Mom", true));
        out.println(families.pollFirst());
        out.println(families.pollLast());
        out.println(families.size());
    }

    private static void practiceHashSets() {
        var places = new HashSet<>(Arrays.asList("Paris", "New York", "London"));
        out.println("Working with Hash Sets");
        out.println("There is no order in sets an no duplicates too");
        places.forEach(out::println);
        out.println("This is MAP it matches and returns true or false of whatever you want");
        places.stream().map(place -> place.length() > 7).forEach(out::println);
        out.println("This is FIlTER it filters and creates new stream based on the match");
        places.stream().filter(place -> place.length() > 7).forEach(out::println);
        places.stream().sorted().forEach(out::println);
    }

    private static void practiceLinkedHashSets() {
        var shapes = new LinkedHashSet<>(Arrays.asList("Triangle", "Square", "Pentagon", "Hexagon"));
        out.println("\n\n Working with Linked Hash Sets");
        out.println("There is order in sets and no duplicates though");
        shapes.forEach(shape -> out.print(shape + " "));
        out.println("Bas that's it");
    }
}
