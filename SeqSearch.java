import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		/*
			需求:有一个数列:白眉、金毛、紫衫、青翼,从键盘输入输入一个名称
			,判断数列中是否包含此名称[顺序查找],若找到就提示找到,
			说明在第几个.

			思路:
				1.初始化数组
				2.创建Scanner来实现用户输入的名字
				3.for循环遍历数组
				4.判断你的Scanner是否与数组上的名字匹配,若有匹配就打印找到了,在第几个.
				5.若找不到利用索引找到的就改变索引的值,
				  找不到索引的值就改变不了进入索引未改变的判断之中,得到未找到这个名字
		*/

		//变成小技巧:用索引index来来判断俩字符串不相等时的可能性,因为俩字符串相等时index可以被改变成合理的下标
		int index = -1;

		//1.初始化数组
		String[] names = {"白眉", "金毛", "紫衫", "青翼"};
		int len = names.length;
		//2.创建Scanner,让用户输入名字
		Scanner input = new Scanner(System.in);
		System.out.println("输入要查询的名字:(白眉、金毛、紫衫、青翼)");
		String nameIn = input.next();

		//3.for循环遍历数组
		for(int i = 0;i < len;i++){
					//判断 nameIn 与 names里面的元素是否匹配
					if(nameIn.equals(names[i])){
						System.out.println("本数组中查询到你输入的名字:" + nameIn + "\n是本数组中的第" + (i+1) + "个名字");
						index = i;
						break;
					}/*这里由于是字符串的比较所以不能
						else {
							.......;
						}
							//应该用索引:当字符串相等时改变其索引值为该数组的下标,当索引没有改变,就意味着没有找到数组中有这个名字
					*/
		}
			if(index == -1){
							System.out.println("本数组中没有找到你想要的名字" + nameIn);
						}

	}
}