import java.util.Scanner;
public class BubbleSort02{
	public static void main(String[] args) {
		/*
		Ҫ��:�Լ�����һ������,����ð����������
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("����Ҫ�����Ŀռ��С:");
		int len = input.nextInt();
		int[] arr = new int[len];
		System.out.println("����ɼ�:");
		for(int i = 0;i < len;i++){				
			int score = input.nextInt();
			arr[i] = score;
		}
		System.out.println("��ӡδ����ĳɼ�:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		//ð������
		for(int i = 0;i < arr.length - 1;i++){
				for(int j = 0;j < arr.length - 1 - i;j++){
					int tmp = 0;
					if(arr[j] > arr[j + 1]){
						tmp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tmp;
				}
			}
		}
			
		System.out.println("��ӡ�����ĳɼ�:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}

	}
}