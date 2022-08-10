public class PropertiesDetail01{
	public static void main(String[] args) {
		/*
		介绍:属性的细节(初级阶段)
			1.访问修饰符 + 属性类型 + 属性名
			2.访问修饰负:控制属性访问范围的
			3.访问修饰符有:private、public、protected、默认
			4.属性如果不赋值会有默认值
		method:
			1.先声明再创建:
				Cat cat;
				cat = new Cat();
			2.直接创建:
				Cat cat = new Cat();
		访问属性
			eg:   cat.name = ...		
		*/
		//创建人类
	person p1 = new person();
	//new person创建一个人类空间,就是真正的对象
	//p1指向这个新的人类
	//直接使用默认修饰符的结果
	 System.out.println("不定义属性的结果:");
	 //这条看出p1与p2的最终改变就是p1,p2的最终结果
	person p2 = p1;
	p1.name = "pw";
	p2.name ="p2";
	System.out.println("p1.name =" + p1.name);
	System.out.println("p2.name =" + p2.name);
	}
}
class person{//声明一种类
	String name;
	int age;
	double ispass;
	/*
		String 在方法区中实现
		int 直接在堆中实现
		加载类信息在方法区中实现
	*/
}