import java.util.Scanner;
public class if01{
	public static void main(String[] ags){
		/*
		要求：
		   编写一个 可以输入人的年龄，如果该同志的年龄大于18岁，
		   则输出"你的年龄大于18,要对自己的行为负责",若小于18则输出"好好学习天天向上"
  		思路：
  		1.定义一个Scanner对象,接收输入的年龄
  		2.判断输入的年龄如果大于18,就输输出"你的年龄大于18,要对自己的行为负责"
  		  如果小于18，则输出"好好学习天天向上"
  		3.最后打印结果  
		*/
		Scanner input = new Scanner(System.in);//创建一个Scanner类方法 赋给input
		System.out.println("please entry your age >:");
		int age = input.nextInt();
		if( age >= 18 ){//&&短路用法,一假则假
			System.out.println("你的年龄大于18,要对自己的行为负责");
		}else if(age < 18 ){
				System.out.println("好好学习天天向上");
		}
	

	}
}