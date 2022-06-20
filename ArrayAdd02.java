import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args) {
		/*
		要求:实现动态的给数组添加元素效果,实现对数组扩容
			(1)原始数组使用静态分配int[] arr = {1,2,3};
			(2)增加的元素4,直接放在数组的最后arr = {1,2,3,4};//化繁为简:后来在变成自己想加的数
			(3)是否继续添加,y/n
		思路2:
			1.先将原始数组初始化
			2.创建新的数组,空间大小比原始数组大一
			3.先将就数组里的元素赋给新数组
			4.再将新数组多出来的哪一个元素空间附上新的值(4)
			5.最后把新的数组赋给旧的数组(这样就可以连带新的元素空间赋给旧的数组空间)
			6.打印

			7.因为是先执行1~5的步骤(必须要执行一次的步骤),再问要不要继续,所以用do_while的方法
			8.创建一个Scanner接收我想加的数字  
			9.判断我是否继续增加新元素的意愿y/n
			
		*/
//8.创建Scanner接收器
		Scanner input = new Scanner(System.in);
		//1.先将原始数组初始化
		int[] arr = {1,2,3};
//7.用do_while方法
		do{
			
					//2.创建一个新数组大小比arr大一
					int[] arrNew = new int[arr.length + 1];
					//3.先将arr里的数赋给arrNew
					for(int i = 0;i < arr.length;i++){
						arrNew[i] = arr[i];
					}
					//4.将新数组多出的空间赋值上一个新值4(稍后再化繁为简)
						
						//8.化繁为简:让用户输入他想要的值
						System.out.print("输入你要的值:");
					    int userNum = input.nextInt();
					arrNew[arrNew.length - 1] = userNum;//7.将用户输入的新值给到arrNew最后一个空间

					//5.把新数组赋给旧数组,新数组地址进行赋值就可以了
					arr = arrNew;
					//6.打印新增新元素后的数组结果
					for(int i = 0;i < arr.length;i++){
						System.out.print(arr[i] + " ");
					}
					//9.询问用户是否继续添加新元素
					System.out.println("是否继续添加新元素y/n");
					char userWant = input.next().charAt(0);
					//9.判断用户是否添加新元素
					if(userWant == 'n'){
						break;
					}

				}while(true);
				
				System.out.println("已经结束添加");


	}
}