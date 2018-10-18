package R2Opertor;

public class 类型转换 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 类的名称最好不要是中文(可以是中文)
          //数据类型转换
		{
			int a=1;
			short b=2;
			a=b; //隐式转换 可以成功
			System.out.println(a);
		}
		{
			int a=128;
			short s=2;
			s=(short)a; //显示转换，否则数据溢出来(显示转换  能放多少就放多少，多余的放弃)
			System.out.println(s);
			
			byte b=1;
			b=(byte)a; // -128 转换可以想象成一个圆。多出的从负数边界开始+
			System.out.println(b);
		}
		//变量交换
		{
			int a =10;
			int b =20;
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("a:"+a+",b:"+b);
		}
		//++ -- 
		//++ 在变量之前 变量先++后使用
		//++在变量之后  变量先使用 后自增1
		{
			int a=1;
			int b=0;
			b=a++; //后++
			System.out.println(a);
			System.out.println(b);
		}
		{
			int a=1;
			System.out.println(a++);
			System.out.println(++a);
			System.out.println(a);
		}
		//关系运算符
				//  <  小于
				//  <= 小于或等于
				//  >  大于
				//  >= 大于等于
				//  ==  等于
				//  != 不等于
		//逻辑运算符
			//	&& 逻辑与（并且）
			//	||  逻辑或（或者）
			//	!  逻辑非
		{
			int a=0;
			int b=1;
			int c=2;
			boolean b1 = a!=0&&b/a>5;
			System.out.println(b1);
		}
		{
			int a=0;
			int b=1;
			boolean b1 = a!=0&&(b=b+1)>2;
			System.out.println(b1);//false
			System.out.println("a="+a+",b="+b);//0,1
		}
		{
			int a=0;
			int b=1;
			boolean b1 = a!=0||(b=b+1)>2;
			System.out.println(b1);
			System.out.println("a="+a+",b="+b);
		}
		
		int mm=20;
		int nn=mm>10?mm:10;
		System.out.println(nn);
	}
	
}
