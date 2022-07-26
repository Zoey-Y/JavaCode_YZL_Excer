import java.util.Scanner;
public class BubbleSort02{
	public static void main(String[] args) {
		/*
		要求:自己输入一个数组,并用冒泡排序排序
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("输入要创建的空间大小:");
		int len = input.nextInt();
		int[] arr = new int[len];
		System.out.println("输入成绩:");
		for(int i = 0;i < len;i++){				
			int score = input.nextInt();
			arr[i] = score;
		}
		System.out.println("打印未排序的成绩:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		//冒泡排序
		for(int i = 0;i < arr.length - 1;i++){
				for(int j = 0;j < arr.length - 1 - i;j++){
					int tmp = 0;
					if(arr[j] > arr[j + 1]){
						tmp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tmp;
				}
			}
		}
			
		System.out.println("打印排序后的成绩:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}

	}
}