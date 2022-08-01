public class NewAddress{
	public static void main(String[] args) {
		/*
		数组赋值机制三:
			独立空间赋值:
			知识点:1.被地址赋值的数组(arr2)在被地址赋值(arr1的地址)之前要提前开辟一个新的独立空间(这样做是为了在改变arr2元素的时候不会影响arr1的元素值)
			      2.arr2创建完新的独立空间之后再把arr1的地址赋值给arr2,就实现了当arr2其中的元素改变后不会影响arr1内的元素值
		*/
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[arr1.length];//创建一个独立空间,大小为arr1一样的空间大小
		
		//把arr1中每个元素放到arr2的地址中
		for(int c = 0;c < arr1.length;c++){
			arr2[c] = arr1[c];
		}
		

		System.out.println("arr2[2]改变之前的arr1的值:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println("");

		System.out.println("arr2[2]改变之前的arr2的值:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");

		arr2[2] = 100;//改变arr2的第三个元素的值
		System.out.println("arr2[2]改变之后的arr1的值:");
		for(int j =0;j < arr1.length;j++){
			System.out.print(arr1[j] + " ");
		}
		System.out.println("");
		
		System.out.println("arr2[2]改变之后的arr2的值:");
		for(int j =0;j < arr1.length;j++){
			System.out.print(arr2[j] + " ");
		}
	}
}