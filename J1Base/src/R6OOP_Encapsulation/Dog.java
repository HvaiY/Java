package R6OOP_Encapsulation;

public class Dog {
	// javaBean �淶 ���еĳ�Ա������Ϊprivate ��Ҫ��getter��setter����  boolean ���� ���ط���������isXXX
	// ��Ա����������Ϸ��� һ���֮Ϊ ����
	// �����Ϊpublic  ,
	//������һ�޲ι��췽��
	private int age;
	private String name;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", vip=" + vip + "]";
	}
	private boolean vip;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
}
