public class HomeWork02{
	public static void main(String[] args) {
		/*
		要求:
			1.随机生成10个整数(1~100)保存到数组,
			2.倒序打印
			3.求平均值
			4.求最大值和最大值的下标
			5.查找里面是否有8
		*/
		//随机生成十个数之前,先创建空间
			int[] arr = new int[10];
						//求平均值
						int sum = 0;
						int aver = 0;
				for(int i = 0;i < arr.length;i++){
					arr[i] = (int)(Math.random()*100 + 1);//0.00*100=00 + 1 = 1~99的数
					sum += arr[i];
				}
						aver = sum / arr.length;
						System.out.print("随机生成的平均值值为:" + aver);
						System.out.println();

			//正序
			System.out.println("数组的正常顺序:");
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			//倒序			
			System.out.println("数组倒序结果:");			
			for(int i = arr.length - 1;i >= 0;i--){
				System.out.print(arr[i] + " ");
			}		
			System.out.println();

			//求最大值 和 最大值的下标
			int max = arr[0];
			int index = -1;//记录下标
			for(int i = 1;i < arr.length;i++){	
						if (max < arr[i]) {
							max = arr[i];
							index = i; 	
						}
						
			}
			System.out.println("正常顺序下的最大值:" + max);
			System.out.println("正常顺序下的最大值的下标：" + index);

			//查找数组里是否有8
			int findEeight = -1;
			for(int i = 0;i < arr.length;i++){
				if(arr[i] == 8){
					findEeight = 1;
				}
			}
			if(findEeight == -1){
				System.out.println("该数组内没8");
			}else {
				System.out.println("该数组内有8");
			}


		//倒叙打印(反冒泡)i为组数,j为次数
			//判断前面的那一个数 比 后面的那一个数小 就交换
			for(int i = 0;i < arr.length - 1;i++){
				for(int j = 0;j < arr.length - 1 - i;j++){//sifting the smallest num into the far right
						int tmp = 0;
						if(arr[j] < arr[j + 1]){
							tmp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1]= tmp;
						}

				}
			}
				System.out.println("最近生成的值大到小排序的打印:");
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " ");
			}	
				
	}
}