package R9OOP;

public class Final_Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // final �ؼ���
        // final �������η��� ���� ����
        // 1����final���εķ������ܱ���д��Override��
        // 2,��final ���εı���ֻ�ܵ�һ�θ�ֵ�����治�ɱ��
        // 3,��final���ε��� ���ܱ��̳� Ҳ����û��������
        // 4,String���Ǳ�final ���ε�һ����
        // ����ͨ��Ctrl+Shift+T ������Դ��鿴
        final int a = 8;
        // a=10;�����ڸ�ֵ
    }

}

final class Person {

}
//�޷��̳�
//class Chinese extends Person{
//	
//}

class Animal {
    final public void say() {
        System.out.println("hello");
    }
}

class Dog extends Animal {
//	public void say() {
//		// �̳й����ķ����޷�����д
//
//	}
}