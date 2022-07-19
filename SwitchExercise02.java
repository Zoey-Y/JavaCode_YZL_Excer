import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		/*
		目标:
			1.根据指定月份,打印所属月份的季节
			2.  3,4,5月份是春季
				6,7,8月份是夏季
				9,10,11月份是秋季
				12,1,2月份是冬季
		思路分析:
			1.利用Scanner输入并接收月份
			2.判断所输入的月份是否符合要求,若不符合则报错
			3.若符合则继续执行,利用switch结构判断所属月份的季节
			4.打印结果
		*/
	Scanner input = new Scanner(System.in);
	System.out.println("请输入当前月份");
	int month = input.nextInt();
					switch(month){			     //使用穿透
												/*
													3,4,5月份是春季
													6,7,8月份是夏季
													9,10,11月份是秋季
													12,1,2月份是冬季		
						 						*/
					case 3:
				 	case 4:
				 	case 5:
				 		System.out.println("当前季节为春季");
				 		break;
				 	case 6:
				 	case 7:
				 	case 8:
				 		System.out.println("当前季节为夏季");
				 		break;
				 	case 9:
				 	case 10:
				 	case 11:
				 		System.out.println("当前季节为秋季");
				 		break;
				 	case 12:
				 	case 1:
				 	case 2:
				 		System.out.println("当前季节为冬季");
				 		break;		
					
				    default :
					System.out.println("你输入的月份有误不在范围(1~12)月份");
					break;
					}
	}
}