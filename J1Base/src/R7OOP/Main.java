package R7OOP;

import R7OOP.com.person.China; //引入包
import static java.lang.Math.pow; //静态引入包 不建议使用 可能会出现很多的冲突

public class Main {

	public static void main(String[] args) {
		// package 包 可以理解为一个文件夹
		// import 引入包
		// 包 作用 ： 作用相同的类放在同一个包下 便于分类管理
		// 重名的话 还可以放在不同的包下 解决冲突
		// 特殊的 包 java.lang 默认的包 不用再引用
		China p = new China();

		R7OOP.com.animal.Dog dog = new R7OOP.com.animal.Dog(); // 不同包重名的类使用

		Dog dog2 = new Dog();

		// 2的3次方
		// 静态引入包
		double d = pow(2, 3);
	}

}
