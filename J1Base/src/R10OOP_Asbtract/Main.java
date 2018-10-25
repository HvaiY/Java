package R10OOP_Asbtract;

public class Main {
    public  static void main(String[] atgs){
        //抽象类  可以调用静态方法
      Person.speak2();
    //        抽象方法没有方法体，连空方法体都不能写；一旦类中定义了抽象方法，类必须被修饰为抽象；
    //        抽象类无法实例化(new)；
    //        抽象类可以没有抽象方法；
    //        抽象类的子类必须实现父类的所有抽象方法，除非子类也是抽象类
        Person p=new Chinese();
        p.setAge(15);
        p.run();
        p.speak();

    }
}
