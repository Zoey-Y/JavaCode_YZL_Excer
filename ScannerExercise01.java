/*关于包，类的深入学习在后面*/
import java.util.Scanner;//导入java.util包下的Scanner类 ————> Step:1
public class ScannerExercise01{
	public static void main(String[] args){
		/*从控制台接收用户信息,[姓名,年龄,薪水]*/

		//new表示创建一个对象,这里是创建一个Scanner对象————>Step:2
		Scanner input = new Scanner(System.in);//input来接收创建的新类
		System.out.print("请依次输入\n 姓名 >:");
		//当执行到next()方法时光标会等待用户输入
		String name = input.next();//next()函数是接收用户输入的字符串
		System.out.print(" 年龄 >:");
		int age = input.nextInt();//nextInt()接收函数的int类型
		System.out.print(" 薪水 >:");
		double salary = input.nextDouble();//nextDouble()接收函数的Double类型
		System.out.println("姓名\t年龄\t薪水");
		System.out.println(name + "\t" + age + "\t" + salary );
		//重点记忆char的input写法
		char word = input.next().Atchar(0);
		System.out.println("输入的word是:" + word);
	}
}
