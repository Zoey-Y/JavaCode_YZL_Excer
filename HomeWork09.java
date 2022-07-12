public class HomeWork09{
	public static void main(String[] args) {
		/*
		目标:求1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+100)的结果
		*/
		int sum = 0;
		for(int i = 1;i <= 100;i++){//有100个单元
			for(int j = 1;j <=1; j++){//第几个单元就加到几,用sum来收集以前的和
				sum += j; 
			}	
			
		}
		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+100)的结果为:" + sum);
	}
}