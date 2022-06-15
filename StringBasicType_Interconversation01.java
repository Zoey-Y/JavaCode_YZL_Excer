public class StringBasicType_Interconversation01{
	public static void main(String[] args){
		/*BasicType——>String*/
		//GrammarIs:String s = BasicTypeName +"";eg:
		int i = 2;
		float f =1.9f;
		boolean b = false;
		String si = i + "";		
		String sf = f + "";		
		String sb = b + "";		
		System.out.println(si + sf  + sb);
		/*BasicType ——> String*/
		System.out.println("==============");
		String s = "30";
		//'.'点前面的是对应基本数据类型的包装类，'.'点后面是parase(解析)对应的基本类型
		// 基本类型包首字母要大写.parse解析成的类型也要大写
		//括号里()里的是字符串
		int s1 = Integer.parseInt(s);//30
		double s2 = Double.parseDouble(s);//30.0
		float s3 = Float.parseFloat(s);//30.0
		long s4 = Long.parseLong(s);//30
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}