package R2Opertor;

public class Opertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���������
		// + �ӻ���ֵ
		// - ����ֵ
		// * ��
		// / ��
		// % ȡ��
		int a = 10;
		int b = 20;
		System.out.println(a + b); // �������
		System.out.println(a + 1); // �����볣�����
		System.out.println(1 + 1); // �����������������
		System.out.println(+a);
		System.out.println(+100);

		int c1, c2, c3;
		c1 = 10;
		c2 = 3;
		c3 = 0;
		System.out.println(c1 - c2);// 7
		System.out.println(c1 * c2);// 30
		System.out.println(c1 / c2);// 3
		// System.out.println(c1/c3);//�쳣 ��������Ϊ0
		System.out.println(c1 % c2);// 1 ȡ��

		// ��������
		float f1, f2;
		f1 = 10f;
		f2 = 3f;
		System.out.println(f1/f2);//3.3333333
		System.out.println(f1/c2);//3.3333333 ��������������Ǹ�������
		System.out.println(10f%3); //1.0 ȡ��Ҳ�Ǹ�������
		//�������ǳ����������������㶼�ǣ�������������������������������С��������
		//��С����С����С������������С����
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
