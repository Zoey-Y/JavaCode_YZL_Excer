/*��������:
		int[] arr ={1,2,3};
		int len = arr.length;//arr1�ĳ���
		int[] arrNew = new int[len + 1];//����һ���µļӴ���һ���ռ������
		int lenNew = arrNew.length;
			for(int i = 0;i < len;i++){
					arrNew[i] = arr[i];
			}

			arrNew[lenNew - 1] = 4;//���µ��������һ���ռ丳ֵ4
			arr = arrNew;//��arrNew����arr1,ԭ�ȵ�arr1�Զ�����
			System.out.println("����ռ����Ӻ�Ľṹ:");
			for(int i = 0;i < len;i++){
				System.out.print(arr[i] + " ");
			}
		*/
import java.util.Scanner;
public class ArrayAdd01{
	public static void main(String[] args){
		/*
		Ҫ��:ʵ�ֶ�̬�ĸ��������Ԫ��Ч��,ʵ�ֶ���������
			(1)ԭʼ����ʹ�þ�̬����int[] arr = {1,2,3};
			(2)���ӵ�Ԫ��4,ֱ�ӷ�����������arr = {1,2,3,4};
			(3)�Ƿ�������,y/n
		˼·:
			1.��ʼ��ԭ��������
			2.����һ���µ�����������һ���µĿռ�; int[arr1.length + 1]
			3.arrNew����arr1��Ԫ��,�����һ���ռ��Ǿͽ����µ�Ԫ��4//����һ���ռ��������µ�arrNew[arrNew.length-1] = 4
			4.��arrNew����arr1,ԭ�ȵ�arr1�ͱ�����
			5.����Scanner����y/n
			6.��Ϊ����ִ��һ�������Ҳ���do_while����ѭ��
			7.���û�ѡ��y�ͼ���true,��ѡ��n��break����ѭ��,���û��������default�������������������(����Ҫswitch�����ж�)
		*/
		
//1~4���ȵ�ִ������һ��������do_while
		Scanner input = new Scanner(System.in);
	    do{
					int[] arr = {1,2,3};

					//����һ���µ����鿪���µĿռ�,�˿ռ��ԭ���Ĵ�һ
					int[] arrNew = new int[arr.length + 1];

					//��ѭ�����Ƚ�ԭ��������Ԫ�ظ����¿��ٵ�����
					for(int i = 0;i < arr.length;i++){
						arrNew[i] = arr[i];
					}

					System.out.println("����Ҫ��ӵ�����:");
					int myNum = input.nextInt();
					//�¿��ٵ����鲻�ǻ���һ���ռ�������µ�Ԫ����~,ū~���������
					arrNew[arrNew.length - 1] = myNum;
					//��һ�����ǰ��µ����鸳���ɵ�����,�ɵ�����ʹ�����,�˺�ɵ������������µ������ڴ˻���������
					arr = arrNew;
					//��ӡЧ��
					System.out.println("====arr����֮��Ԫ�����====");
					for(int i = 0;i< arr.length;i++){
						System.out.print(arr[i] + " ");
					}
					//�ж��û��Ƿ�������
					System.out.println("�Ƿ�������y/n");
					char user = input.next().charAt(0);
					switch(user){
							case y:
								user = 0;
								break;
							case n:
								user = (int)1;
								break;
							default:
							   System.out.println("�������,�ٴ�����");
							   char user = input.next().charAt(0);
							   continue;
					}

	       }while(true);
	       System.out.print("������ӽ���~");

	}
}