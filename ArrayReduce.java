import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args) {
		/*
		Ҫ��:��һ������{1,2,3,4,5},���Խ��������������
		     ��ʾ�û��Ƿ��������,ÿ���������һ��Ԫ�ء�
		     �����������һ��Ԫ��ʱ��ʾ������������
		 ˼·:
		 	1.��ʼ��һ��arr����{1,2,3,4,5}
		 	2.����һ����ԭ������һ���ռ������[arr.length - 1]
		 	3.forѭ�����µ����鸳ֵ���ɵ�������
		 	4.���µ������ַ���������ַ(Ϊ�˸��¼��ٹ��������ռ�)

		 	5.�Ƿ���������ռ�do_while
		 	6.���ٵ����һ���ռ��򲻼�������

		 */
		Scanner input = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
				do{
					    //���ò��ϸ�������ռ�
						int[] arrN = new int[arr.length - 1];
						//�ж����鳤�ȵ���1��,����1�Ͳ�ִ�м��ٿռ�
						if(arrN.length != 1){
						System.out.println("�ռ����֮��Ľ��:");
						//���ٿռ�Ĳ���
							for(int i = 0;i <= arrN.length - 1;i++){
									arrN[i] = arr[i];
							}
							arr = arrN;//���µĸ����ɵ�
						}
					
						//��ӡ���
						for(int i = 0;i <= arrN.length - 1;i++){
							System.out.print(arr[i] + " ");
						}
						System.out.println("�Ƿ�������ٿռ�y/n");
						char user = input.next().charAt(0);
								if(user == 'n'){
									break;
								}else if(user == 'y'){
									continue;
								}else{
									System.out.println("�����룡����ֱ�ӽ���");
									break;
								}

					}while(true);
					System.out.println("�Ѿ��˳���");
		

			
		
	}
}