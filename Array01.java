public class Array01{
	public static void main(String[] args) {
		/*
		��Ŀ:������������ֻ��,�ֱ���3kg,5kg,1kg,3.4kg,2kg,50kg.
			1.����ֻ����������
			2.��ƽ������
		����Ϊʲôʹ��Array��˼·:
			1.������弦������
			2.���������غ�ƽ������
			�ܽ�:����һ��һ������Ч�ʵ�,���ѧϰ���鼼����������б�Ҫ
			*/
		/*//������弦������
		double hen1 = 3;
		double hen2 = 5;
		double hen3 = 1;
		double hen4 = 3.4;
		double hen5 = 2;
		double hen6 = 50;

		//�󼦵�������
		double alWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		//��ƽ������
		double averWeight = alWeight / 6;
		System.out.println("����������:" + alWeight +"kg"
						+ "����ƽ������:" + averWeight +"kg");*/

		//������ķ�ʽ
		//�������������ͬԪ�ذ�����һ��
		double hens[] ={3,5,1,3.4,2,50,43};
		//��( ������.length )��ʾ���鳤��
		System.out.println("hens����ĳ�����:" + hens.length);
		double alWeight = 0;
		//��������Ԫ��
		for(int i = 0;i < hens.length;i++){
			//��hens[�±�](�±��0��ʼ��ŵ�)����ʽָ�������ڵ�Ԫ��
			System.out.println("��"+ (i+1) + "������������:" + hens[i]);
			 alWeight += hens[i];//�Լ����������
		}
		System.out.println("������:" + alWeight + "ƽ������:" + (alWeight / hens.length));

	}
}