public class Return{
	public static void main(String[] args) {
		for(int i = 1;i <= 4;i++ ){
			for(int j = 1;j <= 5;j++){
				if(j == 2){
					System.out.println("要干啥");
			//当在方法中使用return,则表示跳出该方法
			//若在main方法中使用return,则表示直接退出程序		
					return;//此时直接在main方法中使用所以直接退出程序
				}
				System.out.println("wwww");
			}
			
		}
	}
}