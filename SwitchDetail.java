public class SwitchDetail{
	public static void main(String[] args){
		/*
		细节1:
		   (case后的常量类型) 一定要与 (表达式数据类型) 一致 
		   或者 (case后常量的类型) 可以自动转化成 (表达式的数据类型)
		*/

//代码部分:-----------------------------------------------------------------------------------------------
			char c ='a';
			switch(c){
			case 'a'://case + 字符型常量
				System.out.println("字符'a'的字符类型常量在这符合规格");
				break;
			case 20:
				System.out.println("20在此是整型常量,char类型可以自动转化成int型,所以20在这也符合规格");
			default:
				break;
			}
//=======================================================================================================

		/*
		细节2:
			case后的整型常量类型 不能转换成 String的表达式数据类型
		  eg:
		    String s = "a";
		    Switch(s){
				case "a":
				System.out.println("case后的常量类型 对应的是 表达式的 类型自然成立 因为都是字符串类型嘛~");
				case 20:
				System.out.println("此时这个case后的整型常量20就不行,因为int不能自动转换成String类型");
				case "20":
				System.out.println("若这个20写成了字符串的话就行,即--->"20"  ");	
		    }	
		*/	
//========================================================================================================


			/*
			细节3:
				switch(表达式)中的表达式的返回值必须是:(byte、short、int、char、String)类型
			 eg:(错误示范)
				double d = 1.1;
				switch(d){//错误原因:因为括号里的表达式类型是double型不属于(byte、short、int、char、String)中任何一种类型的范围
					case 1.1:
						System.out.println("即使case后的常量类型与表达式一致,但错在了使用了其它的数据类型");
				}
			*/
//-------------------------------------------------------------------------------------------------------
			/*
			细节4:
				case子句中的值必须是常量(或者说是常量表达式),不能是变量
			 eg:
			 	char c ='a';
			 	switch(c){
					case 'a':
						System.out.println("case后跟'a'就对,因为'a'是常量");
					case c:
						System.out.println("case后跟c就不对,因为c是变量");
					case 'a' + 1:
						System.out.println("这样也可以,此为常量表达式");	
			 	}	
			*/
//=======================================================================================================
			/*
			细节5:
			default可根据实际情况可写可不写,若不写则所有情况不符合的时候啥也不输出
			*/	
//=======================================================================================================
			/*
			细节6:
			当遇到了break时则跳出switch语句，没有遇到在继续执行
			*/					

	}
}