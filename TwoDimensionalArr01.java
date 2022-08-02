public class TwoDimensionalArr01{
	public static void main(String[] args) {
		/*
		目标:学习,研究二维数组
		要求:用二维数组输出以下图形
				0 0 0 0 0
				0 1 0 0 0
				0 0 2 0 0
				0 0 0 3 0
				0 0 0 0 4
		*/
		//初始化二维数组
		int[][] arr ={
					  {0, 0, 0, 0, 0},
					  {0, 1, 0, 0, 0},
					  {0, 1, 0, 0, 0},
					  {0, 0, 2, 0, 0},
					  {0, 0, 0, 3, 0},
					  {0, 0, 0, 0, 4},
					 };
			//遍历二维数组,只打印二维数组内每个一维数组
			for(int i = 0;i < arr.length;i++){
				System.out.println(arr[i] + " ");//打印出来的是二维数组内一维数组的地址
			}
			//遍历二维数组,打印二维数组内一维数组的值
			for(int i = 0;i < arr.length;i++){
				//这里的arr[i]指的是二维数组的第i个元素,这个元素是以为数组,用arr[i].length来表述这个二维数组内的一维数组的长度
				for(int j = 0;j < arr[i].length;j++){//这一层遍历一维数组内的元素
					System.out.print(arr[i][j] + " ");//可以解读成:二维数组中第i个元素内第j个元素
				}
				//在这里可以换行分层
				System.out.println("");
			}

	}
}