public class OverLoadExcer02{
	public static void main(String[] args) {
	/*
		�����������ط���max()
		1.��һ������max��������intֵ�����ֵ
		2.�ڶ���������������doubleֵ�е����ֵ
		3.�������ֱ𷵻�����doubleֵ�е����ֵ
		�ֱ������������
	*/
		method m = new method();
		m.max(3,4);//4
		m.max(3.43,4.52);//4.52
		m.max(3.23,4.35,2.3);//4.35

	}
}
class method{
	public void max(int n1,int n2){
		int Max = n1 > n2 ? n1 : n2;
		System.out.println("����int�����ֵ" + Max);
	}
	public void max(double n1,double n2){
		double Max = n1 > n2 ? n1 : n2;
		System.out.println("����double�����ֵ" + Max);
	}
	public void max(double n1,double n2,double n3){
		double Max = n1 > n2 ? n1 : n2;
		Max = Max > n3 ? Max : n3;
		System.out.println("����double�����ֵ" + Max);
	}
}