public class HomeWork06{
	public static void main(String[] args) {
		/*
			目标:输出1~100之间的不能被5整除的数,每5个一行
		*/
				int count = 0;//统计每行个数
				for(int i = 1; i <= 100;i++){
						
							if(i % 5 != 0){//计算不能被五整除的数
									System.out.print(i + " ");
									count++;
							}
							count %= 5;//计算每行个数
							switch(count){
							case 0:
								System.out.println("");//我自己能想到这简直大聪明
							default:
								break;
							}
						
				}
	}
}