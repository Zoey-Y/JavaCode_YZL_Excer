public class Method01{
	public static void main(String[] args) {
		/*
		Ҫ��:
			1.���һ����Ա����
			2.���һ��speak��Ա����,���һ��"���Ǻ���"
		*/
			//����ʹ��
			//1.����д�ú�,���������򲻻����
		person p1 = new person();
			//2.�����䷽������
			p1.speak();//�����ǵô�����
	}
}
class person{
	//��Ա����(����)
	String name;
	int age;
	//����
	/*
		1.public: ��ʾ�����ǹ�����
		2.void: ��ʾ������û�з���ֵ��
		3.speak(): ������,():���β��б�
		4.{}:������,д����Ҫִ�еĴ���

	*/

	public void speak(){
		System.out.println("���Ǻ���");
	}
}