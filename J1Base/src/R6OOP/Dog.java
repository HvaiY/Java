package R6OOP;

public class Dog {
	// javaBean �淶 ���еĳ�Ա������Ϊprivate ��Ҫ��getter��setter����  boolean ���� ���ط���������isXXX
	// ��Ա����������Ϸ��� һ���֮Ϊ ����
	// �����Ϊpublic  ,
	//������һ�޲ι��췽��
	private int age;
	private String name;
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
