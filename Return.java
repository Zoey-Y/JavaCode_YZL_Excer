public class Return{
	public static void main(String[] args) {
		for(int i = 1;i <= 4;i++ ){
			for(int j = 1;j <= 5;j++){
				if(j == 2){
					System.out.println("Ҫ��ɶ");
			//���ڷ�����ʹ��return,���ʾ�����÷���
			//����main������ʹ��return,���ʾֱ���˳�����		
					return;//��ʱֱ����main������ʹ������ֱ���˳�����
				}
				System.out.println("wwww");
			}
			
		}
	}
}