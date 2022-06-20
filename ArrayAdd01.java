/*方法有误:
		int[] arr ={1,2,3};
		int len = arr.length;//arr1的长度
		int[] arrNew = new int[len + 1];//创建一个新的加大了一个空间的数组
		int lenNew = arrNew.length;
			for(int i = 0;i < len;i++){
					arrNew[i] = arr[i];
			}

			arrNew[lenNew - 1] = 4;//将新的数组最后一个空间赋值4
			arr = arrNew;//将arrNew赋给arr1,原先的arr1自动销毁
			System.out.println("数组空间增加后的结构:");
			for(int i = 0;i < len;i++){
				System.out.print(arr[i] + " ");
			}
		*/
import java.util.Scanner;
public class ArrayAdd01{
	public static void main(String[] args){
		/*
		要求:实现动态的给数组添加元素效果,实现对数组扩容
			(1)原始数组使用静态分配int[] arr = {1,2,3};
			(2)增加的元素4,直接放在数组的最后arr = {1,2,3,4};
			(3)是否继续添加,y/n
		思路:
			1.初始化原本的数组
			2.创建一个新的数组来增加一个新的空间; int[arr1.length + 1]
			3.arrNew接收arr1的元素,还多出一个空间那就接收新的元素4//最后的一个空间来接收新的arrNew[arrNew.length-1] = 4
			4.将arrNew赋给arr1,原先的arr1就被销毁
			5.引入Scanner接收y/n
			6.因为至少执行一次所以我才用do_while方法循环
			7.若用户选择y就继续true,若选择n就break跳出循环,若用户乱输出就default其它情况让你重新输入(我想要switch方法判断)
		*/
		
//1~4都先得执行至少一次所以用do_while
		Scanner input = new Scanner(System.in);
	    do{
					int[] arr = {1,2,3};

					//建立一个新的数组开辟新的空间,此空间比原来的大一
					int[] arrNew = new int[arr.length + 1];

					//次循环是先将原来的数组元素赋给新开辟的数组
					for(int i = 0;i < arr.length;i++){
						arrNew[i] = arr[i];
					}

					System.out.println("输入要添加的数组:");
					int myNum = input.nextInt();
					//新开辟的数组不是还多一个空间来存放新的元素吗~,奴~就这样存放
					arrNew[arrNew.length - 1] = myNum;
					//这一步就是把新的数组赋给旧的数组,旧的数组就此销毁,此后旧的数组想增加新的数就在此基础上增加
					arr = arrNew;
					//打印效果
					System.out.println("====arr扩容之后元素情况====");
					for(int i = 0;i< arr.length;i++){
						System.out.print(arr[i] + " ");
					}
					//判断用户是否继续添加
					System.out.println("是否继续添加y/n");
					char user = input.next().charAt(0);
					switch(user){
							case y:
								user = 0;
								break;
							case n:
								user = (int)1;
								break;
							default:
							   System.out.println("输入错误,再次输入");
							   char user = input.next().charAt(0);
							   continue;
					}

	       }while(true);
	       System.out.print("数组添加结束~");

	}
}