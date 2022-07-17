public class MultipleCricles02{
	public static void main(String[] args){
		/*
			目标:
				1.打印乘法口诀表
			思路:
				1.用for循环方法书写
				2.最多乘到九,所以内循环9-i为最终范围
		*/
	int mul = 0;
		for(int i = 1; i <= 9;i++){
			for(int j = 1;j <= i; j++){
				mul = i * j;
				System.out.print( i + " * " + j + " = " + mul +" ");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}