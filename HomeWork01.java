public class HomeWork01{
	public static void main(String[] args){
		/*
		����:-10.5 % 4
		a % b��aΪС��ʱ ��ʽ:a - (int)a / b * b
		                    -10.5 - (int)(-10.5) / 4 * 4
		*/
		System.out.println(-10.5 % 4);//-2.5
		/*-10.5 % 3.2
			��ʽ:a - (int)a /(int)b * b
			    -10.5 - (-10) / 3 * (3.2) = -0.9
		*/
		System.out.println(-10.5 % 3.2);//-0.9

		/*ע:С��λ���������������ս���������ֵ*/

		int i = 66;
		System.out.println(++i+i);//i = i + 1 => i = 67(��ʱi���±���ֵ��),���i����67,�������i + i ==67+67==134


		/*
		1.int num1 =(int)"18";//F:Ӧ����Integer.parseInt("18");
		2.int num2 =18.0;//F ��Ϊint < double,doubleתint�����Զ�ת��
		3.double num3 = 3d;//T
		4.double num4 = 8;//T��Ϊint < double,int ת double���Զ�ת��
		5.int i = 48;char ch = i+1;//F i+1Ϊ����int,�������ת����char
		6.byte b = 19;short s =b+2;//F b+2������һ������ 
		*/


		/*String ת�� double �����*/
		String words01 = "2.33";
		double D01 = Double.parseDouble(words01);
		System.out.println(D01);


		/*char ת�� String �����*/
		char c01 ='a';
		String words02 = c01 + "";
		System.out.println(words02);
	}
}