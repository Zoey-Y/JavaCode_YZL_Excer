public class RecursionTaoZi{
	public static void main(String[] args) {
		/*
		题目:有一堆桃子,
		猴子一天吃这堆桃子的一半多一个,
		以后每天都这样.
		当到第十天时,发现只有一个桃子了
		求出最初有几个桃子

		思路分析:
			1.第十天时 为1个.
			2.第九天时 为 第九天的数量 = (第十天的数量 + 1) * 2
			//正推day10 = day9 / 2 - 1 ——>day10 = 1;   
			//逆推:day9 = (day10 + 1) * 2;
		*/
		Taozi originalSum = new Taozi();
		int sum = originalSum.Taozi(1);//这里1是因为从第一天开始进行判断
				/*for循环的思想来举一反三:
				  就是1传参到形参里就是从1开始循环一直到条件满足
				  10天就可以找到第十天剩余一个桃子的已知条件
				 */

			if (sum != -1) {
				System.out.println("最初时有" + sum + "个桃子");
			}
		
	}
}
class Taozi{	
	public int Taozi(int day){
		if(day == 10){
			 return 1;//已知第十天剩下的是1
		} else if(day >= 1 && day <= 9){ 
			return (Taozi(day + 1) + 1) * 2;
		} else {
			System.out.println("天数输入错误:");
			return -1;
		}
		
	}
}