package R10OOP_Asbtract;

// 抽象类无法实例化 只能子非抽象子类才可实例化
public abstract class Person {

    //公共方法
    void speak() {
        System.out.println("人类的话语我都会");
    }

    static void speak2() {
        System.out.println("人类的话语我都会的 ——静态");
    }

    //公共字段  建议public  不然外界访问不到
    private int age = 18;

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //抽象方法
    public abstract void run();
}
