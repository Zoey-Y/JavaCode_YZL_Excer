import java.util.Scanner;
public class MultipleCricles01{
	public static void main(String[] args){
		/*
		目标:
			1.统计个班成绩情况,每个班5名学生
			2.求出各个班的平均分
			3.求出所有班级平均分
			4.统计及格人数
		思路:
			1.输入并接收各个班级的学生成绩
			2.循环遍历1 ~ 3个班级
			3.在班级内部循环遍历学生人数
			4.以接收的成绩判断是否及格以此统计每个班及格人数
			5.每个班及格人数的结果累加起来以此来统计所有班级及格人数
		*/
		Scanner input = new Scanner(System.in);
		
		int claAll = 3;//班级数量
		int cla = 1;//一第个班级   
		int stuNum = 5;//每个班级的学生总数
		int stuFir = 1;//第一个学生
		double averStu = 0.0;//各班的平均成绩
		double averClass = 0.0;//所有班级的平均成绩	
		double sumStu = 0.0;//学生成绩之和
		double sumClass = 0.0;//班级成绩之和
		int count = 0;//统计及格人数
			for(int clasNum = cla;clasNum <= claAll;clasNum++){
				System.out.println("输入"+ clasNum +"班的5位学生成绩:");		
					
					for(int stu = stuFir; stu <= stuNum;stu++){
						
						double score = input.nextDouble();
								
								if(score >= 0 && score <= 100){
											switch((int)score / 60){
												case 1:
													count++;
													break;
												case 0:
													break;	
											}
							}else{
								System.out.println("你输入的分数不符合标准");
							}

							 sumStu += score;
					}
				 sumClass += sumStu;
				System.out.println(clasNum + "班的平均分:" + sumStu / stuNum);
			}
			System.out.println("所有班的平均分:" + sumClass / claAll);
			
			System.out.println("所有班级及格人数之和:" + count );


	}
}