public class PropertiesDetail01{
	public static void main(String[] args) {
		/*
		����:���Ե�ϸ��(�����׶�)
			1.�������η� + �������� + ������
			2.�������θ�:�������Է��ʷ�Χ��
			3.�������η���:private��public��protected��Ĭ��
			4.�����������ֵ����Ĭ��ֵ
		method:
			1.�������ٴ���:
				Cat cat;
				cat = new Cat();
			2.ֱ�Ӵ���:
				Cat cat = new Cat();
		��������
			eg:   cat.name = ...		
		*/
		//��������
	person p1 = new person();
	//new person����һ������ռ�,���������Ķ���
	//p1ָ������µ�����
	//ֱ��ʹ��Ĭ�����η��Ľ��
	 System.out.println("���������ԵĽ��:");
	 //��������p1��p2�����ոı����p1,p2�����ս��
	person p2 = p1;
	p1.name = "pw";
	p2.name ="p2";
	System.out.println("p1.name =" + p1.name);
	System.out.println("p2.name =" + p2.name);
	}
}
class person{//����һ����
	String name;
	int age;
	double ispass;
	/*
		String �ڷ�������ʵ��
		int ֱ���ڶ���ʵ��
		��������Ϣ�ڷ�������ʵ��
	*/
}