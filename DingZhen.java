import java.util.Scanner;
public class DingZhen{
	public static void main(String[] args){
		/*
		Ŀ��:
	      		ʵ�ֵ�½��֤,�����λ���,����û���Ϊ"����",����"666"��ʾ��½�ɹ�,
			������ʾ���м��λ���,ʹ��for+break���
		˼·:
			1.  forѭ��3��,�� (�û���) �� (����) ��ȷ������ѭ����ʾ��½�ɹ�
			2. �������������ʾ���м��λ���
			3.�����λ���ʹ����,������ ����ʾ ��½����������
		*/
		//�ܹ��ĵ�½�������
		Scanner enter = new Scanner(System.in);

		int totalChance = 3;
		int count = 3;//ͳ�ƿ���ʣ�����
		for(int chance = 1; chance <= totalChance ; chance++){  	//����ʹ�õĵ�½�������Ϊchance
			//�˺ţ�
			System.out.println("please enter your account number>: ");
			String account = enter.next();
			//���룺
			System.out.println("please enter your password>: ");
			String passWord = enter.next(); 	
				//�ַ���֮��ıȽ���equal
				/*
					�ַ����Ƚ��﷨��
			        1.     account.equals("����");  �� (���ܻ�д��)��>account.equals("");//accountָ���˿�ָ��
					2.     "����".equals(account); //�Ƽ�:�ɱ����ָ��
				*/
				if("����".equals(account) && "666".equals(passWord)){
					System.out.println("��½�ɹ�!");	
					break;
				}
				     	count--;
						if(count == 0){
					System.out.println("���½�Ĵ���������.");
					break;
					}

					System.out.println("�������,�㻹��"+ count + "�λ���,�������½" );		
				
		}				
		
		
	}
}