import java.util.Scanner;
public class MultipleCricles01{
	public static void main(String[] args){
		/*
		Ŀ��:
			1.ͳ�Ƹ���ɼ����,ÿ����5��ѧ��
			2.����������ƽ����
			3.������а༶ƽ����
			4.ͳ�Ƽ�������
		˼·:
			1.���벢���ո����༶��ѧ���ɼ�
			2.ѭ������1 ~ 3���༶
			3.�ڰ༶�ڲ�ѭ������ѧ������
			4.�Խ��յĳɼ��ж��Ƿ񼰸��Դ�ͳ��ÿ���༰������
			5.ÿ���༰�������Ľ���ۼ������Դ���ͳ�����а༶��������
		*/
		Scanner input = new Scanner(System.in);
		
		int claAll = 3;//�༶����
		int cla = 1;//һ�ڸ��༶   
		int stuNum = 5;//ÿ���༶��ѧ������
		int stuFir = 1;//��һ��ѧ��
		double averStu = 0.0;//�����ƽ���ɼ�
		double averClass = 0.0;//���а༶��ƽ���ɼ�	
		double sumStu = 0.0;//ѧ���ɼ�֮��
		double sumClass = 0.0;//�༶�ɼ�֮��
		int count = 0;//ͳ�Ƽ�������
			for(int clasNum = cla;clasNum <= claAll;clasNum++){
				System.out.println("����"+ clasNum +"���5λѧ���ɼ�:");		
					
					for(int stu = stuFir; stu <= stuNum;stu++){
						
						double score = input.nextDouble();
								
								if(score >= 0 && score <= 100){
											switch((int)score / 60){
												case 1:
													count++;
													break;
												case 0:
													break;	
											}
							}else{
								System.out.println("������ķ��������ϱ�׼");
							}

							 sumStu += score;
					}
				 sumClass += sumStu;
				System.out.println(clasNum + "���ƽ����:" + sumStu / stuNum);
			}
			System.out.println("���а��ƽ����:" + sumClass / claAll);
			
			System.out.println("���а༶��������֮��:" + count );


	}
}