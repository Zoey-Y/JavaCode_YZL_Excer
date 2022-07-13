import java.util.Scanner;
public class IfExercise{
	public static void main(String[] args){
		/*1.输入两个double值.判断第一个数大于10.0,
	      且第2个数小于20.0,打印两数之和*/
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





	    /*2.定义两个变量int,判断二者的和,是否能被3又能被5整除,打印信息*/
	   int a1 = 4;
	   int a2 = 6;
	   int sum = a1 + a2;
	   if(sum % 3 == 0 && sum % 5 == 0){
	   	System.out.println(sum);
	   }else{
	   	System.out.println("a1 or a2 coudn't be divisable by 3 or 5 ");
	   }


	    /*
	    判断一个年份是否是闰年,闰年的条件符合下面二者只一:
	       1.年份能被4整除,但不能被100整除
	       2.年份能被400整除
	    */  
System.out.println("===============================================");
	   int year = 2020;
	   if (year % 4 == 0 && year % 100 != 0){
	   	System.out.println(year + "是闰年");
	   }else if(year % 400 == 0){
	   	System.out.println(year + "是闰年");
	   }else{
	   	System.out.println(year + "不是闰年");
	   }
	}
}