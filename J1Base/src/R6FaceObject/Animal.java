package R6FaceObject;

public class Animal {
	// ���캯��
	// Ĭ�� һ���඼��һ���޲ι��캯�� ���Ƕ������� ��Ȼ��������ʾ��ʹ��
	public Animal() {
		System.out.println("�޲ι��캯��");
	}

	public Animal(int age) {
		System.out.println("һ�������Ĺ��캯��");
		this.age = age;
	}

	public Animal(int age, String name) {
		System.out.println("���������Ĺ��캯��");
		this.name = name;
		this.age = age;
	}

	private int age;
	private String name;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void sayHello() {
		System.out.println("Hello ,����" + this.name + ",����" + this.age + "����");
	}

}
