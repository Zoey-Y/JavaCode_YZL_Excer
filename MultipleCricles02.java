public class MultipleCricles02{
	public static void main(String[] args){
		/*
			Ŀ��:
				1.��ӡ�˷��ھ���
			˼·:
				1.��forѭ��������д
				2.���˵���,������ѭ��9-iΪ���շ�Χ
		*/
	int mul = 0;
		for(int i = 1; i <= 9;i++){
			for(int j = 1;j <= i; j++){
				mul = i * j;
				System.out.print( i + " * " + j + " = " + mul +" ");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}