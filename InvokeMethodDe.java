 import java.util.Scanner;
 public class InvokeMethodDe{
 	public static void main(String[] args) {
 		/*
 		��������ϸ��:
 		*/
 		Scanner input = new Scanner(System.in);
 		System.out.print("enter your age:");
 		int age = input.nextInt();
 		System.out.println();

 		System.out.print("enter your name:");
 		String name = input.next();
 		System.out.println();

 		System.out.println("Did you having completed the programmes?");
 		System.out.print("yes enter 'y', no enter 'n':");
 		String i = input.next();
 		System.out.println();
 		//ʵ��������
 		executor p1 = new executor();
 		p1.crePerson(age,name,i);//��ʱ����Ķ���ʵ��
 	}
 }
 /*ϸ��1:��executor ���Ե��� ��person�еķ���
		1.��ͬһ�����е��÷�������ֱ�ӵ���
		2.��һ�����е�����һ����ķ���
		  ��Ҫ��ʵ����,�ٵ���
 */
class person{
	//����
	String name;
	int age;
	//����
	public void task(String i,String name){
		if(i.equals("y")){
			System.out.println(name + " having completed this programmes.");
		}else if(i.equals("n")){
			System.out.println(name + " have not completing the programmes.");
		}else{
			System.out.println("you enter mistake");
		}
	}
}

class executor{	
	public void crePerson(int age,String name,String i){
		person creator = new person();//����person��Ӧ����ʵ����һ����
		creator.name = name;
		creator.age = age;
		System.out.println("����:" + name + "\t" + "����:" + age);
		creator.task(i,name);//���������person�е�task����
	}
}