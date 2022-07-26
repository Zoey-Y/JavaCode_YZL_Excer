public class CopyAssign{
	public static void main(String[] args) {
		/*
		数组赋值机制一:
		 	1.值拷贝赋值方式:

		*/
		int n1 = 100;
		int n2 = n1;//此处只在栈里把n1的值复制一遍给了n2
		n2 = 0;//只是将n2的值在栈中修改成了0,不改变n1的值
		System.out.println("n1 = " + n1 + "\t" + "n2 = " + n2);
	}
}