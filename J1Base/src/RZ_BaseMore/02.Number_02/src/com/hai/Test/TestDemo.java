package com.hai.Test;

import com.hai.person.Student;
import com.hai.person.jump;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println("������ 88888888888888888888");
        Student student=new Student();
        student.eat();
        student.sleep();
        //����ת��
        jump jump=(jump)student;
        jump.jumps();
	}
}
