import java.util.Scanner;
public class Method03{
	public static void main(String[] args) {
		/*
		����:�ó�Ա�����Ѵ�ӡ��λ����Ĺ���ʵ��
		�ŵ�:ʹ�Լ��ĵĴ����ظ��Խ���
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("�����ά����ĳ���n:");
		int n = input.nextInt();
		System.out.println(); 
		//����һ�������ά���鳤��,������ӡֱ��������״�Ķ�ά����Ĺ���T1
		Tool01 t1 = new Tool01();
		System.out.println("��һ�ζ�ά�����ӡ:");
		t1.arrTow(n);
		System.out.println("�ڶ��ζ�ά�����ӡ:");
		t1.arrTow(n);
		System.out.println("�����ζ�ά�����ӡ:");
		t1.arrTow(n);
	}
}
//�ƶ�һ��������
class Tool01{
	//��Ա����������ά����
	//i:��ά������±�  j:һά������±� n:��Scanner�Ѷ�ά����ĳ����������
	public void arrTow(int n) {
		int[][] arr = new int[n][];//����һ���¶�ά����
		for(int i = 0; i < arr.length;i++){
			arr[i] = new int[i + 1];//����һά����Ŀռ� 
									/*
									  0�� �� 1��
									  1�� �� 2��
									  2�� �� 3��
									*/

			for(int j = 0;j < arr[i].length;j++){
				arr[i][j] = j + 1;
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

	}
}