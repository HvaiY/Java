package R6OOP_packaging;

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
			dog.sayHello();

			Animal dog1 = new Animal(12, "����");
			System.out.println(dog1.getName() + "��һֻ��" + dog1.getAge() + "����");
			dog1.sayHello();

			System.out.println(dog == dog1);// false �޷��ж���ͬһ�������
             System.out.println(isSame(dog, dog1)); //true ���ַ�ʽ�ж��Ƿ�Ϊͬһ������
			System.out.println(dog1.hashCode());
		}

		// public:�����ģ����ܷ��� private��˽�е� ֻ�����ڲ��Լ����ܷ���(�������ǹ��캯��˽�л�������)
		// ��Ա�����Ǵ洢�����õ� һ�㶼��private ����
	}

	public static boolean isSame(Animal dog, Animal dog1) {
		return dog.getAge() == dog1.getAge() && dog.getName().equals(dog1.getName());
	}
}
