package R1BaseDataType;

public class TypeOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ����
		// float �����ȸ�����
		// double ˫���ȸ�����
		System.out.println("float��󳤶��ǣ�" + Float.MAX_VALUE);
		System.out.println("float��󳤶��ǣ�" + Float.MIN_VALUE);

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		float f = 3.14f;
		double b = 3.14;
		System.out.println(f);
		System.out.println(b);

		System.out.println("------------------------------");

		// �ַ��� char ֻ��һ���ַ�
		char a = 'A';
		System.out.println(a);
		System.out.println("------------------------------");
		//��������
		boolean bool = true;
		System.out.println(bool);
		System.out.println("------------------------------");
        //�ַ��� String
		String s="���,��";
		System.out.println(s);
		//����ִ�з�ʽ  ���ϵ��� �����ң���򵥳���ṹ��
		System.out.println("hello"+8+7);//hello87
		System.out.println(8+7+"hello");//15hello
		System.out.println(8+(7+"hello"));//87hello
		
		System.out.println("");//����Ϊ0���ַ���
		System.out.println("--------------------");
		
		
		//ת���ַ�
		char c2='\n';//���з�
		char c3='\\';//ת�� �ַ�Ϊ\
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
