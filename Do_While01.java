import java.util.Scanner;
public class Do_While01{
	public static void main(String[] args){
		/*
		目标:
			1.如果李三不还钱,老韩就一直用五连鞭
			2.除非李三说还钱
			[要求:用do..while方法]
		思路:
			1.老韩先使出五连鞭,再一直问李三还不还钱
			2.接收李三的回答
			3.判断李三的回答是否还钱
			4.是 则循环不通过
			5.否 则循环继续
		*/
		Scanner input = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("老韩使出了五连鞭");
			System.out.println("老韩问:还不还钱>:y/n");
			//接收回答,这里的answer不可以再此处定义,while会接收不到,应该在循环外部定义，循环内部赋值
			answer = input.next().charAt(0);	

					if(answer != 'y' && answer != 'n'){
						System.out.println("你的回答不正经继续打");
					}

		}while(answer != 'y');
		System.out.println("由于你说要花钱所有暂时不打了");

	}
}