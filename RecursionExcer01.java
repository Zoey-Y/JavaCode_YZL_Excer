public class RecursionExcer01{
	public static void main(String[] args) {
		/*
		Ҫ��:
			 1.�õݹ����쳲�������
			 eg: 1,1,2,3,5,8,13..����һ��n,
			 �������ֵ�Ƕ��٣�
		 ˼·:
		 	n1 = 1 Ϊ1
		 	n2 = 2 Ϊ1
		 	n3 = 3 Ϊn1 + n2
		 	n4 = 4 Ϊn3 + n4
		*/
	
		Feibonacci f1 = new Feibonacci();
			int n = 50;
		int result = f1.F(n);
		if(result != -1){
			System.out.print("��" + n + "��ֵ��" + f1.F(n));
		}

	}
}
class Feibonacci{
	public int F(int n) {
		if(n >= 1){
			if(n == 1 || n == 2) {
				return 1;
			}else {
				return F(n - 2) + F(n - 1);
			}
		}else {
			System.out.println("��������в���ȷ");
			return -1;
		}
		
	}
}