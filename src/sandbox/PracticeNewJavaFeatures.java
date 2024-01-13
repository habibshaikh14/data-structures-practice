package sandbox;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import sandbox.dummy.classes.Product;

interface Adder {
    int add(int a, int b);
}

interface Divider {
    double divide(double a, double b);
}

public class PracticeNewJavaFeatures {
    public static void main(String[] args) {
        workingWithLambda();
        workingWithStream();
    }

    private static void workingWithStream() {
        var productList = new ArrayList<>(Arrays.asList(new Product(2020, "HP Omen 15", 73995.55),
                new Product(2019, "Dell G3", 71995.55), new Product(2021, "MSI G17", 89995.99),
                new Product(2020, "Asus G14", 79999.99), new Product(2021, "Lenovo E3", 76995.95)));
        out.println("\nThis is cheap product list.");
        productList.stream().filter(product -> product.getPrice() < 75000).map(Product::getName).toList()
                .forEach(out::println);
        out.println("\nThis is old products list.");
        productList.stream().filter(product -> product.getReleaseYear() <= 2020).map(Product::getName).toList()
                .forEach(out::println);
    }

    private static void workingWithLambda() {
        Adder adder = Integer::sum;
        Divider divider = (a, b) -> {
            if (b <= 0) {
                out.println("Sorry cannot divide by zero for " + a + " / " + b + " returning 0.");
                return 0;
            } else {
                return a / b;
            }
        };
        out.println(adder.add(12, 550));
        out.println(divider.divide(121, 0));
        out.println(divider.divide(121, 10));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.stream().distinct().sorted(Collections.reverseOrder()).toList().forEach(out::println);
    }
}
