public class HomeWork09{
	public static void main(String[] args) {
		/*
		Ŀ��:��1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+100)�Ľ��
		*/
		int sum = 0;
		for(int i = 1;i <= 100;i++){//��100����Ԫ
			for(int j = 1;j <=1; j++){//�ڼ�����Ԫ�ͼӵ���,��sum���ռ���ǰ�ĺ�
				sum += j; 
			}	
			
		}
		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+100)�Ľ��Ϊ:" + sum);
	}
}