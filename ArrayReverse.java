public class ArrayReverse{
	public static void main(String[] args) {
		/*
		Ҫ��:��arr����{1,2,3,4} ��ת�� {4,3,2,1}

		˼·:(ջ�ڷ�ת)
			1.arr[0] = arr[3];
			  arr[1] = arr[2];
			2.��ת����arr.length / 2 = 2;
			3.arr[0] = arr[arr.length - 1 - i];//i���±�
			  arr[0] =      arr[ 4	  - 1 -	0 = 3]
		 */
		int[] arr = {1,2,3,4};
		int tmp = 0;//��ʱ���arr[i]
		int len = arr.length;
		System.out.println("��תǰ��arr:");
		for(int j = 0 ;j < len;j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println("");
		//��ʼ��ת
		for(int i = 0;i < len / 2;i++){//���������ļ���
			  tmp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = tmp;
		}

		System.out.println("��ת���arr:");
		for(int i = 0;i < len;i++){
			System.out.print(arr[i] + " ");
		}

	}
}