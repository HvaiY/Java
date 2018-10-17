package R1BaseDataType;

public class TypeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int
		int a = 200;
		System.out.println(a);
		// byte ,short,int,long 长度对应的分别是 1,2,4,8个字节
		byte b = 3;
		byte b1=127;//byte最大值为127 如果如果赋值128那么就错了(-127到127之间)
		short s = 3;
		int i = 3;
		long l = 3;
		System.out.println(b);
		System.out.println("-------------------------");
		System.out.println("byte 的最小值"+Byte.MIN_VALUE);
		System.out.println("byte 的最小值"+Byte.MAX_VALUE);
		System.out.println("short 的最小值"+Short.MIN_VALUE);
		System.out.println("short 的最小值"+Short.MAX_VALUE);
		System.out.println("int 的最小值"+Integer.MIN_VALUE);
		System.out.println("int 的最小值"+Integer.MAX_VALUE);
		System.out.println("long 的最小值"+Long.MIN_VALUE);
		System.out.println("long 的最小值"+Long.MAX_VALUE);
	}
}
