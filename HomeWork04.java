import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args) {
		/*
		Ŀ��:�ж�һ�������Ƿ�Ϊˮ�ɻ�(һ��3λ��),
	        �����λ�����������͵����䱾��.
	        eg:153 = 1*1*1 + 3*3*3 + 5*5*5
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("����һ������>:");
		int num = input.nextInt();
		int cmp = num;	
		int sum = 0;
		while(num > 0){
			sum += (num % 10) * (num % 10) * (num % 10);
			num /= 10;
		}
		if(cmp == sum){
			System.out.println(cmp + "��ˮ�ɻ�");
		}else{
			System.out.println(cmp + "����ˮ�ɻ�");
		}

	}
}