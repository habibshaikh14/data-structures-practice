package sandbox.dummy.classes;

public class Product {
    private int releaseYear;
    private String name;
    private double price;

    public Product(int releaseYear, String name, double price) {
        this.releaseYear = releaseYear;
        this.name = name;
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "releaseYear=" + releaseYear + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
