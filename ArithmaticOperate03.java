public class ArithmaticOperate03{
	public static void main(String[] args){
		/*����һ���������滪���¶�,���ϡ���>���ϵĹ�ʽ:
		  ���϶� = 5 / 9 * (�����¶� - 100)
		  �����[234.5]�Ļ����¶� ��Ӧ�� �����¶ȡ�	
		*/
		/*
		1.�˽�����
		2.����˼·:
			(1)����[234.5]���϶ȵı���,double degreeF = 234.5;
			(2)���ù�ʽ���㻪�϶ȡ���>���϶�,double degreeC = 5 / 9 * ( degreeF - 100 );
		3.�ߴ���
		*/
		double degreeF = 234.5;
		double degreeC = 5.0 / 9.0 * ( degreeF - 100.0 );
		System.out.println("234.5F ��Ӧ�� ���϶�Ϊ:" + degreeC + "C");
	}
}