package R11OOP_Interface;

public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + this.name + "," + this.age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal)) return false;
        Animal a = (Animal) o;
        return a.age == this.age && a.name.equals(this.name);
    }
}
