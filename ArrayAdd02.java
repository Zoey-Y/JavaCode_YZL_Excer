import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args) {
		/*
		Ҫ��:ʵ�ֶ�̬�ĸ��������Ԫ��Ч��,ʵ�ֶ���������
			(1)ԭʼ����ʹ�þ�̬����int[] arr = {1,2,3};
			(2)���ӵ�Ԫ��4,ֱ�ӷ�����������arr = {1,2,3,4};//����Ϊ��:�����ڱ���Լ���ӵ���
			(3)�Ƿ�������,y/n
		˼·2:
			1.�Ƚ�ԭʼ�����ʼ��
			2.�����µ�����,�ռ��С��ԭʼ�����һ
			3.�Ƚ����������Ԫ�ظ���������
			4.�ٽ���������������һ��Ԫ�ؿռ丽���µ�ֵ(4)
			5.�����µ����鸳���ɵ�����(�����Ϳ��������µ�Ԫ�ؿռ丳���ɵ�����ռ�)
			6.��ӡ

			7.��Ϊ����ִ��1~5�Ĳ���(����Ҫִ��һ�εĲ���),����Ҫ��Ҫ����,������do_while�ķ���
			8.����һ��Scanner��������ӵ�����  
			9.�ж����Ƿ����������Ԫ�ص���Ըy/n
			
		*/
//8.����Scanner������
		Scanner input = new Scanner(System.in);
		//1.�Ƚ�ԭʼ�����ʼ��
		int[] arr = {1,2,3};
//7.��do_while����
		do{
			
					//2.����һ���������С��arr��һ
					int[] arrNew = new int[arr.length + 1];
					//3.�Ƚ�arr���������arrNew
					for(int i = 0;i < arr.length;i++){
						arrNew[i] = arr[i];
					}
					//4.�����������Ŀռ丳ֵ��һ����ֵ4(�Ժ��ٻ���Ϊ��)
						
						//8.����Ϊ��:���û���������Ҫ��ֵ
						System.out.print("������Ҫ��ֵ:");
					    int userNum = input.nextInt();
					arrNew[arrNew.length - 1] = userNum;//7.���û��������ֵ����arrNew���һ���ռ�

					//5.�������鸳��������,�������ַ���и�ֵ�Ϳ�����
					arr = arrNew;
					//6.��ӡ������Ԫ�غ��������
					for(int i = 0;i < arr.length;i++){
						System.out.print(arr[i] + " ");
					}
					//9.ѯ���û��Ƿ���������Ԫ��
					System.out.println("�Ƿ���������Ԫ��y/n");
					char userWant = input.next().charAt(0);
					//9.�ж��û��Ƿ������Ԫ��
					if(userWant == 'n'){
						break;
					}

				}while(true);
				
				System.out.println("�Ѿ��������");


	}
}