import java.util.Scanner;
public class TwoDimensionalArr02{
	public static void main(String[] args) {
		/*
		要求:自己探究的二维数组
			1.自己输入(1,1 2,1 2 3),最后打印一个
			    1
			    1 2
			    1 2 3
			的图像.    
		*/
		Scanner input = new Scanner(System.in);

		//创建一个只知道二位数组的元素数量不知道每个一维数组的元素的数量
		int[][] arr = new int[3][];

		//遍历二维数组
		for(int i = 0;i < arr.length;i++) {
			arr[i] = new int[i + 1];//i = 0——>给1个空间； i = 1 ——>给2个空间 ......//这里一个空间四个字节(因为是int)
									//arr[i]指的是某一个一维数组,在这new一个是为了为这个一维数组开创一个新的空间 
									//创建一个新的一维数组这样的eg: int[] arr = new int[3];
						System.out.print("输入第" + (i + 1) + "个数组的数字:");
						//遍历内部一维数组,以赋值的方式赋予元素
						for(int j = 0; j < arr[i].length;j++) {//arr[i].length就是里面一维数组的空间大小
							arr[i][j] = input.nextInt();//给这里面的一维数组赋予值
						}
			}

			//打印结果
			System.out.println("打印结果是:");
			for(int i = 0;i < arr.length;i++){
				for(int j = 0;j < arr[i].length;j++){
					System.out.print(arr[i][j] + " ");
				}		
				System.out.println("");//换行,之后再执行二维数组的第二个元素(也就是第二个一维数组)
		}
	}
}