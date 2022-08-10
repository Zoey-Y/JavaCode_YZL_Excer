public class OverLoad{
	public static void main(String[] args) {
		/*
			方法重载(与返回类型无关、与形参名无关，只与方法名和形参类型有关)
			1.calculate(int n1,int n2)
			2.calculate(int n1,double n2)
			3.calculate(double n1,int n2)
			4.calculate(int n1,int n2,int n3)
		*/
		Load c = new Load();
		System.out.println(c.calculate(23 , 3.2)); 
	}
}
class Load{
	//所有方法名都一样,都用于计算的所以方便记名起名统一用名
	//两个整型的计算
	public int calculate(int n1,int n2){
		return n1 + n2;
	}
	//int + double = double;
	public double calculate(int n1,double n2){
		return n1 + n2;
	}
	//两种不同类型的计算也一样
	public double calculate(double n1,int n2){
		return n1 + n2;
	}
	//三种同类型元素相加的情况
	public int calculate(int n1,int n2,int n3){
		return n1 + n2 + n3;
	}
}