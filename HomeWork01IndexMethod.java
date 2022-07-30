public class HomeWork01IndexMethod{
	public static void main(String[] args) {
		/*
		需求:有一个升序数组{10,12,45,90},在其中添加一个新值23,
			数组依然是一个升序数组,结果为{10,12,23,45,90}
		思路:(index法)
			1.先把新的值插入到数组对应位置
			  	利用index法:
			  		(1)将index = -1;其作用巧妙在于当找到了 (要插入的值 <= 数组中某个值时),该位置就是新值所要插入的位置
			  		(2)若找不到(要插入的值 <= 数组中某个值时),则说明要插入的值最大,以index == -1为起因,把新值的索引赋到数组最后,
			  		   就是90的下标是arr.length - 1,那90的后一个下标为arr.length.
			  		   所以 把新值赋给数组最后就是:index = arr.length
			  		(3)找到位置后马上break,就不用跟后面的比较了

			2.扩容
			3.遍历
				(1)扩容完之后新数组的下标表示i,旧数组的下标表示j，这样区分可以直接将新值插入到对应位置,
			   	   然后把旧数组中大的元素往后移动
			 	(2)要说明的是如何把新值插入新数组中:条件就是当判断到	(i == index;//新数组的下标 == 索引),才插入.

		化繁为简,先死后活
		*/
		int[] arr = {10, 12, 45, 90};
		//定义要插入的的值
		int insert = 23;
		//建立索引,为后来插入新值做下标,做条件
		int index = -1; 
				//遍历数组,以旧数组的下标为j
				for(int j = 0;j < arr.length;j++){
						/*判断插入的位置,并将其索引改成其插入位置的下标,
						  为数组扩容之后插入新值做准备
						*/
						if(insert <= arr[j]){
							index = j;
							break;//找到了就马上退出,以防再次循环后面的元素再插入一次
						}
				}
				//若在没有找到insert <= arr[j],说明insert在该数组中最大并没有进入上面的条件进而改变索引
				//索引可以利用依然index == -1;为条件把数组最后的那个位置给index
				if(index == -1){
					index = arr.length;
				}

		//接下扩容
		int[] arrNew = new int[arr.length + 1];
		System.out.print("输出新数组的升序结果:");
		for (int i = 0,j = 0;i < arrNew.length;i++ ) {
				if(index == i){
					arrNew[i] = insert;
				}else {
					arrNew[i] = arr[j];
					j++;//这里的j++的作用就是:若 索引 != 新数组的下标,就表示不是在这个地方插入新值,就j++往后赋值
						//若 索引 == 新数组的下标就插入到这个下标里去
						//插入完之后就数组的下标j依然还是上次进来的那个j,赋完值之后继续j++往后赋值 
				}
			System.out.print(arrNew[i] + " ");
		}


				
	}
}