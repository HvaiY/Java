package R5Array;

public class ArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���M����
		int[] arr=new int[10];
		arr[0]=1;
		int a[]=new int[3];
		int b[]= {1,2,3};
		//���������ֱ�Ӵ�ӡ���� ��ӡ������(����toString())
		System.out.println(a);
		//�����ȡֵ ����ͨ���±�
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("���ֵ�ǣ�"+getMaxNumber(b));
		
		System.out.println("-----------------------");
		
		//��ǿforѭ�� ֱ�ӵ�����Ԫ��
		for (int i : b) {
			System.out.println(i);
		}
		//�ɱ��������һ�����飬���������һ�������൱������ʹ�ã������ڲ�
		String str=getValues("2+3=",2,3);
		System.out.println(str);
	}
	
	static int getMaxNumber(int[] arr) {
		if(arr.length<=0) {
			System.out.println("���鳤��Ϊ0" );
			return -1;
		}
		int maxNum=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>=maxNum) {
				maxNum=arr[i];
			}
		}
		return maxNum;
	}
     
	static String getValues(String str,int... nums) {
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		return str+ sum;
	}
}
