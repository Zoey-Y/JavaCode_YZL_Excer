public class OverLoad{
	public static void main(String[] args) {
		/*
			��������(�뷵�������޹ء����β����޹أ�ֻ�뷽�������β������й�)
			1.calculate(int n1,int n2)
			2.calculate(int n1,double n2)
			3.calculate(double n1,int n2)
			4.calculate(int n1,int n2,int n3)
		*/
		Load c = new Load();
		System.out.println(c.calculate(23 , 3.2)); 
	}
}
class Load{
	//���з�������һ��,�����ڼ�������Է����������ͳһ����
	//�������͵ļ���
	public int calculate(int n1,int n2){
		return n1 + n2;
	}
	//int + double = double;
	public double calculate(int n1,double n2){
		return n1 + n2;
	}
	//���ֲ�ͬ���͵ļ���Ҳһ��
	public double calculate(double n1,int n2){
		return n1 + n2;
	}
	//����ͬ����Ԫ����ӵ����
	public int calculate(int n1,int n2,int n3){
		return n1 + n2 + n3;
	}
}