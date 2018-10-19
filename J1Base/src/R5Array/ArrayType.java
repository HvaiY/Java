package R5Array;

public class ArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//數組数组
		int[] arr=new int[10];
		arr[0]=1;
		int a[]=new int[3];
		int b[]= {1,2,3};
		//数组遍历，直接打印数组 打印不出来(数组toString())
		System.out.println(a);
		//数组获取值 可以通过下标
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("最大值是："+getMaxNumber(b));
		
		System.out.println("-----------------------");
		
		//增强for循环 直接迭代除元素
		for (int i : b) {
			System.out.println(i);
		}
		//可变参数就是一个数组，方法的最后一个参数相当于数组使用，方法内部
		String str=getValues("2+3=",2,3);
		System.out.println(str);
	}
	
	static int getMaxNumber(int[] arr) {
		if(arr.length<=0) {
			System.out.println("数组长度为0" );
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
