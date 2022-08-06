 import java.util.Scanner;
 public class InvokeMethodDe{
 	public static void main(String[] args) {
 		/*
 		方法调用细节:
 		*/
 		Scanner input = new Scanner(System.in);
 		System.out.print("enter your age:");
 		int age = input.nextInt();
 		System.out.println();

 		System.out.print("enter your name:");
 		String name = input.next();
 		System.out.println();

 		System.out.println("Did you having completed the programmes?");
 		System.out.print("yes enter 'y', no enter 'n':");
 		String i = input.next();
 		System.out.println();
 		//实例化对象
 		executor p1 = new executor();
 		p1.crePerson(age,name,i);//此时输入的都是实参
 	}
 }
 /*细节1:类executor 可以调用 类person中的方法
		1.在同一个类中调用方法可以直接调用
		2.在一个类中调用另一个类的方法
		  需要先实例化,再调用
 */
class person{
	//属性
	String name;
	int age;
	//方法
	public void task(String i,String name){
		if(i.equals("y")){
			System.out.println(name + " having completed this programmes.");
		}else if(i.equals("n")){
			System.out.println(name + " have not completing the programmes.");
		}else{
			System.out.println("you enter mistake");
		}
	}
}

class executor{	
	public void crePerson(int age,String name,String i){
		person creator = new person();//调用person类应该先实例化一个人
		creator.name = name;
		creator.age = age;
		System.out.println("名字:" + name + "\t" + "年龄:" + age);
		creator.task(i,name);//在这调用类person中的task方法
	}
}