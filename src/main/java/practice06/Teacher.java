//package practice06;
//
//import practice06.Person;
//
//public class Teacher extends Person{
//	private int klass;
//	public Teacher(String name,int age,int klass) {
//		super(name,age);
//		this.klass = klass;
//	}
//	public int getKlass() {
//		return klass;
//	}
//	public void setKlass(int klass) {
//		this.klass = klass;
//	}
//	
//	@Override 
//	//���������Ը�����֤@Override����ķ��������Ƿ����㸸�������еģ����û�оͻᱨ��
//	public String introduce() {
//		if(klass == 0) {
//			return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class", this.getName(),this.getAge();
//		} else {
//		    return String.format("My name is %s. I am %d years old. I am a Teacher. I am at Class %d.", this.getName(),this.getAge(),this.getKlass);
//	    }
//	}
//}
