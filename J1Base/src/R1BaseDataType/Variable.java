package R1BaseDataType;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ��ֵ
		int aa = 200; // �������� �������� =(��ֵ) ֵ
		// ����������
		int n1, n2, n3;
		n1 = 12;
		n2 = 14;
		System.out.println(n1);
		System.out.println(n2);
		// System.out.println(n3); //����ֵ�ı����޷�ʹ��
		
		//��������
			//JAVA �г��õ������ 5 �֣�
			//(1) ��ֵ���
		int a1=123;
			//(2) �����������
		System.out.println(a1);
			//(3) �����
		;
			//(4) �������(����)
		{
			int a11=456;
			System.out.println();
			//ͬһ����������Ʋ�����ͬ��
			//ͬ������ı������ƿ�����ͬ
		}
			//(5) �������
		System.out.println("------------------");
		//�ֲ�����
		int nx=10;
		{
			int nc=12;
			System.out.println(nc);
			System.out.println(nx);
			nx=20;
			System.out.println(nx);//���Է����ⲿ����
		}
		//System.out.println(nc);//�޷����ʵ��ֲ�����nc
		System.out.println(nx+"ֵ�仯��");
	}

}
