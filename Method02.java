import java.util.Scanner;
public class Method02{
	public static void main(String[] args) {
		/*
		目标:基本认识方法
			要求:添加一个cal01 成员方法,可以计算从1 + ... + 1000的结果
		*/
		Scanner input = new Scanner(System.in);	
		
		person p1 = new person();//声明
		//使用
		p1.cal01();
		p1.cal02(5);
		System.out.print("输入你要增值的次数:");
		int num02 = input.nextInt();
		System.out.println();

		p1.cal03(num02);
		System.out.println("输入你要撮合的俩数:");
		System.out.print("num1:");
		int num1 = input.nextInt();
		System.out.println();
		System.out.print("num2:");
		int num2 = input.nextInt();
		System.out.println();
		
		int returnSum = p1.cal04(num1,num2);
		System.out.println("撮合的两个数的结果:" + returnSum);
	}
}
class person{
	//事先把计算次数直接定义为1000
	public void cal01(){
		int sum = 0;
		for (int i = 1;i <= 1000;i++) {
			sum += i;			
		}
		System.out.println("sum = " + sum);
	}
	//定义时程序员在主函数中输入num
	public void cal02(int num) {
		int sum = 0;
		for(int i = 1;i <= num;i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
	//用户输入num02的情况
	public void cal03(int num02){
		int sum = 0;
		for(int i = 1;i <= num02;i++){
			sum += i;
		}
		System.out.println("自己输入增值次数的sum = " + sum);
	}
	//return的用处
	//在方法中使用return表明传回的数据要在主函数中使用才能被打印
	/*
	  解析:
	  	1.public:该方法公有
	  	2.int:指该方法返回的数据是int类型
	  	3.cal04:指该方法的名称
	  	4.(int,int):指形参列表中有俩形参,由用户传输
	  	5.return:指返回,功能就是返回要返回的数据到主函数中
	 */
	public int cal04(int num1,int num2){
		int sum = num1 + num2;
		return sum;
	}

}