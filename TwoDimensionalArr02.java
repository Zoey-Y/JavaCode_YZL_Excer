import java.util.Scanner;
public class TwoDimensionalArr02{
	public static void main(String[] args) {
		/*
		Ҫ��:�Լ�̽���Ķ�ά����
			1.�Լ�����(1,1 2,1 2 3),����ӡһ��
			    1
			    1 2
			    1 2 3
			��ͼ��.    
		*/
		Scanner input = new Scanner(System.in);

		//����һ��ֻ֪����λ�����Ԫ��������֪��ÿ��һά�����Ԫ�ص�����
		int[][] arr = new int[3][];

		//������ά����
		for(int i = 0;i < arr.length;i++) {
			arr[i] = new int[i + 1];//i = 0����>��1���ռ䣻 i = 1 ����>��2���ռ� ......//����һ���ռ��ĸ��ֽ�(��Ϊ��int)
									//arr[i]ָ����ĳһ��һά����,����newһ����Ϊ��Ϊ���һά���鿪��һ���µĿռ� 
									//����һ���µ�һά����������eg: int[] arr = new int[3];
						System.out.print("�����" + (i + 1) + "�����������:");
						//�����ڲ�һά����,�Ը�ֵ�ķ�ʽ����Ԫ��
						for(int j = 0; j < arr[i].length;j++) {//arr[i].length��������һά����Ŀռ��С
							arr[i][j] = input.nextInt();//���������һά���鸳��ֵ
						}
			}

			//��ӡ���
			System.out.println("��ӡ�����:");
			for(int i = 0;i < arr.length;i++){
				for(int j = 0;j < arr[i].length;j++){
					System.out.print(arr[i][j] + " ");
				}		
				System.out.println("");//����,֮����ִ�ж�ά����ĵڶ���Ԫ��(Ҳ���ǵڶ���һά����)
		}
	}
}