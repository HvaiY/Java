package R3Struct;

public class ѭ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while
		int a = 50;
		while (a > 0) {
			System.out.println("a�ǣ�" + a--);
		}

		// do ����while
		int i = 0;
		do {
			System.out.println("���" + i);
			i++;
		} while (i < 3);
		
		//for
		for (int j = 0; j < 3; j++) {
			System.out.println(j);
		}
		//��ѭ��
	//	for(;;) {System.out.println("aaa");}
		
		//Ƕ�� for
		for (int j = 1; j <= 30; j++) {
			for (int n = 0; n < 23; n++) {
				System.out.println(j+"��"+n+"��");
			}
		}
		
		//break ��䣺��ֹ����ѭ��  continue ��ֹ��ǰѭ����������ѭ��
	}

}
