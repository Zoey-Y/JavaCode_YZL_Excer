public class HomeWork01{
	public static void main(String[] args) {
		/*
		Ŀ��:
			1.ĳ����100,000Ԫ,û�����Դ�·��,��Ҫ����,��������:
			(1)���ֽ�>50,000ʱ,ÿ�ν�5%
			(2)���ֽ�<=50,000ʱ,ÿ�ν�1000
			��̼�����˿��Ծ������ٴ�·��
			Ҫ��:ʹ��while break��ʽ���
		*/
		/*//��׼��:
		double someone = 100000;//ʣ��Ǯ��
		int count = 0;//ͳ��ͨ��·�ڵĴ���
		while(true){
			if(someone > 50000){
				someone *= 0.95;
				count++;
				System.out.println("----ʣ��Ǯ��Ϊ:" + someone + "----����Ϊ:" +count);
			}else if(someone >= 1000){
				someone -= 1000;
				count++;
				System.out.println("----ʣ��Ǯ��Ϊ:" + someone + "----����Ϊ:" + count);
			}else{
				
				break;
			}

		}
		System.out.println("100000��Ǯ������·��" + count + "��·��" );*/
		





		/*//�ҵķ���1:
		double someone = 100000;//ĳ�˿�ʼ�е�Ǯ��
		int stander = 50000;//�շ�׼��
		double charge = 0;//��ͬ�շ�׼�߷�Χ���շ�Ǯ��
		int count = 0;//ͳ�ƾ����˶��ٴ�·��
						while(someone > stander){
							charge = someone*0.05;
							someone -= charge;//ĳ�˵�Ǯ������
							count++;
							System.out.println("���·��Ϊ:" + charge + "----ʣ��Ǯ��Ϊ:" 
												+ someone + "----����Ϊ:" + count);
							
						}
						
						while(someone <= stander ){
							charge = 1000;
							someone -= charge;
							count++;
							System.out.println("���ʱ��·��Ϊ:" + charge + "----ʣ��Ǯ��Ϊ:" 
												+ someone + "----����Ϊ:" + count);
							if(someone < 1000){
								System.out.println("�Ѿ�ûǮ��·���˰װ�~");
								break;
							}
							
						}
		System.out.println("���ܹ�������" + count +"��·��");	*/	



		
		//�ҵķ���2:	
		int stander = 50000;
			double charge = 0;
			int count = 0;
			for(double someone = 100000;someone > stander;someone -= charge){
				charge = 100000*0.05;
				count++;
							System.out.println("���·��Ϊ:" + charge + "----ʣ��Ǯ��Ϊ:" 
												+ someone + "----����Ϊ:" +count);												
			}
			for(double someone = 100000;someone <= stander;someone -= charge){
				charge = 1000;
				count++;
							System.out.println("���ʱ��·��Ϊ:" + charge + "----ʣ��Ǯ��Ϊ:" 
												+ someone + "----����Ϊ:" + count);
							if(someone < 1000){
								System.out.println("�Ѿ�ûǮ��·���˰װ�~");
								break;
							}
			}
		
			
	}
}