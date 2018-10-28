package com.hai.Test;

import com.hai.person.Student;
import com.hai.person.jump;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println("我来了 88888888888888888888");
        Student student=new Student();
        student.eat();
        student.sleep();
        //向下转型
        jump jump=(jump)student;
        jump.jumps();
	}
}
