public class Break01{
	public static void main(String[] args) {
		/*
		目标:
			1.随机生成一个1 ~ 100 的随机数,直到生成97,
				看看一共产生了多少次随机数
			    提示使用:(int)(Math.random()*100)+1 来产生随机数
		*/

		//统计产生的随机数数量,若在循环内定义就循环初始化,没有了统计效果
		int countR = 0;
		for(;;){//while(true)也行
			//循环产生随机数
			int random = (int)(Math.random()*100 + 1);
			
				if(random != 97){
					System.out.println(random);
					countR++;
				}else{
					System.out.println(random);
					countR++;
					break;	
				}

		}
		System.out.println("一共随机了:" + countR);
	}
}