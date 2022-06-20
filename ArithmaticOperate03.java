public class ArithmaticOperate03{
	public static void main(String[] args){
		/*定义一个变量保存华氏温度,华氏——>摄氏的公式:
		  摄氏度 = 5 / 9 * (华氏温度 - 100)
		  请求出[234.5]的华氏温度 对应的 摄氏温度。	
		*/
		/*
		1.了解需求
		2.分析思路:
			(1)定义[234.5]华氏度的变量,double degreeF = 234.5;
			(2)利用公式计算华氏度——>摄氏度,double degreeC = 5 / 9 * ( degreeF - 100 );
		3.走代码
		*/
		double degreeF = 234.5;
		double degreeC = 5.0 / 9.0 * ( degreeF - 100.0 );
		System.out.println("234.5F 对应的 摄氏度为:" + degreeC + "C");
	}
}