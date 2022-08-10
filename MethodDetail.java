public class MethodDetail{
	public static void main(String[] args) {
		/*
			方法细节:
			1.一个方法可以有0个或多个参数,
			  中间由逗号隔开
			2.()括号内参数类型可以为任意类型,包含基本类型或引用类型
			  比如printArr(int[][] map)
			3.调用带参数的方法时,
			一定对应着参数列表传入相同类型或者兼容类型的参数
			4.方法定义的参数类型称:形参
			  方法调用时的参数类型称:实参
			  实参 和 形参 的类型要兼容,顺序和个数要一致
		*/
		//在主函数中创建一个个体R1,名字为methReArr
		R1 methReArr = new R1();
		//用数值来接收俩结果
		double[] result = methReArr.twoResult(2.1 , 3);//2.1 和 3为:实参
		//打印
		System.out.println("和 = " + result[0]);
		System.out.println("差 = " + result[1]);


	}
}
/*细节1:如何返回多个结果(用数组的方式)*/
//创建一个结果类R1
class R1{
	//当传参要传两个结果时可用数组
	public double[] twoResult(double s1,int s2){//s1 和 s2为:形参
		//创建一个长度为2的数组,存储两个数值
		double[] result = new double[2];
		//计算和
		result[0] = s1 + s2;
		//计算差
		result[1] = s1 - s2;
		return result;
	}
}
/*细节2:返回类型可以是任意类型(基本数据类型,引用类型包括数组、对象)*/
/*细节3:返回值 必须与 return 值类型兼容 
eg:
	public int f1()
	double b = 1.1;
	int n = 1;
	return n;//int ——> int自然可以
	若return b;//double ——> int 不行
*/
/*细节4:如果方法是void,可以不屑return,或者只写return
	    方法命名遵守驼峰命名法,最好见名知意
		eg:   getSum();
*/
/*
细节5:方法体:方法体内可以为
输入、输出、变量、运算、分支、循环、方法调用、
但里面不能在定义方法(方法内不能再嵌套定义)
eg:public void f1(){
	public void f2(){
	
	}
}
这样方法内部嵌套一个方法是不允许的,但是调用同一个类中方法可以可以
*/