package R7OOP;

import R7OOP.com.person.China; //�����
import static java.lang.Math.pow; //��̬����� ������ʹ�� ���ܻ���ֺܶ�ĳ�ͻ

public class Main {

	public static void main(String[] args) {
		// package �� �������Ϊһ���ļ���
		// import �����
		// �� ���� �� ������ͬ�������ͬһ������ ���ڷ������
		// �����Ļ� �����Է��ڲ�ͬ�İ��� �����ͻ
		// ����� �� java.lang Ĭ�ϵİ� ����������
		China p = new China();

		R7OOP.com.animal.Dog dog = new R7OOP.com.animal.Dog(); // ��ͬ����������ʹ��

		Dog dog2 = new Dog();

		// 2��3�η�
		// ��̬�����
		double d = pow(2, 3);
	}

}
