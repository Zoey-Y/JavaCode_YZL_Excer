public class VarparameterExcer{
	public static void main(String[] args) {
		/*
			要求:有三个方法
			Method 1.返回姓名和两门课成绩(总分)
			Method 2.返回姓名和三门课成绩(总分)
			Method 3.返回姓名和五门课成绩(总分)
			以上方法封装成一个可变参数方法
		*/
		R r = new R();
		System.out.println("两门课的总分:");
		r.Record("李白",56,78);
		System.out.println("三门课的总分:");
		r.Record("好仔",67,89,56);
		System.out.println("五门课的总分:");
		r.Record("佬v",67,89,56,566,234);
	}
}
class R {
	public void Record(String name,int... score){
		int sum = 0;
		System.out.print("姓名: " + name + "\t"); 
		for(int i = 0;i < score.length;i++){
			sum += score[i];	
		}
		System.out.println("成绩: " + sum + " ");
	} 
}