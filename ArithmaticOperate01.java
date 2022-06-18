public class ArithmaticOperate01{
	public static void main(String[] args){
		//使用算数运算符的例子：

		//java中整数相除,结果只得整数小数点之后不要
		System.out.println(10 / 4);

		//10.0是double型,结果:2.5
		System.out.println(10.0/4);
		
		//10 / 4 = 2(取整嘛)，又因为double类型2——>2.0
		double d = 10 / 4; 
		System.out.println(d);
		System.out.println("==================");

		//取 % 余的本质:公式:a % b = a - a / b * b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-10 - (-10)/3 * 3 =-10 + 9 = -1
		System.out.println(10 % -3);//10 - 10/(-3) * (-3) =10 - 9 = 1
		System.out.println(-10 % -3);//(-10) - (-10) / (-3) * (-3) = (-10) + 9 =-1
		//java中最小数可以取余运算
		System.out.println(-10.1 % 3.2);//(-10.1) - (-10.1)/(3.2) * (3.2) = (-10.1)+9.6 =-0.4444..9

		System.out.println("==================");
		/*若i单独使用++i,i++,效果都是:i = i + 1,eg:*/
		int i = 1;
		i++;//2
		System.out.println(i);
		++i;//3,又加一次
		System.out.println(i);

		/*若作为表达式使用:
		++i 是++再赋值
	    i++ 是先赋值再++
		*/
		int j =2;
		//先2+1=3再把3赋值给k
		int k = ++j;//k = 3，j = 3
		System.out.println("k = " + k +" j = " + j);
		int j2 = 2;
		int k2 = j2++;
		System.out.println("k2 = " + k2 + " j2 = " + j2);//k = 2,j2 =3

	}
}