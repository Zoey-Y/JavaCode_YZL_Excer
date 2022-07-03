public class ForDetail{
	public static void main(String[] args){
		/*
			for循环的写法细节:
				1.初始化、变量的迭代可以写外面
				int i = 1;
				for(;i < 3;){
					for循环内的代码块;
					i++;
				}
		*/
						
						/*
							补充:for循环的死循环写法,一般配合break使用否则危险！
								2.初始化、判断、变量迭代都不写只写俩分号
								for(;;){
									代码块;//执行后陷入无限循环按Ctrl+c退出
								}
						*/
						// int i = 1;
						// for(;;){
						// 	System.out.println("普雷楼盖" + (i++));
						// }

		
		/*
		for的循环初始化值、判断、迭代 都可以有多条语句
		只是需要用逗号隔开,并且类型相同
		*/
		// for(int i = 1,j = 0;i < 3; i++, j+=2){
		// 	代码块;
		// }
	}
}