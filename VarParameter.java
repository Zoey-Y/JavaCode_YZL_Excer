public class VarParameter{//variable parameter:�ɱ����
	public static void main(String[] args) {
		/*
			�ɱ��������:Java���� ͬһ�����У���� ͬ����ͬ���ܣ�
			���ǲ���������ͬ�ķ���,��װ��һ��������
		����:����Ҫ�ֱ�ʵ������������ӣ������������    
			(�﷨: �������η� + �������� + ������(��������...�β���){������})
			һ��ķ���:
			  class T{
				public int sum(int a,int b){
					return a + b;
				}
				publc int sum(int a,int b,int c){
					return a + b + c;
				}
				//���������ĸ�....������Ӿ�Ҫд�ܶ���鷳,���������variable parameter
			  }          
		*/
		T t = new T();
		System.out.println(t.Var(1,4));
	}
} 
class T{
			  	//����:
			  	//int...��ʾ���յ��ǿɱ����,������int(���ǿ��Խ���0�������int����)
					public int Var(int...nums){//nums�ǿռ�ĵ�ַ��
						int sum = 0;
						System.out.println("���յ���" + nums.length + "������");
						for(int i = 0;i < nums.length;i++){
							 sum += nums[i];
						}
						return sum;
					}
			  }