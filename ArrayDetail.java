public class ArrayDetail{
	public static void main(String[] args) {
		//1.�����Ƕ����ͬ�������͵����ݼ��ϣ�ʵ�ֶ���Щ���ݵ�ͳһ����
		int[] arr1 = {1,2,3};//��������ȫΪ�����������ݾ���
		// int[] arr2 = {1.1,3,43,23};//1.1Ϊdouble�� > int ���Բ����ԣ���
		double[] arr2 = {1.1,3,43,23};//��������int�ŵ�double��
		
		


		//2.�����е�Ԫ�ؿ������κ���������,���������������ͺ���������,�������Գ��ֻ��ʹ��
		String[] arr3 = {"�ٰ�","saw"};
		


		/*3.���鴴����Ҫ��û�и�ֵ,����Ĭ��ֵ
			(int��short��byte��long)Ĭ��Ϊ������>0
			(float��double)Ĭ��Ϊ��������>0.0
			(cahr)Ĭ��Ϊ��������>\u0000
			(boolean)Ĭ��Ϊ��������>false
			(String)Ĭ��Ϊ��������>null
		*/
		short[] arr4 = new short[3];
		System.out.println("======����arr4ֻ���г�ʼ����������:=====");
		//������ӡ���鿴������ʲôֵ��
		for(int i = 0;i < 3;i++){
			System.out.print(arr4[i]);
		}
 
	}
}