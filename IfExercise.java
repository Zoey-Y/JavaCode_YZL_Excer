import java.util.Scanner;
public class IfExercise{
	public static void main(String[] args){
		/*1.��������doubleֵ.�жϵ�һ��������10.0,
	      �ҵ�2����С��20.0,��ӡ����֮��*/
	      System.out.println("Please input two Double Number>:");
	      Scanner input = new Scanner(System.in);

	      double n1 = input.nextDouble();
	      double n2 = input.nextDouble();
	      if(n1 >= 10.0 && n2 <= 20.0){
	      	double sum = n1 + n2;
	      	 System.out.println(sum);
	      }else {
	      	 System.out.println("n1 or n2 are not within the calculation range");
	      }

	     

System.out.println("=========================================");





	    /*2.������������int,�ж϶��ߵĺ�,�Ƿ��ܱ�3���ܱ�5����,��ӡ��Ϣ*/
	   int a1 = 4;
	   int a2 = 6;
	   int sum = a1 + a2;
	   if(sum % 3 == 0 && sum % 5 == 0){
	   	System.out.println(sum);
	   }else{
	   	System.out.println("a1 or a2 coudn't be divisable by 3 or 5 ");
	   }


	    /*
	    �ж�һ������Ƿ�������,��������������������ֻһ:
	       1.����ܱ�4����,�����ܱ�100����
	       2.����ܱ�400����
	    */  
System.out.println("===============================================");
	   int year = 2020;
	   if (year % 4 == 0 && year % 100 != 0){
	   	System.out.println(year + "������");
	   }else if(year % 400 == 0){
	   	System.out.println(year + "������");
	   }else{
	   	System.out.println(year + "��������");
	   }
	}
}