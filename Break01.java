public class Break01{
	public static void main(String[] args) {
		/*
		Ŀ��:
			1.�������һ��1 ~ 100 �������,ֱ������97,
				����һ�������˶��ٴ������
			    ��ʾʹ��:(int)(Math.random()*100)+1 �����������
		*/

		//ͳ�Ʋ��������������,����ѭ���ڶ����ѭ����ʼ��,û����ͳ��Ч��
		int countR = 0;
		for(;;){//while(true)Ҳ��
			//ѭ�����������
			int random = (int)(Math.random()*100 + 1);
			
				if(random != 97){
					System.out.println(random);
					countR++;
				}else{
					System.out.println(random);
					countR++;
					break;	
				}

		}
		System.out.println("һ�������:" + countR);
	}
}