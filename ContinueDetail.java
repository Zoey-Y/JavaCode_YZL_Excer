public class ContinueDetail{
	public static void main(String[] args) {
		label1:
		for(int j = 0 ;j < 4; j++){
					label2:
					for(int i = 0 ;i < 5;i++){
						if(i == 2){
	//�����breakһ��,ֻ����continue��������ת�������õ���һ����ǩ����continue����ע��,����Ĭ����ת�������ѭ��
					 		continue;
						}
							System.out.println(i);
					}
		}
	}
}