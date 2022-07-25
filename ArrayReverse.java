public class ArrayReverse{
	public static void main(String[] args) {
		/*
		要求:把arr数组{1,2,3,4} 反转成 {4,3,2,1}

		思路:(栈内反转)
			1.arr[0] = arr[3];
			  arr[1] = arr[2];
			2.反转次数arr.length / 2 = 2;
			3.arr[0] = arr[arr.length - 1 - i];//i是下标
			  arr[0] =      arr[ 4	  - 1 -	0 = 3]
		 */
		int[] arr = {1,2,3,4};
		int tmp = 0;//临时存放arr[i]
		int len = arr.length;
		System.out.println("反转前的arr:");
		for(int j = 0 ;j < len;j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println("");
		//开始反转
		for(int i = 0;i < len / 2;i++){//交换次数的计算
			  tmp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = tmp;
		}

		System.out.println("反转后的arr:");
		for(int i = 0;i < len;i++){
			System.out.print(arr[i] + " ");
		}

	}
}