package R3Struct;

public class Structs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //if switch
		int age=28;
		if(age>18) {
			System.out.println("年龄大于18");
		}
		System.out.println("执行结束");
		
		if(age>=28) System.out.println("年龄大于等于28");
		//形式2
		boolean b=true;
		if(b) {
			System.out.println("真");
		}else {
			System.out.println("假");
		}
		//形式3
		int size=10;
		if(size<10) {
			System.out.println("差");
		}else if(size==10){
			System.out.println("一般");
		}else if(size>10) {
			System.out.println("优秀");
		}
		
		String a="abc";
		String c="ab";
		String z="c";
		String s=c+z;
		System.out.println(a==s);//false 字符串用==不靠谱 
		System.out.println(a==("ab"+"c")); //true
		//字符判断使用equels
		System.out.println(a.equals(s));//true
		//if嵌套
		{
			int d=29;
			if(d>10) {
				System.out.println("小于10");
				if(d<20) {
					System.out.println("小于20");
				}else if(d>28) {
					System.out.println("大于28");
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
				System.out.println("春");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋");
			default:
				System.out.println("冬");
				break;
			}
			
			String str="大海";
			switch (str) {
			case "大海":
				System.out.println("你好。大海");
				break;
			case "小海":
				System.out.println("你好小海");
				break;
			default:
				System.out.println("你是谁？");
				break;
			}
		}
	}

}
