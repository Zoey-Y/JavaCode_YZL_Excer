public class VarparameterExcer{
	public static void main(String[] args) {
		/*
			Ҫ��:����������
			Method 1.�������������ſγɼ�(�ܷ�)
			Method 2.�������������ſγɼ�(�ܷ�)
			Method 3.�������������ſγɼ�(�ܷ�)
			���Ϸ�����װ��һ���ɱ��������
		*/
		R r = new R();
		System.out.println("���ſε��ܷ�:");
		r.Record("���",56,78);
		System.out.println("���ſε��ܷ�:");
		r.Record("����",67,89,56);
		System.out.println("���ſε��ܷ�:");
		r.Record("��v",67,89,56,566,234);
	}
}
class R {
	public void Record(String name,int... score){
		int sum = 0;
		System.out.print("����: " + name + "\t"); 
		for(int i = 0;i < score.length;i++){
			sum += score[i];	
		}
		System.out.println("�ɼ�: " + sum + " ");
	} 
}