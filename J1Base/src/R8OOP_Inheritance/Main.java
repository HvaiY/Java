package R8OOP_Inheritance;

public class Main {
	public static void main(String[] args) {
		// �̳�
		Parent p = new Parent();
		p.eat();

		Child child = new Child();
		child.eat();
		child.playGame();

		// private ��Ա�޷���������ʣ�����ֻ��ͨ������ķ� private ��������ӡ����ʸ����
		// private ��Ա��������֤�˸��� private ��Ա�İ�ȫ�ԡ�
		// public ��Ա���������໹�������඼���Է��ʡ�
		// protected ��Աֻ�ܱ��Լ��Լ����ֱࣨ�ӻ��߼�ӣ��Լ��ֵܣ�ͬ package ���У����ʣ�
		// �޷������������
	}
}
