/*���ڰ����������ѧϰ�ں���*/
import java.util.Scanner;//����java.util���µ�Scanner�� ��������> Step:1
public class ScannerExercise01{
	public static void main(String[] args){
		/*�ӿ���̨�����û���Ϣ,[����,����,нˮ]*/

		//new��ʾ����һ������,�����Ǵ���һ��Scanner���󡪡�����>Step:2
		Scanner input = new Scanner(System.in);//input�����մ���������
		System.out.print("����������\n ���� >:");
		//��ִ�е�next()����ʱ����ȴ��û�����
		String name = input.next();//next()�����ǽ����û�������ַ���
		System.out.print(" ���� >:");
		int age = input.nextInt();//nextInt()���պ�����int����
		System.out.print(" нˮ >:");
		double salary = input.nextDouble();//nextDouble()���պ�����Double����
		System.out.println("����\t����\tнˮ");
		System.out.println(name + "\t" + age + "\t" + salary );
	}
}