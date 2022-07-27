public class CopyAddress{
	public static void main(String[] args) {
		/*
		数组赋值机制二:
			地址拷贝/引用传递/引用赋值:
		知识点:
			1.数组在进行 引用传递 时, 是在 栈 中对 数组的地址 进行传递的.
			2.被数组地址传递了的数组,(其地址是与主动传递的数组地址一致) 所以改变其中元素时是共同改变的.
			3.这种传递方式数据空间不是独立的,也就造成了(2.)中一改则全改的局面
		*/
		int[] arr1 ={1,2,3};
		int[] arr2 = arr1;//把arr1的地址在栈中复制给了arr2,因此arr2就拥有了arr1地址内的所有元素并且arr2地址内元素位置与arr1一样
		System.out.println("改变前的arr2数组:");
		for(int j = 0;j < arr1.length;j++){
			System.out.print(arr2[j] + " ");

		}
		System.out.println("\n");
		System.out.println("改变前的arr1数组:");
		for(int j = 0;j < arr1.length;j++){
			System.out.print(arr1[j] + " ");

		}
		System.out.println("\n");

		//若arr2 改变其中一个值eg:
		arr2[1] = 10;//此时在堆中(&arr1 == &arr2)的第二个元素改变成了10,所以arr1的第二个元素耶跟着改变(因为地址相同所有改变相同)
		System.out.println("改变后的arr2数组:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n");
		System.out.println("改变后的arr1数组:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}


	}
}