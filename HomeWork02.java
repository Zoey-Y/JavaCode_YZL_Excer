import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args) {
		/*
			目标:实现一个判断整数,属于哪个范围: >0 ; <0 ; =0
			思路:
				1.Scanner实现输入输出功能/或者利用(int)(Math.random)*100 + 1的方式来随机弄一个100以内的
				2.判断范围
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("请随便输入一个整数>:");
		int data = input.nextInt();//char word = input.next().At(0);
			if(data > 0){
				System.out.println("你输入的数大于0");
			}else if(data < 0){
				System.out.println("你输入的数小于0");
			}else if(data == 0){
				System.out.println("你输入的数等于0");
			}else{
				System.out.println("你输入的数不符合要求");
			}
	}
}