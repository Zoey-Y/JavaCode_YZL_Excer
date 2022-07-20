public class Array01{
	public static void main(String[] args) {
		/*
		题目:养鸡场养有六只鸡,分别重3kg,5kg,1kg,3.4kg,2kg,50kg.
			1.求六只鸡的总体重
			2.求平均体重
		引出为什么使用Array的思路:
			1.逐个定义鸡的重量
			2.再求总体重和平均体重
			总结:这样一个一个定义效率低,因此学习数组技术更方便和有必要
			*/
		/*//逐个定义鸡的重量
		double hen1 = 3;
		double hen2 = 5;
		double hen3 = 1;
		double hen4 = 3.4;
		double hen5 = 2;
		double hen6 = 50;

		//求鸡的总重量
		double alWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		//求平均重量
		double averWeight = alWeight / 6;
		System.out.println("鸡的总重量:" + alWeight +"kg"
						+ "鸡的平均重量:" + averWeight +"kg");*/

		//用数组的方式
		//用数组把所有相同元素包含在一起
		double hens[] ={3,5,1,3.4,2,50,43};
		//用( 数组名.length )表示数组长度
		System.out.println("hens数组的长度是:" + hens.length);
		double alWeight = 0;
		//遍历所有元素
		for(int i = 0;i < hens.length;i++){
			//用hens[下标](下标从0开始编号的)的形式指出数组内的元素
			System.out.println("第"+ (i+1) + "个鸡的重量是:" + hens[i]);
			 alWeight += hens[i];//对鸡的重量求和
		}
		System.out.println("总体重:" + alWeight + "平均体重:" + (alWeight / hens.length));

	}
}