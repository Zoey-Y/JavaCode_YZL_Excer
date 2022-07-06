public class ForExercise{
	public static void main(String[] agrs){
		
		/*
		打印以下表达式:
			0 + 5 = 5
			1 + 4 = 5
			2 + 3 = 5
			3 + 2 = 5
			4 + 1 = 5
			5 + 0 = 5
		*/
		
		// for(int i = 0,j = 5; i <= j;i++){
		// 	int sum = i + (j - i);
		// 	System.out.println(i + " + " + (j - i) + " = " + sum);
		// }
//-----------------------------------------------------------------------------
		/*
		目标:
		 	1.打印1 ~ 100 之间所有9的整数倍
		 	2.统计整数倍的个数 和 总和
		思路:(化繁为简,先死后活)
			化繁为简:
				1.先打印1 ~ 100之间的数
				2.再提炼所有9的整数倍
				3.统计9的整数倍个数
				4。求9的整数倍之和
			先死后活:
					1.先考虑固定的值在转化成可变化的值
					2.为了以后更好的顺应需求,能把常量转化为变量就最好
		 */ 
		//
		int count = 0;//统计
		int sum = 0;//求和
	    //这里的范围是固定的,为了以后顺应需求可将范围灵活改变最好写成变量
	    int start = 1;
	    int end = 100;
	    int t = 9;//倍数
		for(int i = start;i <= end;i++){//遍历所有
			if(i % t == 0){//提炼
				System.out.println("i = "+ i);//打印
				count++;
				sum += i;
			}
			
		}
		System.out.println("9的倍数个数有:" + count);
		System.out.println("9的倍数总和:" + sum);

	}
}