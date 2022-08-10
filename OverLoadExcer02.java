public class OverLoadExcer02{
	public static void main(String[] args) {
	/*
		定义三个重载方法max()
		1.第一个方法max返回两个int值中最大值
		2.第二个方法返回两个double值中的最大值
		3.第三个分别返回三个double值中的最大值
		分别调用三个方法
	*/
		method m = new method();
		m.max(3,4);//4
		m.max(3.43,4.52);//4.52
		m.max(3.23,4.35,2.3);//4.35

	}
}
class method{
	public void max(int n1,int n2){
		int Max = n1 > n2 ? n1 : n2;
		System.out.println("两个int的最大值" + Max);
	}
	public void max(double n1,double n2){
		double Max = n1 > n2 ? n1 : n2;
		System.out.println("两个double的最大值" + Max);
	}
	public void max(double n1,double n2,double n3){
		double Max = n1 > n2 ? n1 : n2;
		Max = Max > n3 ? Max : n3;
		System.out.println("三个double的最大值" + Max);
	}
}