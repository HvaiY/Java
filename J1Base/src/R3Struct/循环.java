package R3Struct;

public class 循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while
		int a = 50;
		while (a > 0) {
			System.out.println("a是：" + a--);
		}

		// do 。。while
		int i = 0;
		do {
			System.out.println("你好" + i);
			i++;
		} while (i < 3);
		
		//for
		for (int j = 0; j < 3; j++) {
			System.out.println(j);
		}
		//死循环
	//	for(;;) {System.out.println("aaa");}
		
		//嵌套 for
		for (int j = 1; j <= 30; j++) {
			for (int n = 0; n < 23; n++) {
				System.out.println(j+"日"+n+"点");
			}
		}
		
		//break 语句：终止整个循环  continue 终止当前循环继续其它循环
	}

}
