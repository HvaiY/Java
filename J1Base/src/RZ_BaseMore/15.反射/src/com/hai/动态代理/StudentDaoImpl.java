package com.hai.动态代理;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void add() {
		System.out.println("增加");
	}
	@Override
	public void del() {
		System.out.println("删除");
	}
	@Override
	public void edit() {
		System.out.println("编辑");
	}
	@Override
	public void sel() {
		System.out.println("查询");
	}

}
