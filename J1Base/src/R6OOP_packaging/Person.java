package R6OOP_packaging;

public class Person {

	private int age=19; //��Ա�������߽����ֶ�  ���Գ�ʼ�� Ҳ���Բ���ʼ�� ����ʹ��
	//�ֶ� ����ֵ����� �������͵�Ĭ��ֵ��0  boolean Ĭ��false  String���������ͣ� Ĭ��ֵΪnull
	//null  ��ָ���κεĶ��� 
	private String name;

	public void setAge(int value) {
		this.age = value;
	}

	public void setName(String value) {
		this.name = value;
	}

	public void sayHello() {
		System.out.println("Hello ,����" + this.name + ",����" + this.age + "����");
	}
}
