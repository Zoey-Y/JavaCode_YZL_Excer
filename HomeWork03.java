import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args) {
		/*
		Ŀ��:�ж�һ������Ƿ�Ϊ����
		˼·:
			1.�������:year�ܱ�400����
			2.year�ܱ�4������������100����
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�����>:");
		int year = input.nextInt();
		
		int judge = year % 4 == 0 && year % 100 !=0? 1 : 0;
			switch(judge){
			case 1:
				System.out.println(year+"������");
				break;
			case 0:
				if(year % 400 ==0){
					System.out.println(year + "������");
				}	else{
					System.out.println(year + "��������");
				}
				break;
			


			}
	}
}