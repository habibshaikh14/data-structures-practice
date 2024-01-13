package sandbox.practice.collections.dummy;

public class Person {
    private String name;
    private Powers power;
    private Integer age;
    private Boolean isAlly;

    public Person(String name, Powers power, Integer age, Boolean isAlly) {
        this.name = name;
        this.power = power;
        this.age = age;
        this.isAlly = isAlly;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", power=" + power + ", age=" + age + ", isAlly=" + isAlly + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Powers getPower() {
        return power;
    }

    public void setPower(Powers power) {
        this.power = power;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAlly() {
        return isAlly;
    }

    public void setAlly(Boolean ally) {
        isAlly = ally;
    }
}
