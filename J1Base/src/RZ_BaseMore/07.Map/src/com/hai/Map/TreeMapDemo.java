package com.hai.Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	/**
	 * 基于红黑树（Red-Black tree）的 NavigableMap 实现。
	 * 该映射根据其键的自然顺序进行排序，或者根据创建映射时提供的 Comparator 进行排序，具体取决于使用的构造方法。 
	 * @param args
	 */
	public static void main(String[] args) {
		//这种给予红黑树排序的集合需要指定排序规则（自然排序） ，这里可以匿名自然排序函数
		TreeMap<Student, String> treeMap = new TreeMap<Student, String>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num=o1.getAge()-o2.getAge();//比较排序 升序   如果是 o2.getAge()-o1.getAge()  那么就是降序
				num=num==0?o1.getName().compareTo(o2.getName()):num;  //compareTo 内部比较长度 同事比较字符排序通过哈希码
				return num;
			}
		});
	  Student s1 = new Student("赵云",33);
	  Student s2 = new Student("张飞",31);
	  Student s3 = new Student("关羽",35);
	  Student s4 = new Student("刘备",38);
	  Student s5 = new Student("赵云",33);
	  treeMap.put(s1, "武神");  //通过自然排序  这个被下面的s5替换了 （Key是一样的）
	  treeMap.put(s2, "肉盾");
	  treeMap.put(s3, "义薄云天");
	  treeMap.put(s4, "假仁义");
	  treeMap.put(s5, "武神吗");
    
	  Set<Student> ks = treeMap.keySet();
	  for(Student s:ks){
		  String ss=treeMap.get(s);
		  System.out.println(s.getName()+" -----"+s.getAge()+" -------"+ss);
		  
	  }
	}

}
