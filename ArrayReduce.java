import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args) {
		/*
		要求:有一个数组{1,2,3,4,5},可以将该数组进行缩减
		     提示用户是否继续缩减,每次缩减最后一个元素。
		     当缩减至最后一个元素时提示不能再缩减了
		 思路:
		 	1.初始化一个arr数组{1,2,3,4,5}
		 	2.创建一个比原数组少一个空间的数组[arr.length - 1]
		 	3.for循环将新的数组赋值到旧的数组里
		 	4.将新的数组地址给新数组地址(为了更新减少过后的数组空间)

		 	5.是否继续缩减空间do_while
		 	6.减少到组后一个空间则不继续缩减

		 */
		Scanner input = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
				do{
					    //都得不断更新数组空间
						int[] arrN = new int[arr.length - 1];
						//判断数组长度等于1不,等于1就不执行减少空间
						if(arrN.length != 1){
						System.out.println("空间减少之后的结果:");
						//减少空间的操作
							for(int i = 0;i <= arrN.length - 1;i++){
									arrN[i] = arr[i];
							}
							arr = arrN;//把新的赋给旧的
						}
					
						//打印输出
						for(int i = 0;i <= arrN.length - 1;i++){
							System.out.print(arr[i] + " ");
						}
						System.out.println("是否继续减少空间y/n");
						char user = input.next().charAt(0);
								if(user == 'n'){
									break;
								}else if(user == 'y'){
									continue;
								}else{
									System.out.println("乱输入！输入直接结束");
									break;
								}

					}while(true);
					System.out.println("已经退出了");
		

			
		
	}
}