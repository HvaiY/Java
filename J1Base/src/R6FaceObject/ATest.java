package R6FaceObject;

public class ATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������
		// ���������һ������ʵ��
		// ����һ������ĳ������ ���� ������
		// ������ �������� �̳� ��װ ��̬
		Person person = new Person();
		person.setAge(18);
		person.setName("��");
		person.sayHello();

		// ʵ����һ������ ����tom
		Animal cat = new Animal();
		cat.setAge(12);
		cat.setName("Tom");
		cat.sayHello();
		{
			Animal dog = new Animal(12, "����");
			System.out.println(dog.getName() + "��һֻ��" + dog.getAge() + "����");
			cat.sayHello();
		}
	}

}
