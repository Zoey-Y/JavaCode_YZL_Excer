public class PositionOperator02{
	public static void main(String[] args){
		/*
			1.(x >> y)算数右移:x的二进制数右移 y 个二进制位,相当于x的十进制除了y个2
			eg:System.out.println(1 >> 2); 
		*/
		System.out.println(1 >> 2); //00000001(向右移动2个二进制位)——>00000000
		                            //相当于1 / 2 / 2 = 0
		/*----------------------------------------------------------------------*/
		/*
			(x << y):算数左移:x的二进制数左移 y 个二进制位,相当于x的十进制乘了y个2
			同理eg:System.out.println(1 << 2);
		*/
			System.out.println(1 << 2);//00000001(向左移动2个二进制位)——>00000100
									   //相当于1 *  2 * 2 =4
        /*----------------------------------------------------------------------*/

		//同理求:System.out.println(5 << 3); 
			System.out.println(5 << 3); /*
											5: 00000101
											(5<<3):00101000 <==>5 * 2 * 2 * 2 == 40(5乘了3个2)
											最终结果:8 + 32 = 40
			                            */
		/*---------------------------------------------------------------------*/
			System.out.println(5 >> 2);/*
										5: 00000101
										(5>>2):00000001 <==>5 / 2 / 2 == 1(除了两个2)
										最终结果:1
										*/
	}
}