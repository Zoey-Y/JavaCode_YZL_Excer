import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args) {
		/*
		目标:判断一个年份是否为闰年
		思路:
			1.闰年符合:year能被400整除
			2.year能被4整除但不能与100整除
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个年份>:");
		int year = input.nextInt();
		
		int judge = year % 4 == 0 && year % 100 !=0? 1 : 0;
			switch(judge){
			case 1:
				System.out.println(year+"是闰年");
				break;
			case 0:
				if(year % 400 ==0){
					System.out.println(year + "是闰年");
				}	else{
					System.out.println(year + "不是闰年");
				}
				break;
			


			}
	}
}