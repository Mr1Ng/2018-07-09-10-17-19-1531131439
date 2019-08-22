package practice05;

import practice05.Person;

public class Student extends Person{
	private int klass;
	public Student(String name,int age,int klass) {
		super(name,age);
		this.klass = klass;
	}
	public int getKlass() {
		return klass;
	}
	public void setKlass(int klass) {
		this.klass = klass;
	}
	
	@Override 
	//编译器可以给你验证@Override下面的方法名称是否是你父类中所有的，如果没有就会报错
	public String introduce() {
		return String.format("My name is %s. I am %d years old. I am a studen. I am at Class %d.", this.getName(),this.getAge(),this.getKlass());
	}
}
