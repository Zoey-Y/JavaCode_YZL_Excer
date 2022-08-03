public class OverLoadExcer01{
	public static void main(String[] args) {
		/*
			编写三个Method重载调用，方法名为m,
				1.第一个method接收一个int
				2.第二个method接收两个int
				3.第三个method接收一个字符串参数
			以Method上分别执行:
			    a.平方运算并输出结果
			    b.相乘并输出结果
			    c.输出字符串信息
		*/
		Method m = new Method();
		m.method(2);
		m.method(2,3);
		m.method("yaszbx;"); 
	}
}
class Method{
	//a.平方运算并输出结果    平方可以用i * i(保留整型),也可以用Math.pow(i,2)--->这个保留的是float类型   
	public void method(int i){
		System.out.println("方法1:" + i * i); 
	}
	//b.相乘并输出结果
	public void method(int n1,int n2){
		System.out.println("方法2:" + n1 * n2);
	}
	public void method(String w){
		System.out.println("方法3:" + w);
	}
}