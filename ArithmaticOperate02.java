public class ArithmaticOperate02{
	public static void main(String[] args){
		//假如还有59天放假,问:还有几个星期零几天?
		/*
		1.了解需求
		2.思路分析
		  (1)知道有59天,用一个变量存储这59天,int total = 59;
		  (2)计算星期,59 / 7,用一个变量存储星期,int week = total / 7;
		  (3)计算多出的天数,用一个变量存储天数,int day = total % 7;
		3.最后写代码
		*/
		int total = 59;
		int week = total / 7;
		int day = total % 7;
		System.out.println("还有" + week + "个星期" + "多" + day + "天就放假了");
	}
}