public class HomeWork08{
	public static void main(String[] args) {
		/*
			Ŀ��:���1-1/2+1/3-1/4...1/100�ĺ�
		*/
		double sum = 0;
		int k = 1;//һ��ʼΪ��
		for(double i = 1;i <= 100;i++){
				sum += 1/i * k;
				k = -k;//���
		}
		System.out.println("1-1/2+1/3-1/4...1/100�ĺ�Ϊ:" + sum);
	}
}