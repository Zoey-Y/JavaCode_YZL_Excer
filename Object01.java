public class Object01{
	public static void main(String[] args) {
		/*
			要求:定义一个人类,并实例化
		*/
		//实例化一个人
		Person p1 = new Person();
		p1.age = 22;
		p1.name = "yzl";
		p1.weight = 65.3;
		System.out.println("我的年龄:" + p1.age + "\n" + 
					   "我都名字:" + p1.name + "\n" +
					   "我都体重:" + p1.weight  + "公斤" + "\n");
	}
	
}
//定义一个人类特征(属性、行为[先不写行为还没学])
class Person{
	//属性
	int age;
	String name;
	double weight;
	//行为
}