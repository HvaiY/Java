package R10OOP_Asbtract;

// �������޷�ʵ���� ֻ���ӷǳ�������ſ�ʵ����
public abstract class Person {

    //��������
    void speak() {
        System.out.println("����Ļ����Ҷ���");
    }

    static void speak2() {
        System.out.println("����Ļ����Ҷ���� ������̬");
    }

    //�����ֶ�  ����public  ��Ȼ�����ʲ���
    private int age = 18;

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //���󷽷�
    public abstract void run();
}
