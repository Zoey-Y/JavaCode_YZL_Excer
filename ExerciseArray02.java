public class ExerciseArray02{
	public static void main(String[] args) {
		/*
		Ŀ��:���һ������int[]�����ֵ{4��-1��9��10��23},���õ���Ӧ���±�
		*/
		int[] alNum ={4,-1,9,23,10};
		int max = alNum[0];//����alNum[0]�����ֵ
		int count = 0;//�������ֵ���±�
		for(int i = alNum.length - 1;i >= 0 ;i--){//�����һ����ʼ��ǰ��			

			max = max > alNum[i]? max : alNum[i];
			int p = max > alNum[i]? 1 : 0;//�ж����ֵ���±�:�ȿ����Ƚϵ����ֵ�Ƿ�仯
			//����仯�˾�˵���±����,countҪ��������±�,�����±����0
			switch(p){
				case 1:
					break;
				case 0:
					count = i;
					break;
			}
			
		}
		System.out.print("alNum��������ֵ��:" + max + "��Ӧ�±���:" + count);

	}
}