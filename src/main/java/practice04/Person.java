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
		super(); //super()�������е��ø���Ĺ��췽��,����д�����๹�췽���ĵ�һ��
		this.name = name;
		this.age = age;
	}
	
	public String introduce() {
		return String.format("My name is %s. I am %d years old", this.name, this.age);
	//ռλ����%s ���ַ���,%d ������
	}				
	
}