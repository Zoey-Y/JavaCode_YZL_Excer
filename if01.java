import java.util.Scanner;
public class if01{
	public static void main(String[] ags){
		/*
		Ҫ��
		   ��дһ�� ���������˵����䣬�����ͬ־���������18�꣬
		   �����"����������18,Ҫ���Լ�����Ϊ����",��С��18�����"�ú�ѧϰ��������"
  		˼·��
  		1.����һ��Scanner����,�������������
  		2.�ж�����������������18,�������"����������18,Ҫ���Լ�����Ϊ����"
  		  ���С��18�������"�ú�ѧϰ��������"
  		3.����ӡ���  
		*/
		Scanner input = new Scanner(System.in);//����һ��Scanner�෽�� ����input
		System.out.println("please entry your age >:");
		int age = input.nextInt();
		if( age >= 18 ){//&&��·�÷�,һ�����
			System.out.println("����������18,Ҫ���Լ�����Ϊ����");
		}else if(age < 18 ){
				System.out.println("�ú�ѧϰ��������");
		}
	

	}
}