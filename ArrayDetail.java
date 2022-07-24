public class ArrayDetail{
	public static void main(String[] args) {
		//1.数组是多个相同数据类型的数据集合，实现对这些数据的统一管理
		int[] arr1 = {1,2,3};//这样里面全为整型类型数据就行
		// int[] arr2 = {1.1,3,43,23};//1.1为double型 > int 所以不可以！！
		double[] arr2 = {1.1,3,43,23};//这样就行int放到double里
		
		


		//2.数组中的元素可以是任何数据类型,包括基本数据类型和引用类型,但不可以出现混合使用
		String[] arr3 = {"嘿唉","saw"};
		


		/*3.数组创建后要是没有赋值,会有默认值
			(int、short、byte、long)默认为———>0
			(float、double)默认为————>0.0
			(cahr)默认为————>\u0000
			(boolean)默认为————>false
			(String)默认为————>null
		*/
		short[] arr4 = new short[3];
		System.out.println("======数组arr4只进行初始化数组的情况:=====");
		//遍历打印数组看看会是什么值？
		for(int i = 0;i < 3;i++){
			System.out.print(arr4[i]);
		}
 
	}
}