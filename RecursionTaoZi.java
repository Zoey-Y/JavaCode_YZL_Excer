public class RecursionTaoZi{
	public static void main(String[] args) {
		/*
		��Ŀ:��һ������,
		����һ���������ӵ�һ���һ��,
		�Ժ�ÿ�춼����.
		������ʮ��ʱ,����ֻ��һ��������
		�������м�������

		˼·����:
			1.��ʮ��ʱ Ϊ1��.
			2.�ھ���ʱ Ϊ �ھ�������� = (��ʮ������� + 1) * 2
			//����day10 = day9 / 2 - 1 ����>day10 = 1;   
			//����:day9 = (day10 + 1) * 2;
		*/
		Taozi originalSum = new Taozi();
		int sum = originalSum.Taozi(1);//����1����Ϊ�ӵ�һ�쿪ʼ�����ж�
				/*forѭ����˼������һ����:
				  ����1���ε��β�����Ǵ�1��ʼѭ��һֱ����������
				  10��Ϳ����ҵ���ʮ��ʣ��һ�����ӵ���֪����
				 */

			if (sum != -1) {
				System.out.println("���ʱ��" + sum + "������");
			}
		
	}
}
class Taozi{	
	public int Taozi(int day){
		if(day == 10){
			 return 1;//��֪��ʮ��ʣ�µ���1
		} else if(day >= 1 && day <= 9){ 
			return (Taozi(day + 1) + 1) * 2;
		} else {
			System.out.println("�����������:");
			return -1;
		}
		
	}
}