public class WhileExercise01{
	public static void main(String[] args){
		/*
		Ŀ��:
			1.����whlieѭ�����10��"���"
		*/
					// int i = 1;
					// while(i <= 10){
					// 	System.out.println("���");
					// 	i++;
					// }
					// System.out.println("ѭ�����˳�");
		/*
			Ŀ��:
				1.��ӡ1 ~ 100֮�������ܱ�3��������[ʹ��whileѭ��]
			˼·:
				����Ϊ��:
				1.�ȴ�ӡ1 ~ 100����
				2.�����ܱ�3��������
				�������:
				1.�ñ����������������Ժ�ѭ������
		*/
					int i = 1;//����޶�
					int n = 100;//����޶�
					int t = 3;//����
					while(i <= n){
						if(i % t == 0){
							System.out.println("i = " + i);
						}
						i++;//�����ĵ���
					}
	}
}