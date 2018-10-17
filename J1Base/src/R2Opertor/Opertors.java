package R2Opertor;

public class Opertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 算数运算符
		// + 加或正值
		// - 减或负值
		// * 乘
		// / 除
		// % 取余
		int a = 10;
		int b = 20;
		System.out.println(a + b); // 变量相加
		System.out.println(a + 1); // 变量与常量相加
		System.out.println(1 + 1); // 字面量与字面量相加
		System.out.println(+a);
		System.out.println(+100);

		int c1, c2, c3;
		c1 = 10;
		c2 = 3;
		c3 = 0;
		System.out.println(c1 - c2);// 7
		System.out.println(c1 * c2);// 30
		System.out.println(c1 / c2);// 3
		// System.out.println(c1/c3);//异常 除数不能为0
		System.out.println(c1 % c2);// 1 取余

		// 浮点运算
		float f1, f2;
		f1 = 10f;
		f2 = 3f;
		System.out.println(f1/f2);//3.3333333
		System.out.println(f1/c2);//3.3333333 浮点与整形相除是浮点类型
		System.out.println(10f%3); //1.0 取余也是浮点类型
		//不仅仅是除法，几乎所有运算都是：整数和整数运算结果是整数；整数和小数运算结果
		//是小数；小数和小数的运算结果是小数。
		{
			System.out.println("-------------------");
			float f = 1/3*3;
			System.out.println(f);
			
			float f3 = 1.0f/3*3;
			System.out.println(f3);
			
			float f4 = 1/3*3.0f;
			System.out.println(f4);
		}
	}
}
