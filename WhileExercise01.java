public class WhileExercise01{
	public static void main(String[] args){
		/*
		目标:
			1.利用whlie循环输出10句"你好"
		*/
					// int i = 1;
					// while(i <= 10){
					// 	System.out.println("你好");
					// 	i++;
					// }
					// System.out.println("循环已退出");
		/*
			目标:
				1.打印1 ~ 100之间所有能被3整除的数[使用while循环]
			思路:
				化繁为简:
				1.先打印1 ~ 100的数
				2.提炼能被3整除的数
				先死后活:
				1.用变量包含常量方便以后循环利用
		*/
					int i = 1;//最低限度
					int n = 100;//最高限度
					int t = 3;//倍数
					while(i <= n){
						if(i % t == 0){
							System.out.println("i = " + i);
						}
						i++;//变量的迭代
					}
	}
}