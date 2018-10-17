package R1BaseDataType;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 变量 赋值
		int aa = 200; // 数据类型 变量名称 =(赋值) 值
		// 定义多个变量
		int n1, n2, n3;
		n1 = 12;
		n2 = 14;
		System.out.println(n1);
		System.out.println(n2);
		// System.out.println(n3); //不赋值的变量无法使用
		
		//语句和语句块
			//JAVA 中常用的语句有 5 种：
			//(1) 赋值语句
		int a1=123;
			//(2) 方法调用语句
		System.out.println(a1);
			//(3) 空语句
		;
			//(4) 复合语句(语句块)
		{
			int a11=456;
			System.out.println();
			//同一语句块变量名称不能相同。
			//同级语句块的变量名称可以相同
		}
			//(5) 控制语句
		System.out.println("------------------");
		//局部变量
		int nx=10;
		{
			int nc=12;
			System.out.println(nc);
			System.out.println(nx);
			nx=20;
			System.out.println(nx);//可以访问外部变量
		}
		//System.out.println(nc);//无法访问到局部变量nc
		System.out.println(nx+"值变化了");
	}

}
