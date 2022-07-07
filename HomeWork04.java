import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args) {
		/*
		目标:判断一个整数是否为水仙花(一个3位数),
	        其各个位上数字立方和等于其本身.
	        eg:153 = 1*1*1 + 3*3*3 + 5*5*5
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("输入一个整数>:");
		int num = input.nextInt();
		int cmp = num;	
		int sum = 0;
		while(num > 0){
			sum += (num % 10) * (num % 10) * (num % 10);
			num /= 10;
		}
		if(cmp == sum){
			System.out.println(cmp + "是水仙花");
		}else{
			System.out.println(cmp + "不是水仙花");
		}

	}
}