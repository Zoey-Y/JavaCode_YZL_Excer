import java.util.Scanner;
public class PascalTriangle{
	public static void main(String[] args) {
		/*
		����:ʹ�ö�ά�����һ���Լ���������,��ӡ�����������������
		����Ϊ��:����
			1				----------arr[0][0] == 1	
			1 1 			----------arr[1][0] == 1  ;  arr[1][1] == 1
			1 2 1 			----------arr[2][0] == 1  ;  arr[2][1] == 2  ; arr[2][2] == 1
			1 3 3 1 		----------arr[3][0] == 1  ;  arr[3][1] == 3  ; arr[3][2] == 3 ;arr[3][2] == 1
			1 4 6 4 1 	    ----------arr[4][0] == 1  ;  arr[4][1] == 4  ; arr[4][2] == 6 ;arr[4][3] == 4 ;arr[4][4] == 1  
			
			1.ÿ�еĵ�һ�������һ������1
			2.����i �� j ������,arr[i][j] == arr[i - 1][j] + arr[i - 1][j - 1];
			3.�ڼ��о��м���Ԫ�� 
		*/
		/*����Ϊ��:
		int[][] arr = new int[5][];
		for(int i = 0;i < arr.length;i++){
			arr[i] = new int[i + 1];
			for(int j = 0;j < arr[i].length;j++){
				if(j == 0 || i == j){//���ĳ�еĵ�һ������ĳ�е����һ��Ԫ�صĻ�����Ϊ0
					arr[i][j] = 1;
				}else {//�����ľͰ���(2��)����˼��
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}*/



		System.out.print("��������Ҫ��������ǵ�����:");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		int[][] arr = new int[user][];//Ϊ��ά���鴴��һ���¿ռ�
		for(int i = 0; i < arr.length;i++){
			arr[i] = new int[i + 1];//һά����:�Ƕ����о��ж��ٿռ�(3��)
			for(int j = 0;j < arr[i].length;j++){//�������ڲ���һά�����Ԫ��(�����ж��ٸ�Ԫ��)
				if(j == 0 || i == j){
					arr[i][j] = 1;//(1��)
				}else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];//(2��)
				}
				System.out.print(arr[i][j] + " ");//��ӡд������ѭ����һ�������ӡ
			}
			System.out.println("");
		}

		//��������һ��forѭ����ӡ�ǵ���ѭ�������ٴ�ӡ
		

	}
}