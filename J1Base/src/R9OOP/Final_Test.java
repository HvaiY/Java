package R9OOP;

public class Final_Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // final 关键字
        // final 可以修饰方法 变量 和类
        // 1，被final修饰的方法不能被重写（Override）
        // 2,被final 修饰的变量只能第一次赋值，后面不可变更
        // 3,被final修饰的类 不能被继承 也就是没有子类了
        // 4,String就是被final 修饰的一个类
        // 可以通过Ctrl+Shift+T 查找类源码查看
        final int a = 8;
        // a=10;不可在赋值
    }

}

final class Person {

}
//无法继承
//class Chinese extends Person{
//	
//}

class Animal {
    final public void say() {
        System.out.println("hello");
    }
}

class Dog extends Animal {
//	public void say() {
//		// 继承过来的方法无法被重写
//
//	}
}