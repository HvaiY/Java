package R3Struct;

public class Structs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //if switch
		int age=28;
		if(age>18) {
			System.out.println("�������18");
		}
		System.out.println("ִ�н���");
		
		if(age>=28) System.out.println("������ڵ���28");
		//��ʽ2
		boolean b=true;
		if(b) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		//��ʽ3
		int size=10;
		if(size<10) {
			System.out.println("��");
		}else if(size==10){
			System.out.println("һ��");
		}else if(size>10) {
			System.out.println("����");
		}
		
		String a="abc";
		String c="ab";
		String z="c";
		String s=c+z;
		System.out.println(a==s);//false �ַ�����==������ 
		System.out.println(a==("ab"+"c")); //true
		//�ַ��ж�ʹ��equels
		System.out.println(a.equals(s));//true
		//ifǶ��
		{
			int d=29;
			if(d>10) {
				System.out.println("С��10");
				if(d<20) {
					System.out.println("С��20");
				}else if(d>28) {
					System.out.println("����28");
				}
			}
		}
		
		//Switch
		{
			int month=12;
			switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("��");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("��");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("��");
			default:
				System.out.println("��");
				break;
			}
			
			String str="��";
			switch (str) {
			case "��":
				System.out.println("��á���");
				break;
			case "С��":
				System.out.println("���С��");
				break;
			default:
				System.out.println("����˭��");
				break;
			}
		}
	}

}
