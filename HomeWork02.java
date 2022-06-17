public class HomeWork02{
	public static void main(String[] args){
		/*用char类型分别保存\n \t \r \\ 1 2 3这些字符,并打印输出*/
		char c1 = '\n';
		char c2 = '\t';
		char c3 = '\r';
		char c4 = '\\';
		char c5 = '1';
		char c6 = '2';
		char c7 = '3';
		System.out.println("用char类型分别保存'\\n' '\\t' '\\r' '\\\' '1' '2' '3'这些字符的结果为：");
		System.out.println(c1); //换行
		System.out.println(c2); //制表
		System.out.println(c3); //回车
		System.out.println(c4); //输出一个\
		System.out.println(c5); //1
		System.out.println(c6); //2
		System.out.println(c7); //3
	}
}