public class HomeWork01{
	public static void main(String[] args){
		/*
		例题:-10.5 % 4
		a % b当a为小数时 公式:a - (int)a / b * b
		                    -10.5 - (int)(-10.5) / 4 * 4
		*/
		System.out.println(-10.5 % 4);//-2.5
		/*-10.5 % 3.2
			公式:a - (int)a /(int)b * b
			    -10.5 - (-10) / 3 * (3.2) = -0.9
		*/
		System.out.println(-10.5 % 3.2);//-0.9

		/*注:小数位的这样的运算最终结果是其近似值*/

		int i = 66;
		System.out.println(++i+i);//i = i + 1 => i = 67(此时i重新被赋值了),其后i就是67,所以最后i + i ==67+67==134


		/*
		1.int num1 =(int)"18";//F:应该是Integer.parseInt("18");
		2.int num2 =18.0;//F 因为int < double,double转int不能自动转换
		3.double num3 = 3d;//T
		4.double num4 = 8;//T因为int < double,int 转 double能自动转换
		5.int i = 48;char ch = i+1;//F i+1为整型int,不能随便转换成char
		6.byte b = 19;short s =b+2;//F b+2跟上面一个道理 
		*/


		/*String 转换 double 的语句*/
		String words01 = "2.33";
		double D01 = Double.parseDouble(words01);
		System.out.println(D01);


		/*char 转换 String 的语句*/
		char c01 ='a';
		String words02 = c01 + "";
		System.out.println(words02);
	}
}