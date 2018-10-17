package R1BaseDataType;

public class TypeOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 浮点数 类型
		// float 单精度浮点型
		// double 双精度浮点型
		System.out.println("float最大长度是：" + Float.MAX_VALUE);
		System.out.println("float最大长度是：" + Float.MIN_VALUE);

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		float f = 3.14f;
		double b = 3.14;
		System.out.println(f);
		System.out.println(b);

		System.out.println("------------------------------");

		// 字符型 char 只能一个字符
		char a = 'A';
		System.out.println(a);
		System.out.println("------------------------------");
		//布尔类型
		boolean bool = true;
		System.out.println(bool);
		System.out.println("------------------------------");
        //字符串 String
		String s="你好,大海";
		System.out.println(s);
		//代码执行方式  从上到下 从左到右（最简单程序结构）
		System.out.println("hello"+8+7);//hello87
		System.out.println(8+7+"hello");//15hello
		System.out.println(8+(7+"hello"));//87hello
		
		System.out.println("");//长度为0的字符串
		System.out.println("--------------------");
		
		
		//转义字符
		char c2='\n';//换行符
		char c3='\\';//转义 字符为\
		System.out.println(c2);
		System.out.println(c3);
		
		String str="ab\nc\\d";
		System.out.println(str);
		char c4='\'';
		System.out.println(c4);
		char c5='\"';
		System.out.println(c5);
		String str2="ab\"cd'";
		System.out.println(str2);
		
		
		
	}
}
