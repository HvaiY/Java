package R4Methods;

public class Method {

	public static void main(String[] args) {
		// main �Ǿ�̬���� (static ) ��ô�ڵ�ǰ����õķ���Ҳ��Ҫ�Ǿ�̬��
		say();
		eat("��");
		String s="222";
		setValue(s);
		System.out.println(s);//222
		//�� JAVA �У�ʵ�����βδ������ݷ�ʽ�ǡ�ֵ���ݡ��������ǵ���ģ�ֻ��ʵ�����β�
		//��ֵ����֮���С�������������ʱ��ϵͳ��Ϊ�βα��������ڴ�ռ䣬Ȼ��ʵ�ε�ֵ����
		//���βζ�Ӧ���ڴ�ռ��С���ˣ�ʵ�����βζ�Ӧ���ڴ�ռ��ǲ�ͬ�ģ������ڴ�ռ��е�
		//��������ͬ���β��൱��ʵ�ε�һ�� ������
		//�����β�ֻ��ʵ�ε�һ����������ô�޸�ʵ�ν�����Ӱ���βΡ�
		int a=getValue(11);
		System.out.println(a);
	}

	static void say() {
		System.out.println("��ã�Hello");
	}
   static void eat(String str) {
	   System.out.println("��"+str);
   }
   
   static void setValue(String s) {
	   s="123";
   }
   
   static int getValue(int i) {
	   if(i>10) {
		   return i;
	   }else {
		   return 10;
	   }
   }
   //�������d
   static int getValue(int i,int z) {
	   return i+z;
   }
}
