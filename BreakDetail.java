public class BreakDetail{
	public static void main(String[] args){
		/*
		break�б�ǩ��������ʹ��:���Ϳɶ���
		����Ϊ��ǩ����ʾ:
		*/
					/*
					(1)
						label1:
						for(int j = 0 ;j < 4; j++){
							label2:
							for(int i = 0 ;i < 5;i++){
								if(i == 2){
								 	break;//breakĬ���������������һ��ѭ��
								}
								System.out.println(i);
							}
						}
					*/

					/*
					(2)
						label1:
						for(int j = 0 ;j < 4; j++){
							label2:
							for(int i = 0 ;i < 5;i++){
								if(i == 2){
								 	break label1;//��breakָ����ĳһ��ǩ��ֱ�������ñ�ǩ
								} 
								System.out.println(i);
							}
						}
					*/
	}
}