package R4Methods;

public class Method {

	public static void main(String[] args) {
		// main 是静态方法 (static ) 那么在当前类调用的方法也需要是静态的
		say();
		eat("肉");
		String s="222";
		setValue(s);
		System.out.println(s);//222
		//在 JAVA 中，实参向形参传递数据方式是“值传递”。并且是单向的，只能实参向形参
		//赋值，反之不行。当方法被调用时，系统会为形参变量分配内存空间，然后将实参的值复制
		//到形参对应的内存空间中。因此，实参与形参对应的内存空间是不同的，但是内存空间中的
		//数据是相同，形参相当于实参的一个 副本。
		//由于形参只是实参的一个副本，那么修改实参将不会影响形参。
		int a=getValue(11);
		System.out.println(a);
	}

	static void say() {
		System.out.println("你好，Hello");
	}
   static void eat(String str) {
	   System.out.println("吃"+str);
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
   //方法重載
   static int getValue(int i,int z) {
	   return i+z;
   }
}
