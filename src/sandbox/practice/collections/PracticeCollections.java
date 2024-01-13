package sandbox.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.out;

public class PracticeCollections {
    public static void main(String[] args) {
        out.println("This is to demonstrate all collection functions.");
        var arrayList = new ArrayList<String>(Arrays.asList("Breakfast", "Brunch", "Lunch", "Supper", "Dinner"));
        out.println(arrayList);
        out.println(Collections.max(arrayList));
        out.println(Collections.min(arrayList));
        Collections.reverse(arrayList);
        out.println(arrayList);
        out.println(Collections.binarySearch(arrayList, "Dinner"));
        Collections.sort(arrayList);
        out.println(arrayList);
        arrayList.sort(Collections.reverseOrder());
        out.println(arrayList);
        var students = new ArrayList<Student>(
                Arrays.asList(new Student("Habib"), new Student("Sorry-Worry"), new Student("Major")));
        students.forEach(student -> out.println(student.getName()));
        Collections.sort(students);
        students.forEach(student -> out.println(student.getName()));
    }
}

class Student implements Comparable<Student> {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student person) {
        return name.compareTo(person.name);

    }
}
