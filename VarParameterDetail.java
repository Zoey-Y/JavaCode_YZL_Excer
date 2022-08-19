public class VarParameterDetail{
	public static void main(String[] args) {
		//细节1:可变参数可以为数组
		int[] arr ={1,2,3};
		T t = new T();
		t.D1(arr);

			
		
	}
}
class T{
	public int D1(int... nums){//nums是地址,可变参数的本质就是数组
		
		System.out.println("可变参数可以为数组");
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		return 0;
	}
	//细节2:可变参数可以与普通类型的参数放在一起,但是可变参数要放在最后
	/*public void D2(double...nums,string str){
		//这是错误写法
	}*/
	//正确写法:
	public void D2(String str,double... nums){
		//可变参数在普通类型参数后面这才正确
	}


	//细节3:每个方法只能有一个可变参数
	/*public void D3(double... nums1,int... nums2){
		//错误写法	
	}*/
	public void D3(double... nums1){
			//这才对
	}

}