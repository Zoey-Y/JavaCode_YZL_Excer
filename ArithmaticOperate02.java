public class ArithmaticOperate02{
	public static void main(String[] args){
		//���绹��59��ż�,��:���м��������㼸��?
		/*
		1.�˽�����
		2.˼·����
		  (1)֪����59��,��һ�������洢��59��,int total = 59;
		  (2)��������,59 / 7,��һ�������洢����,int week = total / 7;
		  (3)������������,��һ�������洢����,int day = total % 7;
		3.���д����
		*/
		int total = 59;
		int week = total / 7;
		int day = total % 7;
		System.out.println("����" + week + "������" + "��" + day + "��ͷż���");
	}
}