public class Method01{
	public static void main(String[] args) {
		/*
		要求:
			1.添加一个成员方法
			2.添加一个speak成员方法,输出一个"我是好人"
		*/
			//方法使用
			//1.方法写好后,若不调用则不会输出
		person p1 = new person();
			//2.调用其方法即可
			p1.speak();//方法记得带括号
	}
}
class person{
	//成员变量(属性)
	String name;
	int age;
	//方法
	/*
		1.public: 表示方法是公开的
		2.void: 表示方法是没有返回值的
		3.speak(): 方法名,():叫形参列表
		4.{}:方法体,写我们要执行的代码

	*/

	public void speak(){
		System.out.println("我是好人");
	}
}