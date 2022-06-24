public class BinaryTest{
	public static void main(String[] args){
		//二进制的定义法
		int binary =0b10010;
		//八进制的定义法
		int eight = 01572;//没个位里不能有8,因为到8进一
		//十六进制的定义法
		int sixteen = 0X149AF;
		//打印结果都以十进制呈现
		System.out.println(binary + "\n" + eight + "\n" + sixteen);
	}
}