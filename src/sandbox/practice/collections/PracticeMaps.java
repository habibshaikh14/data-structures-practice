package sandbox.practice.collections;

import sandbox.practice.collections.dummy.Levels;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class PracticeMaps {
    public static void main(String[] args) {
        workingWithHashMaps();
        workingWithLinkedHashMaps();
        workingWithTreeMaps();
        workingWithEnumMaps();
    }

    private static void workingWithEnumMaps() {
        out.println("\n Working with ENUM maps");
        var enumMap = new EnumMap<Levels, String>(Levels.class);
        enumMap.put(Levels.HOTFIX, "Border Disputes");
        enumMap.put(Levels.MAJOR, "Global Warming");
        enumMap.put(Levels.COMMON, "Racism");
        enumMap.put(Levels.HIGH, "Poverty");
        enumMap.put(Levels.TOP, "Innovation");
        enumMap.put(Levels.AVERAGE, "Prosperity");
        enumMap.put(Levels.LOW, "Happiness");
        enumMap.put(Levels.MINOR, "Obesity");
        out.println(enumMap);
        out.println(enumMap.keySet());
        out.println(enumMap.containsValue("Social Injustice"));
        out.println(enumMap.containsKey(Levels.MINOR));
    }

    private static void workingWithTreeMaps() {
        out.println("\n Working with tree maps.");
        var treeMap = new TreeMap<Double, String>();
        treeMap.put(3.14, "Pi");
        treeMap.put(9.8, "g");
        treeMap.put(2.3, "ln");
        treeMap.put(2.72, "e");
        treeMap.put(6.626, "h");
        treeMap.put(6.022, "A");
        out.println("Tree Map is sorted.");
        out.println(treeMap);
        out.println(treeMap.ceilingEntry(3.1));
        out.println(treeMap.floorEntry(2.5));
        out.println(treeMap.descendingMap());
        out.println(treeMap.firstEntry());
        out.println(treeMap.lastEntry());
    }

    private static void workingWithLinkedHashMaps() {
        out.println("\n Working with linked hash maps.");
        var linkedHashMap = new LinkedHashMap<String, Integer>();
        linkedHashMap.put("Mercury", 8);
        linkedHashMap.put("Venus", 7);
        linkedHashMap.put("Earth", 5);
        linkedHashMap.put("Mars", 6);
        linkedHashMap.put("Jupiter", 1);
        linkedHashMap.put("Saturn", 2);
        linkedHashMap.put("Uranus", 4);
        linkedHashMap.put("Neptune", 3);
        out.println("::Linked hash map maintains insertion order::");
        out.println(linkedHashMap);
        linkedHashMap.computeIfAbsent("Pluto", k -> getSize());
        linkedHashMap.computeIfPresent("Earth", (k, v) -> v + 100);
        out.println(linkedHashMap.keySet());
        out.println(linkedHashMap.values());
        linkedHashMap.replaceAll((k, v) -> v * 10);
        out.println(linkedHashMap);
    }

    private static Integer getSize() {
        for (var i = 0; i < 10; i++) {
            if (i == 9) {
                return (i + 1);
            }
        }
        return 10;
    }

    private static void workingWithHashMaps() {
        out.println("Working with hash maps.");
        var hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Mumbai");
        hashMap.put(2, "Delhi");
        hashMap.put(3, "Calcutta");
        hashMap.put(4, "Chennai");
        hashMap.putIfAbsent(1, "Pune");
        hashMap.putIfAbsent(5, "Mumbai");
        out.println(hashMap);
        out.println(hashMap.entrySet());
        out.println(hashMap.get(1));
        out.println(hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList()));
    }
}
