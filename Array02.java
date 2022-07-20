import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		/*
			第一种动态分配方式:eg
			    double a[] = new double[3];//直接分配空间

			第二种动态分配方式:eg
			    double a[];//先声明数组
			    a = new double[3];//再分配空间
			    
			第三种静态初始化:eg
			    int a[] ={3,21,5,23};
			//如果知道具体值和元素个数，用法就相当于
			int a[] = new int[4];
			a[0] = 3;
			a[1] = 21;
			a[2] = 5;
			a[3] = 23;
		*/


		/*
			目标:深化(创建数组) 及 (Scanner) 之间的结合细节
			步骤:
			1.创建一个数组
			2.输入三个成绩保存到数组内
			3.输出出来
			(必须按照先输入再输出的顺序)
		*/

		//创建scanner(初始化Scanner)
		Scanner inputScore = new Scanner(System.in);
		
		//创建一个空间长度为3的double型数组(初始化数组)
		double[] scores = new double[3];
		//循环的是输入:
		for(int i = 0;i < scores.length;i++){
						switch(i){
						case 0:
							System.out.println("请输入英语成绩:");
							break;
						case 1:
							System.out.println("请输入数学成绩:");
							break;	
						case 2:
							System.out.println("请输入计算机成绩:");
							break;
						}

				//输入进来的inputScores成绩保存到double[i] mySores数组里		
				 scores[i] = inputScore.nextDouble();
				 			
		}
		//循环输出:
		for(int i = 0;i < scores.length;i++){
						switch(i){
						case 0:
							System.out.println("英语成绩:" + scores[i]);
							break;
						case 1:
							System.out.println("数学成绩:" + scores[i]);
							break;	
						case 2:
							System.out.println("计算机成绩:" + scores[i]);
							break;
						}
		}
	}
}