package R1BaseDataType;

public class TypeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int
		int a = 200;
		System.out.println(a);
		// byte ,short,int,long ���ȶ�Ӧ�ķֱ��� 1,2,4,8���ֽ�
		byte b = 3;
		byte b1=127;//byte���ֵΪ127 ��������ֵ128��ô�ʹ���(-127��127֮��)
		short s = 3;
		int i = 3;
		long l = 3;
		System.out.println(b);
		System.out.println("-------------------------");
		System.out.println("byte ����Сֵ"+Byte.MIN_VALUE);
		System.out.println("byte ����Сֵ"+Byte.MAX_VALUE);
		System.out.println("short ����Сֵ"+Short.MIN_VALUE);
		System.out.println("short ����Сֵ"+Short.MAX_VALUE);
		System.out.println("int ����Сֵ"+Integer.MIN_VALUE);
		System.out.println("int ����Сֵ"+Integer.MAX_VALUE);
		System.out.println("long ����Сֵ"+Long.MIN_VALUE);
		System.out.println("long ����Сֵ"+Long.MAX_VALUE);
	}
}
