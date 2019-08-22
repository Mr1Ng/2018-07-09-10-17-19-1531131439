package practice04;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;		
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super(); //super()从子类中调用父类的构造方法,必须写在子类构造方法的第一行
		this.name = name;
		this.age = age;
	}
	
	public String introduce() {
		return String.format("My name is %s. I am %d years old", this.name, this.age);
	//占位符，%s 是字符串,%d 是整数
	}				
	
}