package practice03;


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
	//���������Ը�����֤@Override����ķ��������Ƿ����㸸�������еģ����û�оͻᱨ��
	public String introduce() {
		return String.format("I am a studen. I am at Class %d.", this.getKlass());
	}
}
