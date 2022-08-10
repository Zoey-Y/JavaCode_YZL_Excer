import java.util.Scanner;
public class Method03{
	public static void main(String[] args) {
		/*
		需求:用成员方法把打印二位数组的功能实现
		优点:使自己的的代码重复性降低
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("输入二维数组的长度n:");
		int n = input.nextInt();
		System.out.println(); 
		//创建一个输入二维数组长度,进而打印直角三角形状的二维数组的工具T1
		Tool01 t1 = new Tool01();
		System.out.println("第一次二维数组打印:");
		t1.arrTow(n);
		System.out.println("第二次二维数组打印:");
		t1.arrTow(n);
		System.out.println("第三次二维数组打印:");
		t1.arrTow(n);
	}
}
//制定一个工具类
class Tool01{
	//成员方法制作二维数组
	//i:二维数组的下标  j:一维数组的下标 n:用Scanner把二维数组的长度输入出来
	public void arrTow(int n) {
		int[][] arr = new int[n][];//创建一个新二维数组
		for(int i = 0; i < arr.length;i++){
			arr[i] = new int[i + 1];//创建一维数组的空间 
									/*
									  0行 给 1空
									  1行 给 2空
									  2行 给 3空
									*/

			for(int j = 0;j < arr[i].length;j++){
				arr[i][j] = j + 1;
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

	}
}