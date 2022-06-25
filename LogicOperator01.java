public class LogicOperator01{
	public static void main(String[] args){
		/*&&的短路现象:两真则真,一假则假*/
		/*对于&则无短路现象,第一个为false，后面仍然判断*/
	int logic01 = 30;
	System.out.println(logic01 > 20 && logic01 <100);//两真则真
	System.out.println(logic01 > 40 && logic01 <100);//一假则假
	if( logic01 < 1 && ++logic01 <32 ){
		System.out.println("&&的短路效应,第一个为假,后面就不执行,所以++logic01不执行.");
	}
	System.out.println("logic01 = " + logic01);
	/*||的短路现象:一真则真,两假则假*/
	int logic02 = 40;
	System.out.println(logic02 > 10 || logic02 < 10);//一真则真
	System.out.println(logic02 > 60 || logic02 < 10);//两假则假
	
	}
}