public class Break02{
	public static void main(String[] args){
		/*
		Ŀ��:
			     1-100���ڵ������,��� ���� ��һ�� ���� 20�ĵ�ǰ��
		˼·:   
			     1.ѭ��1-100���ڵ���,���sum
			     2.sum > 20ʱ,��¼��ǰ����break
		*/
	int sum = 0;	
		for(int num = 1; num <= 100;num++){
			sum +=num;
				if(sum > 20){
			   		System.out.println("��һ�δ��� 20 �ĵ�ǰ����:" + num);
					break;		
				}
		}
	}
}