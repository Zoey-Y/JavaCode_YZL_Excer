import java.util.Scanner;
public class Do_While01{
	public static void main(String[] args){
		/*
		Ŀ��:
			1.�����������Ǯ,�Ϻ���һֱ��������
			2.��������˵��Ǯ
			[Ҫ��:��do..while����]
		˼·:
			1.�Ϻ���ʹ��������,��һֱ������������Ǯ
			2.���������Ļش�
			3.�ж������Ļش��Ƿ�Ǯ
			4.�� ��ѭ����ͨ��
			5.�� ��ѭ������
		*/
		Scanner input = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("�Ϻ�ʹ����������");
			System.out.println("�Ϻ���:������Ǯ>:y/n");
			//���ջش�,�����answer�������ٴ˴�����,while����ղ���,Ӧ����ѭ���ⲿ���壬ѭ���ڲ���ֵ
			answer = input.next().charAt(0);	

					if(answer != 'y' && answer != 'n'){
						System.out.println("��Ļش�����������");
					}

		}while(answer != 'y');
		System.out.println("������˵Ҫ��Ǯ������ʱ������");

	}
}