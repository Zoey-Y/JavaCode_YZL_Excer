public class CopyAddress{
	public static void main(String[] args) {
		/*
		���鸳ֵ���ƶ�:
			��ַ����/���ô���/���ø�ֵ:
		֪ʶ��:
			1.�����ڽ��� ���ô��� ʱ, ���� ջ �ж� ����ĵ�ַ ���д��ݵ�.
			2.�������ַ�����˵�����,(���ַ�����������ݵ������ַһ��) ���Ըı�����Ԫ��ʱ�ǹ�ͬ�ı��.
			3.���ִ��ݷ�ʽ���ݿռ䲻�Ƕ�����,Ҳ�������(2.)��һ����ȫ�ĵľ���
		*/
		int[] arr1 ={1,2,3};
		int[] arr2 = arr1;//��arr1�ĵ�ַ��ջ�и��Ƹ���arr2,���arr2��ӵ����arr1��ַ�ڵ�����Ԫ�ز���arr2��ַ��Ԫ��λ����arr1һ��
		System.out.println("�ı�ǰ��arr2����:");
		for(int j = 0;j < arr1.length;j++){
			System.out.print(arr2[j] + " ");

		}
		System.out.println("\n");
		System.out.println("�ı�ǰ��arr1����:");
		for(int j = 0;j < arr1.length;j++){
			System.out.print(arr1[j] + " ");

		}
		System.out.println("\n");

		//��arr2 �ı�����һ��ֵeg:
		arr2[1] = 10;//��ʱ�ڶ���(&arr1 == &arr2)�ĵڶ���Ԫ�ظı����10,����arr1�ĵڶ���Ԫ��Ү���Ÿı�(��Ϊ��ַ��ͬ���иı���ͬ)
		System.out.println("�ı���arr2����:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n");
		System.out.println("�ı���arr1����:");
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}


	}
}