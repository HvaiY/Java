package RSS_OOP补充;

public class StaticChunk {
    static {
    	System.out.println("静态块一个类中只有一个，只初始化一次，在类第一次实例化就有了");
    }
    public void say() {
		System.out.println("呵呵呵");

	}
}
