public class HomeWork06{
	public static void main(String[] args) {
		/*
			Ŀ��:���1~100֮��Ĳ��ܱ�5��������,ÿ5��һ��
		*/
				int count = 0;//ͳ��ÿ�и���
				for(int i = 1; i <= 100;i++){
						
							if(i % 5 != 0){//���㲻�ܱ�����������
									System.out.print(i + " ");
									count++;
							}
							count %= 5;//����ÿ�и���
							switch(count){
							case 0:
								System.out.println("");//���Լ����뵽���ֱ�����
							default:
								break;
							}
						
				}
	}
}