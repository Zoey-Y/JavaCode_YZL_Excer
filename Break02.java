public class Break02{
	public static void main(String[] args){
		/*
		目标:
			     1-100以内的数求和,求出 当和 第一次 大于 20的当前数
		思路:   
			     1.循环1-100以内的数,求和sum
			     2.sum > 20时,记录当前数后break
		*/
	int sum = 0;	
		for(int num = 1; num <= 100;num++){
			sum +=num;
				if(sum > 20){
			   		System.out.println("第一次大于 20 的当前数是:" + num);
					break;		
				}
		}
	}
}