public class CopyAssign{
	public static void main(String[] args) {
		/*
		���鸳ֵ����һ:
		 	1.ֵ������ֵ��ʽ:

		*/
		int n1 = 100;
		int n2 = n1;//�˴�ֻ��ջ���n1��ֵ����һ�����n2
		n2 = 0;//ֻ�ǽ�n2��ֵ��ջ���޸ĳ���0,���ı�n1��ֵ
		System.out.println("n1 = " + n1 + "\t" + "n2 = " + n2);
	}
}