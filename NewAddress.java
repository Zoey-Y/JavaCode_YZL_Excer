public class NewAddress{
	public static void main(String[] args) {
		/*
		���鸳ֵ������:
			�����ռ丳ֵ:
			֪ʶ��:1.����ַ��ֵ������(arr2)�ڱ���ַ��ֵ(arr1�ĵ�ַ)֮ǰҪ��ǰ����һ���µĶ����ռ�(��������Ϊ���ڸı�arr2Ԫ�ص�ʱ�򲻻�Ӱ��arr1��Ԫ��ֵ)
			      2.arr2�������µĶ����ռ�֮���ٰ�arr1�ĵ�ַ��ֵ��arr2,��ʵ���˵�arr2���е�Ԫ�ظı�󲻻�Ӱ��arr1�ڵ�Ԫ��ֵ
		*/
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[arr1.length];//����һ�������ռ�,��СΪarr1һ���Ŀռ��С
		
		//��arr1��ÿ��Ԫ�طŵ�arr2�ĵ�ַ��
		for(int c = 0;c < arr1.length;c++){
			arr2[c] = arr1[c];
		}
		

		System.out.println("arr2[2]�ı�֮ǰ��arr1��ֵ:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println("");

		System.out.println("arr2[2]�ı�֮ǰ��arr2��ֵ:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");

		arr2[2] = 100;//�ı�arr2�ĵ�����Ԫ�ص�ֵ
		System.out.println("arr2[2]�ı�֮���arr1��ֵ:");
		for(int j =0;j < arr1.length;j++){
			System.out.print(arr1[j] + " ");
		}
		System.out.println("");
		
		System.out.println("arr2[2]�ı�֮���arr2��ֵ:");
		for(int j =0;j < arr1.length;j++){
			System.out.print(arr2[j] + " ");
		}
	}
}