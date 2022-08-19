public class VarParameter{//variable parameter:可变参数
	public static void main(String[] args) {
		/*
			可变参数概念:Java允许将 同一个类中，多个 同名、同功能，
			但是参数数量不同的方法,封装成一个方法。
		例如:我们要分别实现两个整型相加，三个整型相加    
			(语法: 访问修饰符 + 返回类型 + 方法名(数据类型...形参名){方法体})
			一般的方法:
			  class T{
				public int sum(int a,int b){
					return a + b;
				}
				publc int sum(int a,int b,int c){
					return a + b + c;
				}
				//若是三个四个....参数相加就要写很多很麻烦,因此引出了variable parameter
			  }          
		*/
		T t = new T();
		System.out.println(t.Var(1,4));
	}
} 
class T{
			  	//解释:
			  	//int...表示接收的是可变参数,类型是int(即是可以接收0个至多个int参数)
					public int Var(int...nums){//nums是空间的地址啦
						int sum = 0;
						System.out.println("接收到了" + nums.length + "个参数");
						for(int i = 0;i < nums.length;i++){
							 sum += nums[i];
						}
						return sum;
					}
			  }