public class HomeWork01{
	public static void main(String[] args) {
		/*
		目的:
			1.某人有100,000元,没经过以此路口,需要交费,规则如下:
			(1)当现金>50,000时,每次交5%
			(2)当现金<=50,000时,每次交1000
			编程计算该人可以经过多少次路口
			要求:使用while break方式完成
		*/
		/*//标准答案:
		double someone = 100000;//剩余钱数
		int count = 0;//统计通过路口的次数
		while(true){
			if(someone > 50000){
				someone *= 0.95;
				count++;
				System.out.println("----剩余钱数为:" + someone + "----次数为:" +count);
			}else if(someone >= 1000){
				someone -= 1000;
				count++;
				System.out.println("----剩余钱数为:" + someone + "----次数为:" + count);
			}else{
				
				break;
			}

		}
		System.out.println("100000的钱数可以路过" + count + "次路口" );*/
		





		/*//我的方法1:
		double someone = 100000;//某人开始有的钱数
		int stander = 50000;//收费准线
		double charge = 0;//不同收费准线范围的收费钱数
		int count = 0;//统计经过了多少次路口
						while(someone > stander){
							charge = someone*0.05;
							someone -= charge;//某人的钱减少了
							count++;
							System.out.println("你的路费为:" + charge + "----剩余钱数为:" 
												+ someone + "----次数为:" + count);
							
						}
						
						while(someone <= stander ){
							charge = 1000;
							someone -= charge;
							count++;
							System.out.println("你此时的路费为:" + charge + "----剩余钱数为:" 
												+ someone + "----次数为:" + count);
							if(someone < 1000){
								System.out.println("已经没钱付路费了白白~");
								break;
							}
							
						}
		System.out.println("你总共经过了" + count +"次路口");	*/	



		
		//我的方法2:	
		int stander = 50000;
			double charge = 0;
			int count = 0;
			for(double someone = 100000;someone > stander;someone -= charge){
				charge = 100000*0.05;
				count++;
							System.out.println("你的路费为:" + charge + "----剩余钱数为:" 
												+ someone + "----次数为:" +count);												
			}
			for(double someone = 100000;someone <= stander;someone -= charge){
				charge = 1000;
				count++;
							System.out.println("你此时的路费为:" + charge + "----剩余钱数为:" 
												+ someone + "----次数为:" + count);
							if(someone < 1000){
								System.out.println("已经没钱付路费了白白~");
								break;
							}
			}
		
			
	}
}