public class ArithmaticOperate01{
	public static void main(String[] args){
		//ʹ����������������ӣ�

		//java���������,���ֻ������С����֮��Ҫ
		System.out.println(10 / 4);

		//10.0��double��,���:2.5
		System.out.println(10.0/4);
		
		//10 / 4 = 2(ȡ����)������Ϊdouble����2����>2.0
		double d = 10 / 4; 
		System.out.println(d);
		System.out.println("==================");

		//ȡ % ��ı���:��ʽ:a % b = a - a / b * b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-10 - (-10)/3 * 3 =-10 + 9 = -1
		System.out.println(10 % -3);//10 - 10/(-3) * (-3) =10 - 9 = 1
		System.out.println(-10 % -3);//(-10) - (-10) / (-3) * (-3) = (-10) + 9 =-1
		//java����С������ȡ������
		System.out.println(-10.1 % 3.2);//(-10.1) - (-10.1)/(3.2) * (3.2) = (-10.1)+9.6 =-0.4444..9

		System.out.println("==================");
		/*��i����ʹ��++i,i++,Ч������:i = i + 1,eg:*/
		int i = 1;
		i++;//2
		System.out.println(i);
		++i;//3,�ּ�һ��
		System.out.println(i);

		/*����Ϊ���ʽʹ��:
		++i ��++�ٸ�ֵ
	    i++ ���ȸ�ֵ��++
		*/
		int j =2;
		//��2+1=3�ٰ�3��ֵ��k
		int k = ++j;//k = 3��j = 3
		System.out.println("k = " + k +" j = " + j);
		int j2 = 2;
		int k2 = j2++;
		System.out.println("k2 = " + k2 + " j2 = " + j2);//k = 2,j2 =3

	}
}