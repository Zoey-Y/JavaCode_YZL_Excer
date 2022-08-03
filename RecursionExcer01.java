public class RecursionExcer01{
	public static void main(String[] args) {
		/*
		要求:
			 1.用递归求出斐波那契数
			 eg: 1,1,2,3,5,8,13..给出一个n,
			 求出它的值是多少？
		 思路:
		 	n1 = 1 为1
		 	n2 = 2 为1
		 	n3 = 3 为n1 + n2
		 	n4 = 4 为n3 + n4
		*/
	
		Feibonacci f1 = new Feibonacci();
			int n = 50;
		int result = f1.F(n);
		if(result != -1){
			System.out.print("第" + n + "个值是" + f1.F(n));
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
			System.out.println("输入的数列不正确");
			return -1;
		}
		
	}
}