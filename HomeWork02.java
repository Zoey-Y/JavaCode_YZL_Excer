import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args) {
		/*
			Ŀ��:ʵ��һ���ж�����,�����ĸ���Χ: >0 ; <0 ; =0
			˼·:
				1.Scannerʵ�������������/��������(int)(Math.random)*100 + 1�ķ�ʽ�����Ūһ��100���ڵ�
				2.�жϷ�Χ
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("���������һ������>:");
		int data = input.nextInt();//char word = input.next().At(0);
			if(data > 0){
				System.out.println("�������������0");
			}else if(data < 0){
				System.out.println("���������С��0");
			}else if(data == 0){
				System.out.println("�������������0");
			}else{
				System.out.println("���������������Ҫ��");
			}
	}
}