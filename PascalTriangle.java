import java.util.Scanner;
public class PascalTriangle{
	public static void main(String[] args) {
		/*
		需求:使用二维数组打一个自己输入行数,打印该行数的杨辉三角形
		化繁为简:分析
			1				----------arr[0][0] == 1	
			1 1 			----------arr[1][0] == 1  ;  arr[1][1] == 1
			1 2 1 			----------arr[2][0] == 1  ;  arr[2][1] == 2  ; arr[2][2] == 1
			1 3 3 1 		----------arr[3][0] == 1  ;  arr[3][1] == 3  ; arr[3][2] == 3 ;arr[3][2] == 1
			1 4 6 4 1 	    ----------arr[4][0] == 1  ;  arr[4][1] == 4  ; arr[4][2] == 6 ;arr[4][3] == 4 ;arr[4][4] == 1  
			
			1.每行的第一个跟最后一个都是1
			2.按照i 行 j 列来看,arr[i][j] == arr[i - 1][j] + arr[i - 1][j - 1];
			3.第几行就有几个元素 
		*/
		/*化繁为简:
		int[][] arr = new int[5][];
		for(int i = 0;i < arr.length;i++){
			arr[i] = new int[i + 1];
			for(int j = 0;j < arr[i].length;j++){
				if(j == 0 || i == j){//如果某行的第一个或者某行的最后一个元素的话则判为0
					arr[i][j] = 1;
				}else {//其它的就按照(2点)的意思来
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}*/



		System.out.print("输入你需要的杨辉三角的行数:");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		int[][] arr = new int[user][];//为二维数组创建一个新空间
		for(int i = 0; i < arr.length;i++){
			arr[i] = new int[i + 1];//一维数组:是多少行就有多少空间(3点)
			for(int j = 0;j < arr[i].length;j++){//遍历其内部的一维数组的元素(不造有多少个元素)
				if(j == 0 || i == j){
					arr[i][j] = 1;//(1点)
				}else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];//(2点)
				}
				System.out.print(arr[i][j] + " ");//打印写在这是循环好一次立马打印
			}
			System.out.println("");
		}

		//若在这再一次for循环打印是等他循环好了再打印
		

	}
}