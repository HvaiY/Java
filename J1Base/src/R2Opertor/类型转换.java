package R2Opertor;

public class ����ת�� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���������ò�Ҫ������(����������)
          //��������ת��
		{
			int a=1;
			short b=2;
			a=b; //��ʽת�� ���Գɹ�
			System.out.println(a);
		}
		{
			int a=128;
			short s=2;
			s=(short)a; //��ʾת�����������������(��ʾת��  �ܷŶ��پͷŶ��٣�����ķ���)
			System.out.println(s);
			
			byte b=1;
			b=(byte)a; // -128 ת�����������һ��Բ������ĴӸ����߽翪ʼ+
			System.out.println(b);
		}
		//��������
		{
			int a =10;
			int b =20;
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("a:"+a+",b:"+b);
		}
		//++ -- 
		//++ �ڱ���֮ǰ ������++��ʹ��
		//++�ڱ���֮��  ������ʹ�� ������1
		{
			int a=1;
			int b=0;
			b=a++; //��++
			System.out.println(a);
			System.out.println(b);
		}
		{
			int a=1;
			System.out.println(a++);
			System.out.println(++a);
			System.out.println(a);
		}
		//��ϵ�����
				//  <  С��
				//  <= С�ڻ����
				//  >  ����
				//  >= ���ڵ���
				//  ==  ����
				//  != ������
		//�߼������
			//	&& �߼��루���ң�
			//	||  �߼��򣨻��ߣ�
			//	!  �߼���
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
