package R11OOP_Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");
        //接口只是约束或者说定义一些功能(需要实现他的类去实现)
        //类 单继承(抽象类也是) ，接口是可以多个实现的
        FlayFunction f = new Brid();
        f.flay();
        ((Brid) f).run();

        System.out.println("匿名 内部类");
        //匿名方法
        FlayFunction f2 = () -> System.out.println("匿名内部类  的飞"); //匿名方法
        f2.flay();
        //匿名内部类
        System.out.println("--------------------------");
        String s = "猪肉";
        EatFuction e = new EatFuction() {
            @Override
            public void eat() {
                System.out.println("小口吃");
            }

            @Override
            public void eat(String s) {
                System.out.println("吃" + s);
            }

            @Override
            public void bigEat() {
                System.out.println("大口吃");
            }
        };
        String str = "猪肉";
        e.eat();
        e.bigEat();
        e.eat(str);

        // equals 可以用来比较类的内容是否一致  由object 对象定义

        //查看Animal 就可以看到该类中toString和equals的实现
        Animal a=new Animal();
        a.setAge(18);
        a.setName("x小飞飞");
        System.out.println(a.toString());
        Animal b=new Animal();
        b.setAge(18);
        b.setName("x小飞飞");

        System.out.println(a.equals(b));
        System.out.println(a==b); //尽管两个对象内容相同，但是指向地址不同 ==  判定为false

        // static 静态的  静态的方法 字段 类  都是优先于对象存在的 程序启动时他们就有了 ，其它方法中可以直接使用他们 类名.方法名
//        static 成员直接可以通过类名调用，非 static 成员要通过对象调用；
//        static 成员中只能访问 static 成员，不能直接访问非 static 成员。
//        非 static 成员可以访问 static 成员

//        static
//        {
//            静态代码块在类第一次被使用的时候执行一次，在构造函数执行之前执行。一般用于对类进
//            行初始化，以后会用
//            只要一旦开始“接触一个类”，静态成员、static 代码块就会被执行
//        }
    }
}
