public class Object01{
	public static void main(String[] args) {
		/*
			Ҫ��:����һ������,��ʵ����
		*/
		//ʵ����һ����
		Person p1 = new Person();
		p1.age = 22;
		p1.name = "yzl";
		p1.weight = 65.3;
		System.out.println("�ҵ�����:" + p1.age + "\n" + 
					   "�Ҷ�����:" + p1.name + "\n" +
					   "�Ҷ�����:" + p1.weight  + "����" + "\n");
	}
	
}
//����һ����������(���ԡ���Ϊ[�Ȳ�д��Ϊ��ûѧ])
class Person{
	//����
	int age;
	String name;
	double weight;
	//��Ϊ
}