public class ExerciseArray02{
	public static void main(String[] args) {
		/*
		目标:求出一个数组int[]的最大值{4，-1，9，10，23},并得到对应的下标
		*/
		int[] alNum ={4,-1,9,23,10};
		int max = alNum[0];//假设alNum[0]是最大值
		int count = 0;//接收最大值的下标
		for(int i = alNum.length - 1;i >= 0 ;i--){//从最后一个开始往前比			

			max = max > alNum[i]? max : alNum[i];
			int p = max > alNum[i]? 1 : 0;//判断最大值的下标:先看看比较的最大值是否变化
			//如果变化了就说明下标变了,count要接收这个下标,否则下标就是0
			switch(p){
				case 1:
					break;
				case 0:
					count = i;
					break;
			}
			
		}
		System.out.print("alNum数组的最大值是:" + max + "对应下标是:" + count);

	}
}